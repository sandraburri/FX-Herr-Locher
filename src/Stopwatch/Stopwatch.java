package Stopwatch;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

// Weiterführendes Projekt von Stopwatch 1 hier wird nur noch "Neues"
// kommentiert oder Fragen geklärt....

// EventHandler<ActionEvent> muss hier implementiert werden, damit die Aktionen
// weiter unten funktionieren. Man könnte dies auch eleganter lösen, sieh
// Beschreibung auf der Folie 11. Falls ich Zeit habe, werde ich das noch
// versuchen...
public class Stopwatch extends BorderPane implements EventHandler<ActionEvent> {

	// Die folgenden 5 Zeilen sind Instanzvariablen
	private Timer timer = new Timer(500);
	private BorderPane root;
	private Button a;
	private Button b;
	private Button c;

	// Ab hier bis zum nächsten Kommentar, ist das der Konstruktor?
	public void Stopwatch() {
		BorderPane root = new BorderPane();

		HBox hbox1 = new HBox(10);
		hbox1.setAlignment(Pos.CENTER);
		root.setCenter(hbox1);

		VBox vbox = new VBox(10);
		this.setBottom(vbox);

		HBox hbox2 = new HBox(10);

		// Ab hier Methoden? Geht irgend wie nicht auf, es fehlt die } welche
		// den Konstruktor schliesst...
		Label s = new Label("Sekunden: ");
		Label t = new Label("0:00");
		hbox1.getChildren().addAll(s, t);

		this.a = new Button("Start");

		// Dieser Befehl macht, dass die Buttons bedienbar werden und auch
		// etwas machen
		this.a.addEventHandler(ActionEvent.ACTION, this);
		this.b = new Button("Stop");
		this.b.addEventHandler(ActionEvent.ACTION, this);
		this.c = new Button("Reset");
		this.c.addEventHandler(ActionEvent.ACTION, this);

		hbox2.setAlignment(Pos.CENTER);
		hbox2.getChildren().addAll(a, b, c);

		Label z = new Label("Zustand");

		vbox.getChildren().addAll(hbox2, z);
	}

	// was passiert hier genau?
	public void update() {
	}

	// Damit die Zeit läuft und dies angezeigt wird, sollte die Klasse Timer
	// noch irgendwie hier eingebunden werden.... Der Dozent hat uns die
	// Lösung gezeigt aber ich konnte nicht alles im Kopf behalten und
	// mitschreiben war verboten :) dehalb komme ich hier auf keinen grünen
	// Zweig....
	public void timer() {
		attach(timer, this);
	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == this.a) {
			this.root.setStyle("Start");
		} else if (event.getSource() == this.b) {
			this.root.setStyle("Stop");
		} else if (event.getSource() == this.c) {
			this.root.setStyle("Reset");
		}
	}
}