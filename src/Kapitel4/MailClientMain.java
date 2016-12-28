package Kapitel4;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MailClientMain extends Application {

    @Override
    public void start(Stage stage) throws Exception {
    	 			
 			// Hier wird der Elternknoten dem FXMLLoader zugewiesen. Dadurch wird
 			// erreicht, dass die Daten bei ChartsTables.fxml abgeholt werden
 			Parent root = FXMLLoader.load(getClass().getResource("MailClient.fxml"));
 			
 			// Hier wird eine Scene eröffnet und der Wurzel zugewiesen
 			Scene scene = new Scene(root);
 			
 			stage.setTitle("Mail Client");
 			stage.setScene(scene);
 			stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}