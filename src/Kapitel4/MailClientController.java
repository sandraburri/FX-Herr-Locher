package Kapitel4;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MailClientController {
		
		@FXML
		private TextField to;
		
		@FXML
		private TextField from;
		
		@FXML
		private TextField subject;
		
		@FXML
		private TextArea message;
		
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
}
