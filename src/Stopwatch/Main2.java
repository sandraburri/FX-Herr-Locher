package Stopwatch;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main2 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		Stopwatch2 stopwatch = new Stopwatch2();
		stage.setTitle("Stopwatch");
		stage.setScene(new Scene (stopwatch, 400, 160));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}