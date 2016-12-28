package CharsTables1;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CharsTablesDataEditorStage extends Stage {
	
	//Diese ganze Klasse ist der Konstruktor

	// Diese Zeile gehört immer hier hin. Im Main ist es mit @Override, hier
	// jedoch so
	public CharsTablesDataEditorStage() throws IOException {

		// Hier wird eine Stage eröffnet
		Stage stage = new Stage();
		
		// Hier wird der Elternknoten dem FXMLLoader zugewiesen. Dadurch wird
		// erreicht, dass die Daten bei ChartsTables.fxml abgeholt werden
		Parent root = FXMLLoader.load(getClass().getResource("ChartsTables.fxml"));
		
		// Hier wird eine Scene eröffnet und der Wurzel zugewiesen
		Scene scene = new Scene(root);
		
		stage.setTitle("Model Editor");
		stage.setScene(scene);
		
		// ruft sich selber auf...  es wird die stage angezeigt. Spielt keine
		// Rolle ob das hier ist oder im main (wie bei der Stopwatch...
		stage.show();
	}
}