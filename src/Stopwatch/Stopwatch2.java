package Stopwatch;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

// Weiterführendes Projekt von Stopwatch 1 hier wird nur noch "Neues"
// kommentiert

// EventHandler<ActionEvent> muss hier implementiert werden, damit die Aktionen
// weiter unten funktionieren. Man könnte dies auch eleganter lösen, siehe
// Beschreibung auf der Folie 11
public class Stopwatch2 extends BorderPane implements EventHandler<ActionEvent> {

	// Die folgenden 7 Zeilen sind Instanzvariablen
	// new Timer2(100); (100) das sind hunderstel Sekunden, bei 500 zählt es
	// in 5er Schritten hoch bei 1000 immer 1 Sekunde ohne die Hundertstel
	// zu berücksichtigen
	private Timer2 timer = new Timer2(100);
	private BorderPane root;
	private Button a;
	private Button b;
	private Button c;
	private Label t;
	private Label z;

	// Ab hier bis Zeile 72 ist der Konstruktor
	public Stopwatch2() {
		timer.attach(this);
		root = new BorderPane();

		HBox hbox1 = new HBox(10);
		hbox1.setAlignment(Pos.CENTER);
		this.setCenter(hbox1);

		VBox vbox = new VBox(10);
		this.setBottom(vbox);

		HBox hbox2 = new HBox(10);

		Label s = new Label("Sekunden: ");
		t = new Label("0.0");
		hbox1.getChildren().addAll(s, t);

		// hier verwenden wir nur noch a, das wurde bereits in der Instanz-
		// variabel definiert, dass dies ein Button ist
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

		z = new Label("bereit");

		vbox.getChildren().addAll(hbox2, z);
	}

	// Ab hier sind es Methoden
	public void update() {
		Platform.runLater(() -> {
			t.setText(timer.getTimeString());
		});
	}

	@Override

	// das ist der Actionshändler, da wird definiert was passiert wenn wir
	// die einzelnen Knöpfe anklicken... Die Infos dazu sind in der Timerklasse
	// zu finden
	// Genauer: wir rufen die entsprechenden Methoden in der Timer-Klasse auf
	// Im handler haben wir ein if-statement für jede Quelle der ausgelösten
	// Aktion (sprich für jeden Knopf). Wir können danach alle Aktionen
	// auflisten, welche beim Knopfdruck passieren sollen.
	public void handle(ActionEvent event) {
		if (event.getSource() == this.a) {
			timer.start();

			// wenn der Knopf a gedrückt wird wechselt der Zustand unten links
			// der Text dort passt sich quasi der Knopfaktion an
			z.setText("läuft");
		} else if (event.getSource() == this.b) {
			timer.stop();
			z.setText("gestopt");
		} else if (event.getSource() == this.c) {
			timer.reset();
			if (timer.isRunning())
				z.setText("läuft");
			else {
				z.setText("bereit");
			}
		}
	}
}