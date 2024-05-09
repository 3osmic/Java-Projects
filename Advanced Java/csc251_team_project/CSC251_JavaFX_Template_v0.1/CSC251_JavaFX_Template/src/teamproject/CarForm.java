package teamproject;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CarForm {

    private String id;
    private int mileage;
    private int mpg;
    private double cost;
    private double salesPrice;

    public CarForm() {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Add Car Form");

        Label idLabel = new Label("ID:");
        TextField idField = new TextField();
        Label mileageLabel = new Label("Mileage:");
        TextField mileageField = new TextField();
        Label mpgLabel = new Label("MPG:");
        TextField mpgField = new TextField();
        Label costLabel = new Label("Cost:");
        TextField costField = new TextField();
        Label salesPriceLabel = new Label("Sales Price:");
        TextField salesPriceField = new TextField();

        Button addButton = new Button("Add Car");
        addButton.setOnAction(e -> {
            id = idField.getText();
            mileage = Integer.parseInt(mileageField.getText());
            mpg = Integer.parseInt(mpgField.getText());
            cost = Double.parseDouble(costField.getText());
            salesPrice = Double.parseDouble(salesPriceField.getText());
            stage.close();
        });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(idLabel, idField, mileageLabel, mileageField, mpgLabel, mpgField,
                costLabel, costField, salesPriceLabel, salesPriceField, addButton);

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.showAndWait();
    }

    public String getId() {
        return id;
    }

    public int getMileage() {
        return mileage;
    }

    public int getMpg() {
        return mpg;
    }

    public double getCost() {
        return cost;
    }

    public double getSalesPrice() {
        return salesPrice;
    }
}
