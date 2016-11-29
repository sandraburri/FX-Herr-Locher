package Kapitel1;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdressformularVarianteVBoxHBox {
	@Override
	public void start(Stage stage) throws Exception {
		BorderPane root = new BorderPane();
		
		// Der Titel des "Fensters" wird damit erstell, oben links
		// Wie macht man die Schrift fett?
		root.setTop(new Label("Adresse"));
		
		// Die VBox wird erstellt
		VBox vbox = new VBox(10);
}


	// Die HBox 1 wird erstellt
	HBox hbox1 = new HBox(10);

	// Dieser Befehl macht, dass der später definierte Inhalt immer in der
	// Mitte des Zentrums zentriert bleibt
	hbox1.setAlignment(Pos.CENTER);

	// Sie wird im Zentrum des Fensters erstellt
	root.setCenter(hbox1);

	

	// Sie wird "am Boden" des Fensters erstellt
	root.setBottom(vbox);

	// Die HBox 2 wird erstellt
	HBox hbox2 = new HBox(10);

	// Der Inhalt der HBox 1 wird erstellt diese ist im Zentrum des
	// Fensters
	Label s = new Label("Sekunden: ");
	Label t = new Label("0:00");
	hbox1.getChildren().addAll(s, t);

	// Der Inhalt für die HBox2 wird erstellt diese ist "am Boden" des
	// Fensters
	Button a = new Button("Start");
	Button b = new Button("Stop");
	Button c = new Button("Reset");
	
	// Dieser Befehl macht, dass die drei Knöpfe immer in der HBox
	// zentriert bleiben
	hbox2.setAlignment(Pos.CENTER);
	hbox2.getChildren().addAll(a, b, c);

	Label z = new Label("Zustand");

	// Der VBox wird die Hbox und z zugefügt. Genau in dieser Reihenfolge
	// von Oben nach Unten. Schreibt man keinen Befehl für das Zentrieren,
	// Ist alles (Knopf, Label und Textfeld) automatisch links angeordnet.
	vbox.getChildren().addAll(hbox2, z);

	stage.setTitle("Stopwatch");
	stage.setScene(new Scene(root, 400, 160));
	stage.show();
}

public static void main(String[] args) {
	launch(args);
}
}