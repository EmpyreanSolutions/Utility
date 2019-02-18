package MouseXYRGB.view;

import MouseXYRGB.controller.MouseXYRGBController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**Class: MouseXYRGBGUI.java
 * @author Kenneth Sales
 * June 7, 2018
 * 
 * This class - describe what the class does
 *
 * Purpose: - describe the purpose of the class
 */
public class MouseXYRGBGUI 
{
	private MouseXYRGBController mouseLocationController;
	
	BorderPane bPane;
	HBox hBox;
	Button btStart, btPause, btExit;
	TextArea textArea;
	
	/**Constructor
	 *
	 * @param mouseLocationController
	 */
	public MouseXYRGBGUI(MouseXYRGBController mouseLocationController) 
	{
		this.mouseLocationController = mouseLocationController;
		
		createMainPane();
		
		setButtonActions();
		
		showStage();
	}
	
	/**Method: createMainPane
	 * Purpose:
	 */
	private void createMainPane()
	{
		bPane = new BorderPane();
		bPane.getStyleClass().add("borderPane1");
		
		btStart = new Button("Start");
		btStart.getStyleClass().add("button1");
		
		btPause = new Button("Pause");
		btPause.getStyleClass().add("button1");
		
		btExit = new Button("Exit");
		btExit.getStyleClass().add("button1");
		
		hBox = new HBox(20);
		hBox.getChildren().addAll(btStart,btPause,btExit);
		
		textArea = new TextArea();
		textArea.getStyleClass().add("textArea1");
		bPane.setCenter(textArea);
		
		bPane.setTop(hBox);
	}
	
	/**Method: setButtonActions
	 * Purpose:
	 */
	private void setButtonActions()
	{
		btStart.setOnAction(e ->
		{	
			mouseLocationController.setKeepLooping(true);
			mouseLocationController.findLocations();
		});
		
		btPause.setOnAction(e ->
		{
			mouseLocationController.setKeepLooping(false);
		});	
		
		btExit.setOnAction(e ->
		{	
			System.exit(0);
		});		
		
	}
	
	
	/**Method: showStage
	 * Purpose:
	 */
	private void showStage()
	{
		Stage stage = new Stage();
		Scene scene = new Scene(bPane);
		scene.getStylesheets().add("file:MouseXYRGB.css");
		stage.setTitle("Empyrean Solutions");
		stage.setScene(scene);
		stage.setHeight(400);
		stage.setWidth(240);
		stage.setResizable(false);
		stage.setX(200);
		stage.setY(200);
		stage.show();		
	}
	
	/**Method: getTextArea
	 * Purpose:
	 * @return
	 */
	public TextArea getTextArea()
	{
		return textArea;
	}
	
}
