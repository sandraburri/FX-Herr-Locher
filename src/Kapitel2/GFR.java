package Kapitel2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GFR extends Application implements EventHandler<ActionEvent> {
	private int age;
	private double weight;
	private String gender;
	private double scr;
	private double ccr;
	private Label label6;
	private Button button;
	private ComboBox combobox;
	private TextField t2;
	private TextField t3;
	private ToggleGroup tGroup;
	private RadioButton button1;
	private RadioButton button2;

	@Override
	public void start(Stage stage) throws Exception {
		final GridPane root = new GridPane();

		final Label label1 = new Label("Alter [Jahre]:");
		GridPane.setConstraints(label1, 0, 0);

		// Dies ist eine "Auswahlbox" hier geht sie von 1-99
		// Mit getItems().add(Object) können wir Objekte (String, Int, ...) zur
		// Auswahl hinzufügen, damit wir das nicht 100 mal machen müssen,
		// machen wir einen Loop, der von 1-99(nicht 100!) zählt und immer die
		// entsprechende Zahl zur Auswahl hinzufügt
		combobox = new ComboBox();
		for (int count = 1; count < 100; count++) {
			combobox.getItems().add(count);
		}
		GridPane.setConstraints(combobox, 1, 0);

		final Label label2 = new Label("Gewicht [kg]:");
		GridPane.setConstraints(label2, 0, 1);

		t2 = new TextField();
		GridPane.setConstraints(t2, 1, 1);

		final Label label3 = new Label("Serum-Kreatinin [mg/dl]:");
		GridPane.setConstraints(label3, 0, 2);

		t3 = new TextField();
		GridPane.setConstraints(t3, 1, 2);

		final Label label4 = new Label("Geschlecht:");
		GridPane.setConstraints(label4, 0, 3);

		HBox hbox = new HBox(10);

		// Ab hier werden die runden Knöpfe erstellt, welche sich schwarz
		// färben wenn sie angewählt sind

		// Die Knöfe müssen gruppiert werden
		// Pro Gruppe kann maximal einer aktiv sein, dafür braucht es die
		// ToggleGroup
		tGroup = new ToggleGroup();

		// Der Knopf wird erstellt und benamst
		button1 = new RadioButton("weiblich");

		// setUserData das machen wir, dass der button 1 unter dem Namen
		// weiblich läuft und wir darauf zugreifen können
		// Unter UserData kannst du beliebige Objekte (also beispielsweise auch
		// int, double, account,...) speichern und mittels getter abfragen.
		// Bei dieser Aufgabe dient es nur zur identifikation welcher
		// Radiobutton aus der Togglegroup angewählt ist
		button1.setUserData("weiblich");

		// hier wird der Knopf in die Gruppierung eingefügt
		button1.setToggleGroup(tGroup);
		button2 = new RadioButton("männlich");
		button2.setUserData("männlich");
		button2.setToggleGroup(tGroup);
		hbox.getChildren().addAll(button1, button2);
		GridPane.setConstraints(hbox, 1, 3);

		final Label label5 = new Label("GFR:");
		GridPane.setConstraints(label5, 0, 4);

		label6 = new Label();
		GridPane.setConstraints(label6, 1, 4);

		button = new Button("Berechnen");
		this.button.addEventHandler(ActionEvent.ACTION, this);
		GridPane.setConstraints(button, 1, 5);

		root.getChildren().addAll(label1, combobox, label2, t2, label3, t3,
				label4, hbox, label5, label6, button);

		stage.setTitle("Cockcroft-Gault-Formel");
		stage.setScene(new Scene(root, 400, 160));
		stage.show();
	}

	// Methode; Formel für die Berechnung des GFR
	public double getCcr() {
		if (gender == "männlich")
			ccr = (((140 - age) * weight) / (72 * scr));
		else {
			ccr = ((((140 - age) * weight) / (72 * scr)) * 0.85);
		}

		// Diese 2 Zeilen benutzen wir um das Resultat mit 2 Stellen nach dem
		// Koma anzuzeigen
		// Ausführlich: Wir rechenen das Resultat mal 100 und runden mittels
		// Math.round auf eine ganze Zahl. Danach teilen wir durch 100 und
		// erhalten somit eine Zahl mit 2 Stellen nach dem Komma.
		// Beispiel: 3.759788 -> 3.759788*100 = 375.9788 -> Runden auf 376 ->
		// 376/100 = 3.76
		ccr = Math.round(ccr * 100);
		ccr = ccr / 100;
		return ccr;
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override

	// Das ist der Actionshändler, hier wird definiert was passiert wenn wir
	// den Knopf berechnen anklicken alle diese Umwandlungen müssen stattfinden,
	// damit die Formel berechnet werden kann, alle Infos aus unseren diversen
	// Kästchen überhaupt abgeholt werden können und am Schluss das Resultat
	// ausgegeben werden kann
	public void handle(ActionEvent event) {
		if (event.getSource() == this.button) {

			// Das Alter wird aus der ComboBox geholt und in einen Integer
			// gecastet
			age = (Integer) combobox.getValue();

			// Das Gewicht wird von einem Text in einen Double umgewandelt, da
			// Eingeben in einem TextField immer als String gespeichert werden
			weight = Double.parseDouble(t2.getText());

			// Die Userdata wird in den String gespeichert
			gender = (String) tGroup.getSelectedToggle().getUserData();

			// Der scr wird von einem Text in Double umgewandelt
			scr = Double.parseDouble(t3.getText());

			// Das Resultat soll hier ausgegeben werden setText
			// (String -> Label = String .valueOf -> der Wert von
			// (getCcr()) -> das ist der return Wert, welchen wir aus der
			// Formel erhalten / Hier wird eigentlich die Formel ausgeführt
			// mit allen Angaben, die wir im GUI eingegeben haben und oben
			// zu diesem Zweck umgewandelt wurden)
			label6.setText(String.valueOf(getCcr()));
		}
	}
}