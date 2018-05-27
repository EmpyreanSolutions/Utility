package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReader
{
	private Scanner input;
	private File file;

	public TextFileReader(String fileName)
	{
		file = new File(fileName);
		try
		{
			input = new Scanner(file);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found.");
			e.printStackTrace();
		}
	}

	public String readNextLine()
	{
		String s = "";
		if(input.hasNextLine())
		{
			s = input.nextLine();
		}
		return s;
	}

	public String readNextWord()
	{
		String s = "";
		if(input.hasNext())
		{
			s = input.next();
		}
		return s;
	}
}
