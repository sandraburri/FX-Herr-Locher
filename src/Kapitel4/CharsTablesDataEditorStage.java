package Kapitel4;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CharsTablesDataEditorStage extends Stage {

	// Diese Zeile geh�rt immer hier hin. Im Main ist es mit @Override, hier
	// jedoch so
	public CharsTablesDataEditorStage() throws IOException {

		// Hier wird eine Stage er�ffnet
		Stage stage = new Stage();
		
		// Hier wird der Elternknoten dem FXMLLoader zugewiesen. Dadurch wird
		// erreicht, dass die Daten bei ChartsTables.fxml abgeholt werden
		Parent root = FXMLLoader.load(getClass().getResource("ChartsTables.fxml"));
		
		// Hier wird eine Scene er�ffnet und der Wurzel zugewiesen
		Scene scene = new Scene(root);
		
		// das verstehe ich nicht was da passiert
		scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

		stage.setTitle("Model Editor");
		stage.setScene(scene);
		
		// ruft sich selber auf... Warum das? Zu was dient das? H�tte man diesen
		// ganzen Code nicht in ein main oder in die andere Klasse verpacken
		// k�nnen?
		stage.show();
	}
}
