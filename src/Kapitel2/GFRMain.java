package Kapitel2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GFRMain extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		GFR gfr = new GFR();
		stage.setTitle("Cockcroft-Gault-Formel");
		
		// was mozt der da rum? Habe das von der Stopwatch rüberkopiert....
		stage.setScene(new Scene(gfr, 400, 160));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}