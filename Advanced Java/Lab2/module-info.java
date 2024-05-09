module CSC251_JavaFX_Example {

	// JavaFX
	requires javafx.controls;
	requires javafx.graphics;

	opens edu.waketech.csc251.validate.fx to javafx.controls, javafx.graphics;
	opens chapter14 to javafx.controls, javafx.graphics;
	opens chapter15 to javafx.controls, javafx.graphics;
	opens lecture to javafx.controls, javafx.graphics;
	opens lab02 to javafx.controls, javafx.graphics;
}