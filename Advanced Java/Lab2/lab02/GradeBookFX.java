package lab02;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GradeBookFX extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		Button btDisplayGrade = new Button("Display Grade");
		Button btClearAnswers = new Button("Clear");
		Button btnExit = new Button("Exit");

		HBox hBox = new HBox(btDisplayGrade, btClearAnswers, btnExit);
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		hBox.setPadding(new Insets(5, 5, 5, 5));

		BorderPane borderPane = new BorderPane();
		borderPane.setTop(hBox);
		
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		
		gridPane.add(new Label("Activity"), 0, 0);
		gridPane.add(new Label("Assignments"), 0, 1);
		gridPane.add(new Label("Review Quizzes"), 0, 2);
		gridPane.add(new Label("Project #1"), 0, 3);
		gridPane.add(new Label("Project #2"), 0, 4);
		gridPane.add(new Label("Mid Term Exam"), 0, 5);
		gridPane.add(new Label("Final Exam"), 0, 6);
		
		TextField txAssignmentsWeight = new TextField();
		txAssignmentsWeight.setText("20");
		txAssignmentsWeight.setStyle("-fx-background-color: pink;");
		TextField txReviewQuizzesWeight = new TextField();
		txReviewQuizzesWeight.setText("10");
		txReviewQuizzesWeight.setStyle("-fx-background-color: pink;");
		TextField txProject1Weight = new TextField();
		txProject1Weight.setText("15");
		txProject1Weight.setStyle("-fx-background-color: pink;");
		TextField txProject2Weight = new TextField();
		txProject2Weight.setText("15");
		txProject2Weight.setStyle("-fx-background-color: pink;");
		TextField txMidTermExamWeight = new TextField();
		txMidTermExamWeight.setText("20");
		txMidTermExamWeight.setStyle("-fx-background-color: pink;");
		TextField txFinalExamWeight = new TextField();
		txFinalExamWeight.setText("20");
		txFinalExamWeight.setStyle("-fx-background-color: pink;");
		
		TextField txAssignments = new TextField();
		TextField txReviewQuizzes = new TextField();
		TextField txProject1 = new TextField();
		TextField txProject2 = new TextField();
		TextField txMidTermExam = new TextField();
		TextField txFinalExam = new TextField();
		
		TextField txFinalAverage = new TextField();
		txFinalAverage.setEditable(false);
		
		gridPane.add(new Label("Weighted"), 1, 0);
		gridPane.add(txAssignmentsWeight, 1, 1);
		txAssignmentsWeight.setMaxWidth(50);
		gridPane.add(txReviewQuizzesWeight, 1, 2);
		txReviewQuizzesWeight.setMaxWidth(50);
		gridPane.add(txProject1Weight, 1, 3);
		txProject1Weight.setMaxWidth(50);
		gridPane.add(txProject2Weight, 1, 4);
		txProject2Weight.setMaxWidth(50);
		gridPane.add(txMidTermExamWeight, 1, 5);
		txMidTermExamWeight.setMaxWidth(50);
		gridPane.add(txFinalExamWeight, 1, 6);		
		txFinalExamWeight.setMaxWidth(50);
		
		gridPane.add(new Label("Your Average"), 2, 0);
		gridPane.add(txAssignments, 2, 1);
		gridPane.add(txReviewQuizzes, 2, 2);
		gridPane.add(txProject1, 2, 3);
		gridPane.add(txProject2, 2, 4);
		gridPane.add(txMidTermExam, 2, 5);
		gridPane.add(txFinalExam, 2, 6);
		
		gridPane.add(new Label("Final Average"), 1, 7);
		gridPane.add(txFinalAverage, 2, 7);
		
		borderPane.setCenter(gridPane);

		btDisplayGrade.setOnAction(e -> {
			double assignments = Double.parseDouble(txAssignments.getText());
			double reviewQuizzes = Double.parseDouble(txReviewQuizzes.getText());
			double project1 = Double.parseDouble(txProject1.getText());
			double project2 = Double.parseDouble(txProject2.getText());
			double midterm = Double.parseDouble(txMidTermExam.getText());
			double finalExam = Double.parseDouble(txFinalExam.getText());
			
			// Calculations
			double assign_calc = assignments * 0.2;
			double quiz_calc = reviewQuizzes * 0.1;
			double project1_calc = project1 * 0.15;
			double project2_calc = project2 * 0.15;
			double midterm_calc = midterm * 0.2;
			double finalExam_calc = finalExam * 0.2;
			
			// Final Calculation
			double final_calc = assign_calc + quiz_calc + project1_calc 
					+ project2_calc + midterm_calc + finalExam_calc / 1.00;

			// Students need to change the following code to make the logic correct
			double finalGrade = final_calc;
			
			txFinalAverage.setText(String.valueOf(finalGrade));

		});

		btClearAnswers.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handle method
			public void handle(ActionEvent e) {
				
				// Clearing all text inputs when button is clicked
				txAssignments.clear();
				txReviewQuizzes.clear();
				txProject1.clear();
				txProject2.clear();
				txMidTermExam.clear();
				txFinalExam.clear();
				txFinalAverage.clear();
			}
		});

		btnExit.setOnAction(e -> {
			System.exit(0);
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 500, 300);
		primaryStage.setTitle("My Grade"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}