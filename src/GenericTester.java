import FileIO.TextFileReader;
import FileIO.TextFileWriter;

public class GenericTester
{

	public static void main(String[] args)
	{
		TextFileWriter textFileWriter = new TextFileWriter("testTextFile");
		textFileWriter.addRecord("this is an appended sentence using the custom writer.");
		textFileWriter.addRecord("\n");
		String[] strings = {"a", "sentence", "with", "tabs"};
		String[] strings2 = {"a", "sentence", "with", "space"};
		textFileWriter.addRecordWithTabs(strings);
		textFileWriter.addRecord("\n");
		textFileWriter.addRecordWithSpace(strings2);
		
		TextFileReader textFileReader = new TextFileReader("testTextFile");
		String string = textFileReader.readNextLine();
		System.out.println(string);
		string = textFileReader.readNextLine();
		System.out.println(string);
		string = textFileReader.readNextLine();
		System.out.println(string);
	}

}
