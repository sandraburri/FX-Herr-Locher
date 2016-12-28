package CharsTables1;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CharsTablesDataEditorController {
	
	// Dient der Zusammenarbeit mit ChartsTables.fxml und ist die
	// Instanzvariable vom TextField name
	@FXML
	private TextField name;
	
	@FXML
	private TextField quantity;
	
	// Hier definieren wie die Zusammenarbeit mit dem ChartsTables.fxml
	// aussehen soll, was dort zu tun ist
	@FXML
	protected void handleAdd(ActionEvent event) {
		
		// Auf der Konsole soll der Text, welcher im TextField Name eingegeben
		// wurde ausgegeben werden
		System.out.println("Name: " + name.getText());
	    System.out.println("Quantity: "+ quantity.getText());
	    
	    // Sobald die Ausgabe auf der Konsole erfolgt ist, soll der eingegebene
	    // Text im Textfield gelöscht werden
		name.clear();
		quantity.clear();
	   }
}