package MouseXYRGB.start;

import MouseXYRGB.controller.MouseXYRGBController;
import javafx.application.Application;
import javafx.stage.Stage;

/**Class: MouseXYRGBStart.java
 * @author Kenneth Sales
 * June 7, 2018
 * 
 * This class - Provides main method for application and start method for Application
 *
 * Purpose: - describe the purpose of the class
 */
public class MouseXYRGBStart extends Application 
{
	/* Override: start
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage arg0) throws Exception 
	{
		new MouseXYRGBController();
	}

	/**Method: main
	 * Purpose: launch application
	 * @param args
	 */
	public static void main(String[] args) 
	{
		launch(args);

	}
}
