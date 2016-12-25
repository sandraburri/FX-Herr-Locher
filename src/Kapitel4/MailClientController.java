package Kapitel4;

import java.awt.TextField;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MailClientController {
	
	// Diese Zeile gehört immer hier hin. Im Main ist es mit @Override, hier
		// jedoch so
		public MailClientController() throws IOException {

			// Hier wird eine Stage eröffnet
			Stage stage = new Stage();
			
			// Hier wird der Elternknoten dem FXMLLoader zugewiesen. Dadurch wird
			// erreicht, dass die Daten bei ChartsTables.fxml abgeholt werden
			Parent root = FXMLLoader.load(getClass().getResource("MailClient.fxml"));
			
			// Hier wird eine Scene eröffnet und der Wurzel zugewiesen
			Scene scene = new Scene(root);
			
			// das verstehe ich nicht was da passiert
			scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

			stage.setTitle("Mail Client");
			stage.setScene(scene);
			
			// ruft sich selber auf... Warum das? Zu was dient das? Hätte man diesen
			// ganzen Code nicht in ein main oder in die andere Klasse verpacken
			// können?
			stage.show();
		}
	}
	
		@FXML
		private TextField to;
		
		@FXML
		private TextField from;
		
		@FXML
		private TextField subject;
		
		@FXML
		private TextField message;
		
		@FXML
		private TextField login;
		
		@FXML
		private TextField password;
		
		// Hier definieren wie die Zusammenarbeit mit dem ChartsTables.fxml
		// aussehen soll, was dort zu tun ist
		@FXML
		protected void handleSend(ActionEvent event) {
			
			// Auf der Konsole soll der Text, welcher im TextField Name eingegeben
			// wurde ausgegeben werden
			System.out.println("To: " + to.getText());
		    System.out.println("From: "+ from.getText());
		    System.out.println("Subject: " + subject.getText());
		    System.out.println("Message: "+ message.getText());
		    System.out.println("Login: " + login.getText());
		    System.out.println("Password: "+ password.getText());
		   }
