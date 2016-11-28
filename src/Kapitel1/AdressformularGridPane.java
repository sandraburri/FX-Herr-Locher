package Kapitel1;

import javax.swing.RootPaneContainer;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.javafx.application.LauncherImpl;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class AdressformularGridPane {
	final GridPane root = new GridPane();
	
	final Label label1 = new Label("Adresse");
	GridPane.setConstraints(label1, 0,0, GridPane.REMAINING, 1);
	
	final Label label2 = new Label("Name");
	GridPane.setConstraints(label2, 0,1);
	
	
	RootPaneContainer.getChildren()addAll(label1, label2);
	
	public static void main(String[] args) {
		;
	}
}
