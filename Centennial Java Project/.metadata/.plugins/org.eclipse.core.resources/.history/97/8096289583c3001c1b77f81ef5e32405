package application;

import java.util.List;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 500, 200);
        primaryStage.setTitle("Student Info");
        primaryStage.setScene(scene);

        //Divided the total area into two parts, top pane and botton pane
        GridPane topPane = new GridPane();
        borderPane.setLeft(topPane);
        topPane.setAlignment(Pos.TOP_RIGHT);
        topPane.setPadding(new Insets(10, 10, 10, 10));
        topPane.setHgap(10);
        topPane.setVgap(3);
        
        topPane.add(new Label("Select students by city: "), 0, 0);
        topPane.add(new Label("                        				"), 1, 0);
        TextField cityField = new TextField();
        topPane.add(cityField, 2, 0);
        
        Button displayButton = new Button("Display");
        GridPane.setHalignment(displayButton, HPos.LEFT);
        displayButton.setPrefWidth(150);
        topPane.add(displayButton, 2, 1);
        
        GridPane bottomPane = new GridPane();
        borderPane.setBottom(bottomPane);
        bottomPane.setAlignment(Pos.BOTTOM_CENTER);
        bottomPane.setPadding(new Insets(10, 10, 10, 10));
        bottomPane.setVgap(10);

        TextArea textArea = new TextArea();
        textArea.setPrefHeight(100);
        textArea.setPrefWidth(480);
        bottomPane.add(textArea, 0, 0);
        
        displayButton.setOnAction(actionEvent -> {
        	DatabaseConnection dataAccessLayer = new DatabaseConnection();
                        List<Student> students = dataAccessLayer.displayStudentInfo(cityField.getText());
            StringBuffer stringBuffer = new StringBuffer();
            students.forEach(student -> {
            	stringBuffer.append(student.getStudentID() + "\t\t");
            	stringBuffer.append(student.getFirstName() + "\t\t");
            	stringBuffer.append(student.getLastName() + "\t\t");
            	stringBuffer.append(student.getAddress() + "\t\t");
            	stringBuffer.append(student.getCity() + "\t\t");
            	stringBuffer.append(student.getProvince() + "\t\t");
            	stringBuffer.append(student.getPostalCode() + "\n");
            });
            textArea.setText(stringBuffer.toString());
        });
        primaryStage.show();
	}
}
