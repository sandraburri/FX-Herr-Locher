package Kapitel1;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.PopupWindow.AnchorLocation;
import javafx.stage.Stage;

public class AdressformularGridPane extends Application{
	@Override
	public void start(Stage stage) throws Exception {
			
	final GridPane root = new GridPane();

	final Label label1 = new Label("Adresse");
	GridPane.setConstraints(label1, 0, 0, GridPane.REMAINING, 1);

	final Label label2 = new Label("Name");
	GridPane.setConstraints(label2, 0, 1);
	
	TextField t2 = new TextField();
	GridPane.setConstraints(t2, 1, 1);
	
	final Label label3 = new Label("Vorname");
	GridPane.setConstraints(label3, 0, 2);
	
	TextField t3 = new TextField();
	GridPane.setConstraints(t3, 1, 2);

	final Label label4 = new Label("Strasse");
	GridPane.setConstraints(label4, 0, 3);
	
	TextField t4 = new TextField();
	GridPane.setConstraints(t4, 1, 3);
	
	
	
	final Label label5 = new Label("PLZ");
	GridPane.setConstraints(label5, 0, 4);
	
	HBox hbox = new HBox(10);
	TextField t5 = new TextField();
	final Label label6 = new Label("Ort");
	TextField t6 = new TextField();
	hbox.getChildren().addAll(t5, label6, t6);
	GridPane.setConstraints(hbox, 1, 4);
	
	
	root.getChildren().addAll(label1, label2, t2, label3, t3, label4, t4, label5, hbox);
	
	final AnchorPane root2 = new AnchorPane();
		
	Button o = new Button("OK");
	AnchorPane.setBottomAnchor(o, 10.0);
	AnchorPane.setRightAnchor(o, 10.0);
	
	Button c = new Button("Cancel");
	AnchorPane.setBottomAnchor(c, 10.0);
	AnchorPane.setRightAnchor(c, 100.0);

	root2.getChildren().addAll(root, c, o);
	
	// Set up the stage = Aufsetzen der Stage
			stage.setTitle("Adressformular"); // Setzt de Titel in der Stage
			stage.setScene(new Scene(root2, 500, 200)); // Setzt die Grösse der Szene
			stage.show(); // zeigt alles an
		}

		public static void main(String[] args) {
			launch(args);
		}
}