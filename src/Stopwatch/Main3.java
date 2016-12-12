package Stopwatch;

import javax.sound.midi.ControllerEventListener;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main3 extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		Timer3 timer = new Timer3(200);
		
// Irgendwo habe ich da etwas noch nicht verstanden... Es zeigt niergends
// einen Fehler, jedoch gibt es bei mir nicht mehrere Stopwachtes....

		
		Stopwatch3 stopwatch1 = new Stopwatch3();
		stage.setTitle("Stopwatch1");
		stage.setScene(new Scene(stopwatch1, 400, 160));
		stage.show();
		
		Stage stage2 = new Stage();
		Stopwatch3 stopwatch2 = new Stopwatch3();
		stage.setTitle("Stopwatch");
		stage.setScene(new Scene(stopwatch2, 400, 160));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

		
	}
