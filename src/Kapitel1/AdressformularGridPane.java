package Kapitel1;



import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.PopupWindow.AnchorLocation;
import javafx.stage.Stage;

public class AdressformularGridPane extends Application{
	@Override
	public void start(Stage stage) throws Exception {
	final GridPane root = new GridPane();
	
	// Die folgende Code Zeile macht, dass der ganze Adressblock oben zentriert
	// bleibt wenn wir am Fenster rumziehen
	// root.setAlignment(Pos.TOP_CENTER);
	
	// Die folgende Code Zeile macht, dass der ganze Adressblock zentriert
	// bleibt wenn wir am Fenster rumziehen
	// root.setAlignment(Pos.CENTER);
	
	// Die folgende Code Zeile macht, dass der ganze Adressblock unten zentriert
	// bleibt wenn wir am Fenster rumziehen
	// root.setAlignment(Pos.BOTTOM_CENTER);
	
	// margin setzt die Distanz ausserhalb von etwas Label oder Textfeld
	// Insets(top, left, bottom, right);
	final Insets margin = new Insets(5, 5, 0, 0);
	
	// padding setzt die Distanz innerhalb von etwas Label und dem ganzen
	// Fenster Insets(top, right, bottom, left);
	final Insets padding = new Insets(0,0,0,5);

	final Label label1 = new Label("Adresse");
		
	// Diese Zeile "macht" Adresse FETT 
	label1.setFont(Font.font("Dialog", FontWeight.BOLD, 16));
	
	// So wird der Platz (Position) dieses Labels bestimmt 0, = Spalte 0
	// 0, = Zeile 0
	GridPane.setConstraints(label1, 0, 0, GridPane.REMAINING, 1);
	GridPane.setMargin(label1, margin);
	label1.setPadding(padding);

	final Label label2 = new Label("Name");
	GridPane.setConstraints(label2, 0, 1);
	GridPane.setMargin(label2, margin);
	label2.setPadding(padding);
	
	TextField t2 = new TextField();
	GridPane.setConstraints(t2, 1, 1);
	GridPane.setMargin(t2, margin);
	
	final Label label3 = new Label("Vorname");
	GridPane.setConstraints(label3, 0, 2);
	GridPane.setMargin(label3, margin);
	label3.setPadding(padding);
	
	TextField t3 = new TextField();
	GridPane.setConstraints(t3, 1, 2);
	GridPane.setMargin(t3, margin);

	final Label label4 = new Label("Strasse");
	GridPane.setConstraints(label4, 0, 3);
	GridPane.setMargin(label4, margin);
	label4.setPadding(padding);
	
	TextField t4 = new TextField();
	GridPane.setConstraints(t4, 1, 3);
	GridPane.setMargin(t4, margin);
		
	final Label label5 = new Label("PLZ");
	GridPane.setConstraints(label5, 0, 4);
	GridPane.setMargin(label5, margin);
	label5.setPadding(padding);
	
	// Damit das Textfeld nach PLZ das Label Ort und das Textfeld nach Ort
	// in einer Zeile sind und sich die länge der oberen Textfelder (Spalte 1)
	// der Länge von diesen drei Elementen anpasst, verwenden wir hier eine
	// HBox
	HBox hbox1 = new HBox(10);
	TextField t5 = new TextField();
	final Label label6 = new Label("Ort");
	TextField t6 = new TextField();
	hbox1.getChildren().addAll(t5, label6, t6);
	GridPane.setConstraints(hbox1, 1, 4);
	GridPane.setMargin(hbox1, margin);
	
	HBox hbox2 = new HBox(10);
	Button o = new Button("OK");
	Button c = new Button("Cancel");
	hbox2.getChildren().addAll(o, c);
	hbox2.setAlignment(Pos.BOTTOM_RIGHT);
	GridPane.setConstraints(hbox2, 1, 5);
	GridPane.setMargin(hbox2, margin);
	
	// Der getter für diesen "Block"
	root.getChildren().addAll(label1, label2, t2, label3, t3, label4, t4,
			label5, hbox1, hbox2);
		
	// Set up the stage = Aufsetzen der Stage
			stage.setTitle("Adressformular"); // Setzt de Titel in der Stage
			stage.setScene(new Scene(root, 500, 220)); // Setzt die Grösse
			// der Szene (root, Breite, Höhe));
			stage.show(); // zeigt alles an
		}

		public static void main(String[] args) {
			launch(args);
		}
}