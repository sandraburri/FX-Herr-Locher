package Stopwatch3;

import java.util.Observable;
import java.util.Observer;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

// Weiterf�hrendes Projekt von Stopwatch 1 hier wird nur noch "Neues"
// kommentiert

// EventHandler<ActionEvent> muss hier implementiert werden, damit die Aktionen
// weiter unten funktionieren. Man k�nnte dies auch eleganter l�sen, siehe
// Beschreibung auf der Folie 11
public class Stopwatch3 extends BorderPane implements Observer,
EventHandler<ActionEvent> {

	// Die folgenden 7 Zeilen sind Instanzvariablen
	// private static Timer3 timer = new Timer3(100);
	// Wenn alle Stopuhren �ber die gleiche Instanz laufen sollen, dann m�ssen
	// wir static schreiben, dann gilt 1 Instanz f�r alle => Alle machen die
	// gleiche Aktion gleichzeitig
	private Timer3 timer = new Timer3(100);
	private BorderPane root;
	private Button start;
	private Button stop;
	private Button reset;
	private Label clock;
	private Label zustand;

	// Ab hier bis zum n�chsten Kommentar ist der Konstruktor
	public Stopwatch3() {
		
		// Bindet den Timer an das Objekt Observer
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

	// das ist der Actionsh�ndler, da wird definiert was passiert wenn wir
	// die einzelnen Kn�pfe anklicken... Die Infos dazu sind in der Timerklasse
	// zu finden
	public void handle(ActionEvent event) {
		if (event.getSource() == this.start) {
			timer.start();

			// wenn der Knopf a gedr�ckt wird wechselt der Zustand unten links
			// der Text dort passt sich quasi der Knopfaktion an
			zustand.setText("l�uft");
		} else if (event.getSource() == this.stop) {
			timer.stop();
			zustand.setText("gestopt");
		} else if (event.getSource() == this.reset) {
			timer.reset();
			if (timer.isRunning())
				zustand.setText("l�uft");
			else {
				zustand.setText("bereit");
			}
		}
	}

	@Override
	
	// In jedem Zustand werden die Werte an den Observer gemeldet
	public void update(Observable o, Object arg) {
		Platform.runLater(() -> {
			clock.setText(timer.getTimeString());
		});
	}
}