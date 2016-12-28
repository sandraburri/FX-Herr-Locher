package CharsTables1;

import javafx.application.Application;
import javafx.stage.Stage;

public class CharsTablesMain extends Application {
	
    @Override
    public void start(Stage stage) throws Exception {
    	CharsTablesDataEditorStage des = new CharsTablesDataEditorStage();
    }    
    
    public static void main(String[] args) {
        launch(args);
    }
}