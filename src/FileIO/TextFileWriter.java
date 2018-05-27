package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TextFileWriter
{
	private PrintWriter out;
	private File file;

	public TextFileWriter(String fileName)
	{
		file = new File(fileName);

		try
		{
			out = new PrintWriter(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	public void printStringArray(String[] sAL)
	{
		for(int i = 0; i < sAL.length; i++)
		{
			out.println(sAL[i]);
		}
		out.flush();

	}

	public void printStringArrayList(ArrayList<String> sAL)
	{
		for(int i = 0; i < sAL.size(); i++)
		{
			out.println(sAL.get(i));
			out.flush();
		}
	}

	public void makeRecordFromArray(String[] sAL)
	{
		for(int i = 0; i < sAL.length; i++)
		{
			out.print(sAL[i]);
			out.flush();
		}
	}

	public void addRecord(String s)
	{
		out.append(s);
		out.flush();
	}

	public void addRecordWithTabs(String[] sAL)
	{
		String string = "";
		for(int i = 0; i < sAL.length; i++)
		{
			string += sAL[i] + "\t";
		}
		string.trim();
		out.append(string);
		out.flush();
	}

	public void addRecordWithSpace(String[] sAL)
	{
		String string = "";
		for(int i = 0; i < sAL.length; i++)
		{
			string += sAL[i] + " ";
		}
		string.trim();
		out.append(string);
		out.flush();
	}

}
