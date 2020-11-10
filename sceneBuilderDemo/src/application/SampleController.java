package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SampleController {
	
	private int counter = 1;
	@FXML Label countLbl;
	
	public void increamentCounter() {
		countLbl.setText("Count = " + (counter++));
	}
}
