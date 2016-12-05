package Kapitel1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdressformularVarianteVBoxHBox extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		BorderPane root = new BorderPane();

		// Der Titel des "Fensters" wird damit erstellt, oben links
		// Wie macht man die Schrift fett?
		root.setTop(new Label("Adresse"));

		VBox vbox = new VBox(10);

		HBox hbox1 = new HBox(10);

		HBox hbox2 = new HBox(10);

		HBox hbox3 = new HBox(10);

		HBox hbox4 = new HBox(10);

		// Für was genau sind diese beiden Zeilen? Für die Buttons habe ich
		// AnchotPane verwendet... Löscht men aber diese beiden Zeilen kommt
		// ein fast leeres Fenster ???
		HBox hbox6 = new HBox(10);
		root.setBottom(vbox);

		Label l1 = new Label("Name");
		TextField t1 = new TextField();
		hbox1.getChildren().addAll(l1, t1);

		Label l2 = new Label("Vorname");
		TextField t2 = new TextField();
		hbox2.getChildren().addAll(l2, t2);

		Label l3 = new Label("Strasse");
		TextField t3 = new TextField();
		hbox3.getChildren().addAll(l3, t3);

		Label l4 = new Label("PLZ");
		TextField t4 = new TextField();
		Label l5 = new Label("Ort");
		TextField t5 = new TextField();
		hbox4.getChildren().addAll(l4, t4, l5, t5);
		
		vbox.getChildren().addAll(hbox1, hbox2, hbox3, hbox4);

		// Damit die Knöpfe unten rechts im Bild sind verwenden wir den
		// AnchorPane
		final AnchorPane root2 = new AnchorPane();

		Button o = new Button("OK");

		// setzt die Position des linken Knopfes
		AnchorPane.setBottomAnchor(o, 10.0);
		AnchorPane.setRightAnchor(o, 100.0);

		Button c = new Button("Cancel");

		// setzt die Position des rechten Knopfes
		AnchorPane.setBottomAnchor(c, 10.0);
		AnchorPane.setRightAnchor(c, 10.0);

		// Der root2 wird die root sowie c und o hinzugefügt. Hier pielt die
		// Reihenfolge für o und c keine Rolle für die Position, weil dies
		// bereits
		// oben definiert wird
		root2.getChildren().addAll(root, c, o);

		stage.setTitle("Stopwatch");
		stage.setScene(new Scene(root2, 500, 250));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}