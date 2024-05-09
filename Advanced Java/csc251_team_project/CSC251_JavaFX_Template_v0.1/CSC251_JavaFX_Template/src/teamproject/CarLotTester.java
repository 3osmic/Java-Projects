package teamproject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CarLotTester extends Application {

    private CarLot lot = new CarLot();
    private Label inventoryLabel = new Label();
    private Label profitLabel = new Label();
    private TextField idField = new TextField();
    private TextField mileageField = new TextField();
    private TextField mpgField = new TextField();
    private TextField costField = new TextField();
    private TextField salesPriceField = new TextField();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Car Lot Management");

        Button addCarButton = new Button("Add Car");
        addCarButton.setOnAction(e -> {
            String id = idField.getText();
            Alert a = new Alert(AlertType.NONE);
            try {
	            int mileage = Integer.parseInt(mileageField.getText());
	            int mpg = Integer.parseInt(mpgField.getText());
	            double cost = Double.parseDouble(costField.getText());
	            double salesPrice = Double.parseDouble(salesPriceField.getText());
	            lot.addCar(id, mileage, mpg, cost, salesPrice);
	            updateInventoryLabel();
	            updateProfitLabel();
	            clearFields();
            } catch (Exception ex) {
            	// Handle the case where the sales price is not a valid number
                // You can show an alert or update a status label to inform the user
            	a.setAlertType(AlertType.CONFIRMATION);
            	a.setContentText(ex.getMessage());
            	a.show();
            }
        });

        Button sellCarButton = new Button("Sell Car");
        sellCarButton.setOnAction(e -> {
            String id = idField.getText(); // Get the ID input from the user
            Alert a = new Alert(AlertType.NONE);
            if (!id.isEmpty()) { // Check if the ID field is not empty
                try {
                    double priceSold = Double.parseDouble(salesPriceField.getText());
                    lot.sellCar(id, priceSold);
                    updateInventoryLabel();
                    updateProfitLabel();
                    clearFields();
                } catch (NumberFormatException ex) {
                    // Handle the case where the sales price is not a valid number
                    // You can show an alert or update a status label to inform the user
                	a.setAlertType(AlertType.CONFIRMATION);
                	a.setContentText(ex.getMessage());
                	a.show();
                } catch (IllegalArgumentException ex) {
                    // Handle the case where the car with the given ID is not found
                    // You can show an alert or update a status label to inform the user
                	a.setAlertType(AlertType.CONFIRMATION);
                	a.setContentText(ex.getMessage());
                	a.show();
                }
            } else {
                // Notify the user that the ID field is empty
                // You can show an alert or update a status label to inform the user
            }
        });

        Button calculateProfitButton = new Button("Calculate Total Profit");
        calculateProfitButton.setOnAction(e -> {
            double totalProfit = lot.getTotalProfit();
            profitLabel.setText("Total Profit: $" + totalProfit);
        });

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> {
            lot = new CarLot();
            updateInventoryLabel();
            updateProfitLabel();
            clearFields();
        });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));

        // Set the background color to light blue
        layout.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        layout.getChildren().addAll(
                new Label("Carlot Management System"),
                new Label("------- Input Car Details to Either Add or Sell a Car -------"),
                new Label("ID:"),
                idField,
                new Label("Mileage:"),
                mileageField,
                new Label("MPG:"),
                mpgField,
                new Label("Cost:"),
                costField,
                new Label("Sales Price:"),
                salesPriceField,
                addCarButton,
                sellCarButton, // Added the Sell Car button
                new Label("Actions:"),
                calculateProfitButton, // Moved the Calculate Total Profit button here
                clearButton,
                inventoryLabel,
                profitLabel);

        updateInventoryLabel();
        updateProfitLabel();

        Scene scene = new Scene(layout, 400, 400);
        
        // Set the window to full screen
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true); // Set the stage to be maximized (full screen)
        primaryStage.show();
    }

    private void updateInventoryLabel() {
        StringBuilder inventoryText = new StringBuilder("Inventory:\n");
        for (Car car : lot.getInventory()) {
            inventoryText.append(car).append("\n");
        }
        inventoryLabel.setText(inventoryText.toString());
    }

    private void updateProfitLabel() {
        double totalProfit = lot.getTotalProfit();
        profitLabel.setText("Total Profit: $" + totalProfit);
    }

    private void clearFields() {
        idField.clear();
        mileageField.clear();
        mpgField.clear();
        costField.clear();
        salesPriceField.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }
}