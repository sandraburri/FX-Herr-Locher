package Stopwatch;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Stopwatch1 extends Application{
	@Override
	public void start (Stage stage) throws Exception{
		BorderPane root = new BorderPane();
		HBox hbox = new HBox (10);
		root.setCenter(hbox);
		
		
		TextField t = new TextField("Sekunden: 0:00");
		root.setTop(t);
		
		
		Button a = new Button ("Start");
		Button b = new Button ("Stop");
		Button c = new Button ("Reset");
		hbox.getChildren().addAll(a, b, c);
				
		
		
		stage.setTitle("Stopwatch");
		stage.setScene(new Scene(root, 200, 80));
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
