package mouselocations;

import java.awt.MouseInfo;
import java.awt.Point;

import javafx.application.Application;
import javafx.stage.Stage;

public class MouseLocations extends Application {

	@Override
	public void start(Stage arg0) throws Exception 
	{
		Point p;

		while(true)		
		{
				try 
				{
					Thread.sleep(2000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				
				p = MouseInfo.getPointerInfo().getLocation();
				System.out.println((int)p.getX() + "  " + (int)p.getY());		
		}	
	}

	public static void main(String[] args) 
	{
		launch(args);

	}
}
