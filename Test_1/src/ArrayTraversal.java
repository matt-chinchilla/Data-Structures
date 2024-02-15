import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.LineChart;
import javafx.stage.Stage;

public class ArrayTraversal extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Array Traversal Time");
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Operation");
        yAxis.setLabel("Elapsed time");
        final LineChart<Number,Number> lineChart = new LineChart<>(xAxis,yAxis);

        XYChart.Series series = new XYChart.Series();
        series.setName("Array");

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            long startTime = System.nanoTime();
            System.out.println(array[i]);
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            series.getData().add(new XYChart.Data(i + 1, elapsedTime));
        }

        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}