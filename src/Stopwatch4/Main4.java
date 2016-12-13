package Stopwatch4;

import java.awt.MenuBar;

import javax.sound.midi.ControllerEventListener;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main4 extends Application {
	

	@Override
		public void start(Stage stage) throws Exception {

			Timer4 timer = new Timer4(200);

			Stopwatch4 stopwatch1 = new Stopwatch4();
			stage.setTitle("Stopwatch1");
			stage.setScene(new Scene(stopwatch1, 400, 160));
			stage.show();

			Stage stage2 = new Stage();
			Stopwatch4 stopwatch2 = new Stopwatch4();
			stage2.setTitle("Stopwatch");
			stage2.setScene(new Scene(stopwatch2, 400, 160));
			stage2.show();

			Stage stage3 = new Stage();
			Stopwatch4 stopwatch3 = new Stopwatch4();
			stage3.setTitle("Stopwatch");
			stage3.setScene(new Scene(stopwatch3, 400, 160));
			stage3.show();
			
			final MenuBar menuBar = new MenuBar();
			menuBar.setUseSystemMenuBar(true);
			
			final Menu fileM = new Menu
		}

		public static void main(String[] args) {
			launch(args);
		}
	}
