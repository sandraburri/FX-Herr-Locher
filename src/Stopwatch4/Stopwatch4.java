package Stopwatch4;

import java.util.Observable;
import java.util.Observer;
import Stopwatch3.Timer3;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Stopwatch4 extends BorderPane implements Observer,
EventHandler<ActionEvent> {

	// Die folgenden 7 Zeilen sind Instanzvariablen
	private Timer4 timer = new Timer4(100);
	private BorderPane root;
	private Button start;
	private Button stop;
	private Button reset;
	private Label clock;
	private Label zustand;

	// Ab hier bis zum nächsten Kommentar ist der Konstruktor
	public Stopwatch4() {
		
		// das ist neu, da verstehe ich nicht was das macht
		this.timer.addObserver(this);
		root = new BorderPane();

		HBox hbox1 = new HBox(10);
		hbox1.setAlignment(Pos.CENTER);
		this.setCenter(hbox1);

		VBox vbox = new VBox(10);
		this.setBottom(vbox);

		HBox hbox2 = new HBox(10);

		Label s = new Label("Sekunden: ");
		clock = new Label("0.0");
		hbox1.getChildren().addAll(s, clock);

		// hier verwenden wir nur noch a, das wurde bereits in der Instanz-
		// variabel definiert, dass dies ein Button ist
		this.start = new Button("Start");

		// Dieser Befehl macht, dass die Buttons bedienbar werden und auch
		// etwas machen
		this.start.addEventHandler(ActionEvent.ACTION, this);
		this.stop = new Button("Stop");
		this.stop.addEventHandler(ActionEvent.ACTION, this);
		this.reset = new Button("Reset");
		this.reset.addEventHandler(ActionEvent.ACTION, this);

		hbox2.setAlignment(Pos.CENTER);
		hbox2.getChildren().addAll(start, stop, reset);

		zustand = new Label("bereit");

		vbox.getChildren().addAll(hbox2, zustand);
	}

	// Ab hier sind es Methoden

	@Override

	// das ist der Actionshändler, da wird definiert was passiert wenn wir
	// die einzelnen Knöpfe anklicken... Die Infos dazu sind in der Timerklasse
	// zu finden
	public void handle(ActionEvent event) {
		if (event.getSource() == this.start) {
			timer.start();

			// wenn der Knopf a gedrückt wird wechselt der Zustand unten links
			// der Text dort passt sich quasi der Knopfaktion an
			zustand.setText("läuft");
		} else if (event.getSource() == this.stop) {
			timer.stop();
			zustand.setText("gestopt");
		} else if (event.getSource() == this.reset) {
			timer.reset();
			if (timer.isRunning())
				zustand.setText("läuft");
			else {
				zustand.setText("bereit");
				
// Irgend etwas ist bei uns falsch programmiert... Beim Dozenten ist es so, dass
// er start drückt, dann stop und dann reset. wenn er reset gedrückt hat nach
// dem stop heisst es bei ihm unten links dann auch resetet und nicht wie bei
// uns bereit.... Müssten oder können wir das noch korrigieren? 

			}
		}
	}

	@Override
	
	// Observable o, Object arg das ist neu, da verstehe ich nicht was das macht
	public void update(Observable o, Object arg) {
		Platform.runLater(() -> {
			clock.setText(timer.getTimeString());
		});
	}
}
