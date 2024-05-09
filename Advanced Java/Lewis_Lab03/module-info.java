module CSC251_JavaFX_and_MySQL_Project_Template {
	
	// JavaFX
	requires javafx.controls;
	requires javafx.graphics;
	
	// MySQL
	requires java.sql;
	requires java.sql.rowset;
	
	// This package uses JavaFX and MySQL
	opens edu.waketech.csc251.validate.mysql_and_fx to javafx.graphics, javafx.fxml, java.sql;
	opens chapter34 to javafx.graphics, java.sql;
	opens chapter35 to javafx.graphics, java.sql;
	opens lecture to javafx.graphics, java.sql;
	opens productCRUD to javafx.graphics, javafx.fxml, javafx.base;
	opens contactCRUD to javafx.graphics, javafx.fxml, javafx.base;
}