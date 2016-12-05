package Kapitel2;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GFR extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		final GridPane root = new GridPane();

		final Label label1 = new Label("Alter [Jahre]:");
		// Beim Adressformular hat der Dozent hier mit 4 Spalten gearbeitet...
		// Hatte leider keine Gelegenheit das abzufotografieren...
		GridPane.setConstraints(label1, 0, 0, GridPane.REMAINING, 1);

		final ComboBox combobox = new ComboBox();
		int numbers_to_add_max = 100;
		for (int i = 1; i <= numbers_to_add_max; i++) {
		}
		GridPane.setConstraints(combobox, 0, 1);

		final Label label2 = new Label("Gewicht [kg]:");
		GridPane.setConstraints(label2, 0, 1);

		TextField t2 = new TextField();
		GridPane.setConstraints(t2, 1, 1);

		final Label label3 = new Label("Serum-Kreatinin [mg/dl]:");
		GridPane.setConstraints(label3, 0, 2);

		TextField t3 = new TextField();
		GridPane.setConstraints(t3, 1, 2);

		final Label label4 = new Label("Geschlecht:");
		GridPane.setConstraints(label4, 0, 4);

		HBox hbox = new HBox(10);
		final RadioButton button1 = new RadioButton("weiblich");
		final RadioButton button2 = new RadioButton("männlich");
		hbox.getChildren().addAll(button1, button2);
		GridPane.setConstraints(hbox, 1, 4);

		final Label label5 = new Label("GFR:");
		GridPane.setConstraints(label5, 0, 5);
		
		final Label label6 = new Label();
		GridPane.setConstraints(label6, 1, 5);
		

		
		root.getChildren().addAll(label1, combobox, label2, t2, label3, t3,
				label4, hbox, label5, label6);
		
		
		

		
		final AnchorPane root2 = new AnchorPane();

		Button button = new Button("Berechnen");

		
		AnchorPane.setBottomAnchor(button, 10.0);
		AnchorPane.setRightAnchor(button, 100.0);

		
		
		root2.getChildren().addAll(root, button);
	}
}