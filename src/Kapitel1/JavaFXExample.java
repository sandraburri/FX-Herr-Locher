package Kapitel1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXExample extends Application {
	
	@Override
	// Die Methode start(....) wird überschrieben. Application hat zwar eine
	// Methode start, aber wir wollen die für uns umschreiben.
	public void start(Stage stage) throws Exception {
		
		// BorderPane = Inhaltscontainer
		BorderPane root = new BorderPane();
		
		// (5) Anzahl Platz zwischen den "Sachen" (Text, Textfelder, Buttons)
		// welche ich in die HBox = Horizontale Box programmiere
		HBox hbox = new HBox(5);
		
		// root = verwurzeln im Center (Zentrum) der HBox
		root.setCenter(hbox);

		// Kreiert ein Label und ein Textfeld und fügt die dem scene Graphen
		// hinzu
		Label l = new Label("Name");
		TextField t = new TextField();
		hbox.getChildren().addAll(l, t);

		// Kreiert einen Knoten und fügt diesen dem scene Graphen hinzu
		Button b = new Button("Quit");
		
		// verwurzeln Bottom, in unserem Fall unten links, Bottom = Grund
		root.setBottom(b);

		// Set up the stage = Aufsetzen der Stage
		stage.setTitle("JavaFX Example"); // Setzt de Titel in der Stage
		stage.setScene(new Scene(root, 200, 80)); // Setzt die Grösse der Szene
		stage.show(); // zeigt alles an
	}

	public static void main(String[] args) {
		launch(args);
	}
}
