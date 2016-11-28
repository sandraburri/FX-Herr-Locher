package Stopwatch;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Stopwatch1 extends Application{
	@Override
	public void start (Stage stage) throws Exception{
		BorderPane root = new BorderPane();
		root.setTop(new Label("Top"));
		root.setLeft(new Label("Left"));
		root.setCenter(new Label("Center"));
		root.setRight(new Label("Right"));
		root.setBottom(new Label("Bottom"));
		
		HBox hbox = new HBox (10);
		root.setCenter(hbox);
		
		
		Label s = new Label("Sekunden: ");
		Label t = new Label("0:00");
		hbox.getChildren().addAll(s, t);
		
		
			
		
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
