package Stopwatch;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Stopwatch stopwatch = new Stopwatch();
		stage.setTitle("Stopwatch");
		stage.setScene(new Scene(stopwatch, 400, 160));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}