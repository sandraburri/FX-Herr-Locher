package Stopwatch3;

import javax.sound.midi.ControllerEventListener;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main3 extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		Timer3 timer = new Timer3(200);

		Stopwatch3 stopwatch1 = new Stopwatch3();
		stage.setTitle("Stopwatch1");
		stage.setScene(new Scene(stopwatch1, 400, 160));
		stage.show();

		Stage stage2 = new Stage();
		Stopwatch3 stopwatch2 = new Stopwatch3();
		stage2.setTitle("Stopwatch");
		stage2.setScene(new Scene(stopwatch2, 400, 160));
		stage2.show();

		Stage stage3 = new Stage();
		Stopwatch3 stopwatch3 = new Stopwatch3();
		stage3.setTitle("Stopwatch");
		stage3.setScene(new Scene(stopwatch3, 400, 160));
		stage3.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}