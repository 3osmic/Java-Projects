module CSC251_JavaFX_Example {
	
	// JavaFX
	requires javafx.controls;
	requires javafx.graphics;
	
	opens teamproject to javafx.controls, javafx.graphics;
}