package barChart;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

public class MainController implements Initializable {
		
	@FXML
	private BarChart<String, Number> barChart;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		XYChart.Series<String, Number> series = new XYChart.Series<>();
		series.setName("RainFall Volume(ml)");
		series.getData().add(new XYChart.Data<>("Jan", 1));
		series.getData().add(new XYChart.Data<>("Fab", 47.6));
		series.getData().add(new XYChart.Data<>("Mar", 40.5));
		series.getData().add(new XYChart.Data<>("Apr", 76.8));
		series.getData().add(new XYChart.Data<>("May", 160.5));
		series.getData().add(new XYChart.Data<>("Jun", 54.4));
		series.getData().add(new XYChart.Data<>("Jul", 358.2));
		series.getData().add(new XYChart.Data<>("Aug", 67.1));
		series.getData().add(new XYChart.Data<>("Sep", 33));
		series.getData().add(new XYChart.Data<>("Oct", 74.8));
		series.getData().add(new XYChart.Data<>("Nov", 16.7));
		series.getData().add(new XYChart.Data<>("Dec", 61.1));
		
		XYChart.Series<String, Number> series2 = new XYChart.Series<>();
		series2.setName("Rainy Days(day)");
		series2.getData().add(new XYChart.Data<>("Jan", 4));
		series2.getData().add(new XYChart.Data<>("Fab", 8));
		series2.getData().add(new XYChart.Data<>("Mar", 5));
		series2.getData().add(new XYChart.Data<>("Apr", 10));
		series2.getData().add(new XYChart.Data<>("May", 9));
		series2.getData().add(new XYChart.Data<>("Jun", 8));
		series2.getData().add(new XYChart.Data<>("Jul", 17));
		series2.getData().add(new XYChart.Data<>("Aug", 11));
		series2.getData().add(new XYChart.Data<>("Sep", 7));
		series2.getData().add(new XYChart.Data<>("Oct", 9));
		series2.getData().add(new XYChart.Data<>("Nov", 11));
		series2.getData().add(new XYChart.Data<>("Dec", 10));
		
		barChart.getData().addAll(series, series2);
	}
	
}
