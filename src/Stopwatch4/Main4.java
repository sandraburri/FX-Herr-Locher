package Stopwatch4;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main4 extends Application implements EventHandler<ActionEvent> {

	private MenuItem newI;
	private MenuItem closeI;
	private Stage stage;

	@Override
	public void start(Stage stage) throws Exception {

		this.stage = stage;

		Timer4 t = new Timer4(100);
		
		// was macht das genau? Greift das auf das BorderPane der Stopwatch4 zu
		// und öffnet von dort den timer (t) ?
		final BorderPane stopwatch = new Stopwatch4(t);
		
		// Ist der Befehl für eine MenuBar
		final MenuBar menuBar = new MenuBar();
		final Menu fileM = new Menu("File");
		
		// Bei einer MenuBar sprechen wir von Items, hier erstellen wir das
		// MenuItem New
		newI = new MenuItem("New");
		
		// Damit wir mit dem Item etwas machen können, müssen wir auch hier
		// einen EventHandler setzen
		newI.addEventHandler(ActionEvent.ACTION, this);
		
		// Den Accelerator setzen wir, damit man auch mit einer
		// Tastenkombination arbeiten kann und nicht nur mit der Maus
		newI.setAccelerator(KeyCombination.keyCombination("Ctrl+N"));
		closeI = new MenuItem("Close");
		closeI.setAccelerator(KeyCombination.keyCombination("Ctrl+X"));
		closeI.addEventHandler(ActionEvent.ACTION, this);
		
		// Das fileM bekommt alle Items
		fileM.getItems().addAll(newI, closeI);
		
		// Die menuBar bekommt das fileM. Diese beiden Befehle gehören
		// zusammen
		menuBar.getMenus().addAll(fileM);
		
		// Die menuBar wird so in der stopwatch platziert
		stopwatch.setTop(menuBar);

		Scene scene = new Scene(stopwatch, 300, 300);
		stage.setTitle("Stopwatch");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	// Den eventhandler müssen wir noch definieren, damit bei einer Aktion von
	// uns auch das passiert was wir wollen
	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == newI) {
			Stage newStage = new Stage();
			try {
				start(newStage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (event.getSource() == closeI) {
			Platform.exit();
		}
	}
}