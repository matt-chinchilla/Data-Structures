import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PerformanceTester extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Performance Analysis");

        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of Digits");
        yAxis.setLabel("Time (ms)");

        final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Execution Time Analysis");

        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("IncrementLargeInteger");

        // Test inputs of different lengths
        int[] inputSizes = {10, 100, 1000, 10000, 100000, 1000000};
        System.out.println("Execution Times:");
        for (int size : inputSizes) {
            long startTime = System.nanoTime();
            
            // Generate an array of 'size' length with random digits
            Integer[] testArray = ArrayGenerator.generateRandomArrayOfSize(size);
            IntegerIncrementer.incrementLargeInteger(testArray);
            
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds

            series.getData().add(new XYChart.Data<>(size, duration));
            // Print the execution time in scientific notation
            System.out.println("Digits: " + size + " - Time: " + String.format("%e ms", (double) duration));
        }


        Scene scene = new Scene(lineChart, 800, 600);
        lineChart.getData().add(series);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
