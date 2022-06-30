package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	private String[] businessManegemnt = {"Accounting", "Marketing", "Business"};
	private String[] computerScience = {"Web Development", "Java Programing", "DataBase Management"};
	private String selected = "";
	private Boolean[] cEnabled = {true,true,true};
	private RadioButton csButton;
	private RadioButton BButton;
	private ComboBox<String> cDD;
	private TextArea scList;
	
	@Override
	public void start(Stage primaryStage) {
		BorderPane pane = new BorderPane();
		Scene scene = new Scene(pane, 900, 450);
		primaryStage.setTitle("Exercise 2");
		primaryStage.setScene(scene);
		
		GridPane westArea = new GridPane();
		pane.setLeft(westArea);
		westArea.setAlignment(Pos.CENTER);
		westArea.setPadding(new Insets(10, 10, 10, 10));
		westArea.setHgap(10);
		westArea.setVgap(3);
		
		westArea.add(new Label("Name: "), 0, 0);
		TextField nameText = new TextField();
		westArea.add(nameText, 1, 0);
		
		westArea.add(new Label("Address: "), 0, 1);
		TextField addressText = new TextField();
		westArea.add(addressText, 1, 1);
		
		westArea.add(new Label("Province: "), 0, 2);
		TextField provinceText = new TextField();
		westArea.add(provinceText, 1, 2);
		
		westArea.add(new Label("City: "), 0, 3);
		TextField cityText = new TextField();
		westArea.add(cityText, 1, 3);
		
		westArea.add(new Label("Postal Code: "), 0, 4);
		TextField postalText = new TextField();
		westArea.add(postalText, 1, 4);
		
		westArea.add(new Label("Phone Number: "), 0, 5);
		TextField phoneText = new TextField();
		westArea.add(phoneText, 1, 5);
		
		westArea.add(new Label("Email Address: "), 0, 6);
		TextField emailText = new TextField();
		westArea.add(emailText, 1, 6);
		
		GridPane centerArea = new GridPane();
		pane.setCenter(centerArea);
		centerArea.setAlignment(Pos.CENTER);
		centerArea.setPadding(new Insets(10, 10, 10, 10));
		centerArea.setVgap(5);
		
		CheckBox scCheck = new CheckBox("Student council");
		centerArea.add(scCheck, 0, 0);
		CheckBox vwCheck = new CheckBox("Volunteer work");
		centerArea.add(vwCheck, 0, 1);
		
		GridPane eastArea = new GridPane();
		pane.setRight(eastArea);
		eastArea.setAlignment(Pos.CENTER);
		eastArea.setPadding(new Insets(10,10,10,10));
		eastArea.setVgap(10);
		
		GridPane buttonArea = new GridPane();
		buttonArea.setHgap(10);
		csButton = new RadioButton("Computer Science");
		buttonArea.add(csButton, 0, 0);
		BButton = new RadioButton("Business");
		buttonArea.add(BButton, 1, 0);
		
		ToggleGroup radioGroup = new ToggleGroup();
		csButton.setToggleGroup(radioGroup);
		csButton.setSelected(true);
		BButton.setToggleGroup(radioGroup);
		eastArea.add(buttonArea, 0, 0);
		RadioHandler radioHandler = new RadioHandler();
		csButton.setOnAction(radioHandler);
		BButton.setOnAction(radioHandler);
		
		scList = new TextArea();
		scList.setPrefRowCount(5);
		
		cDD = new ComboBox<>();
		cDD.getItems().addAll(computerScience);
		
		cDD.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				int index = cDD.getSelectionModel().getSelectedIndex();
				if(cDD.getSelectionModel().getSelectedItem() != null && cEnabled[index] == true)
				{
					selected += cDD.getSelectionModel().getSelectedItem() + "\n";
					scList.setText(selected);
					cEnabled[index] = false;
				}
			}
		});
		
		eastArea.add(cDD, 0, 1);
		eastArea.add(scList, 0, 2);
		
		GridPane southArea = new GridPane();
		pane.setBottom(southArea);
		southArea.setAlignment(Pos.CENTER);
		southArea.setPadding(new Insets(10, 10, 10, 10));
		southArea.setVgap(10);
		
		Button display = new Button("Display");
		TextArea displayBox = new TextArea();
		displayBox.setPrefColumnCount(75);
		GridPane.setHalignment(display, HPos.CENTER);
		
		display.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				String name = nameText.getText();
				String address = addressText.getText();
				String province = provinceText.getText();
				String city = cityText.getText();
				String postal = postalText.getText();
				String phone = phoneText.getText();
				String email = emailText.getText();
				String displayString = String.format("%s,%s,%s,%s,%s,%s,%s", name,address, province, city, postal, phone, email);
				
				String courses = "\n\nCourses: \n" + scList.getText();
				displayString += courses;
				if(scCheck.isSelected())
					displayString += "\nStudent council member";
				if(vwCheck.isSelected())
					displayString += "\nVolunteer worker";
				displayBox.setText(displayString);
			}
		});
		
		southArea.add(display, 0, 0);
		southArea.add(displayBox, 0, 1);
		primaryStage.show();
		
		
	}
	class RadioHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event) {
			cDD.getItems().clear();
			selected = "";
			scList.setText(selected);
			for (int i=0; i<3; i++)
			{
				cEnabled[i] = true;
			}
			if(event.getSource() == csButton)
				cDD.getItems().addAll(computerScience);
			else
				cDD.getItems().addAll(businessManegemnt);
			
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
