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
		Label title = new Label("Adresse");
		
		// Diese Zeile "macht" Adresse FETT
		title.setStyle("-fx-font-weight: bold;");
		root.setTop(title);

		VBox vbox = new VBox(10);

		HBox hbox1 = new HBox(20);

		HBox hbox2 = new HBox(20);

		HBox hbox3 = new HBox(20);

		HBox hbox4 = new HBox(20);

		// Diese Zeile sagt wo die V-Box plaziert wird
		root.setBottom(vbox);

		Label l1 = new Label("Name");
		
		// Das Label l1 hat eine Länge von 100px
		l1.setPrefWidth(100);
		TextField t1 = new TextField();
		
		// Das Textfeld t1 hat eine Länge von 300px
		t1.setPrefWidth(300);
		hbox1.getChildren().addAll(l1, t1);

		Label l2 = new Label("Vorname");
		l2.setPrefWidth(100);
		TextField t2 = new TextField();
		t2.setPrefWidth(300);
		hbox2.getChildren().addAll(l2, t2);

		// Label Länge 100px Spacing Hbox 20px Textfeld Länge 300px = 420px
		Label l3 = new Label("Strasse");
		l3.setPrefWidth(100);
		TextField t3 = new TextField();
		t3.setPrefWidth(300);
		hbox3.getChildren().addAll(l3, t3);

		// PLZ Label 100px Spacing 20px PLZ Textfeld 50px Spacing 20px
		// Ort Label 30px Spacing 20px Ort Textfeld 180px = 420px
		Label l4 = new Label("PLZ");
		l4.setPrefWidth(100);
		TextField t4 = new TextField();
		t4.setPrefWidth(50);
		Label l5 = new Label("Ort");
		l5.setPrefWidth(30);
		TextField t5 = new TextField();
		t5.setPrefWidth(180);
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

		// Der root2 wird die root sowie c und o hinzugefügt. Hier spielt die
		// Reihenfolge für o und c keine Rolle für die Position, weil dies
		// bereits oben definiert wird
		root2.getChildren().addAll(root, c, o);

		stage.setTitle("Adressformular");
		stage.setScene(new Scene(root2, 500, 250));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}