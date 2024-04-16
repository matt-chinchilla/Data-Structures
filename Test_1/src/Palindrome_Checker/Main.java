import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.LineChart;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    private static List<Integer> sizesList = new ArrayList<>();
    private static List<Double> timesList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
        System.out.println("");

        testPalindromePerformance();
        launch(args);
    }

    public static void testPalindromePerformance() {
        int[] sizes = {10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};

        for (int size : sizes) {
            String str = generateString(size);
            long startTime = System.nanoTime();

            isPalindrome(str);

            long endTime = System.nanoTime();
            double durationInSeconds = (endTime - startTime) / 1_000_000_000.0;
            System.out.println("Size: " + size + ", Time: " + durationInSeconds + "s");

            sizesList.add(size);
            timesList.add(durationInSeconds);
        }
    }

    public static String generateString(int size) {
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append((char) ('a' + (i % 26)));
        }
        return sb.toString();
    }

    public static boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(actual).reverse().toString();
        return actual.equals(reversed);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Palindrome Performance");

        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Size");
        yAxis.setLabel("Time");

        final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Palindrome Performance: Size vs Time");

        XYChart.Series series = new XYChart.Series();
        series.setName("Performance");

        for (int i = 0; i < sizesList.size(); i++) {
            series.getData().add(new XYChart.Data(sizesList.get(i), timesList.get(i)));
        }

        Scene scene = new Scene(lineChart, 800, 600);
        lineChart.getData().add(series);

        stage.setScene(scene);
        stage.show();
    }
}