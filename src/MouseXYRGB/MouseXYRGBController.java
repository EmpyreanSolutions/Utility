package MouseXYRGB.controller;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

import MouseXYRGB.view.MouseXYRGBGUI;

/**Class: MouseXYRGBController.java
 * @author Kenneth Sales
 * June 7, 2018
 * 
 * This class - describe what the class does
 *
 * Purpose: - describe the purpose of the class
 */
public class MouseXYRGBController 
{
	private MouseXYRGBGUI mlGUI;
	private Robot robot;
	Point p;
	Color color;
	boolean keepLooping;

	/**Constructor
	 *
	 */
	public MouseXYRGBController() 
	{
		mlGUI = new MouseXYRGBGUI(this);
		
		try 
		{
			robot = new Robot();
		} 
		catch (AWTException e) 
		{
			System.out.println("Unable to instantiate Robot");
			System.exit(0);
		}
	}
	
	/**Method: findLocations
	 * Purpose:
	 */
	public void findLocations()
	{
		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				while(keepLooping)		
				{
						try 
						{
							Thread.sleep(2000);
						} 
						catch (InterruptedException e) 
						{
							System.out.println("Unable to start Thread inside of findLocations");
							System.exit(0);
						}
						
						p = MouseInfo.getPointerInfo().getLocation();
						color = robot.getPixelColor((int)p.getX(), (int)p.getY());
						mlGUI.getTextArea().appendText("\n" + Integer.toString((int)p.getX()) + "  " + Integer.toString((int)p.getY())
						+ "     " + color.getRed() + "  " + color.getGreen() + " " + color.getBlue());
				}	
				
				
			} // end of run
		}).start(); // end of thread
	}
	
	/**Method: setKeepLooping
	 * Purpose:
	 * @param keepLooping
	 */
	public void setKeepLooping(boolean keepLooping)
	{
		this.keepLooping = keepLooping;
	}

}
