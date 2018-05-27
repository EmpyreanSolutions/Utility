package FileIO;

public class GenericTester
{

	public static void main(String[] args)
	{
		TextFileReader textFileReader = new TextFileReader("testTextFile");
		String string = textFileReader.readNextWord();
		System.out.println(string);
		string = textFileReader.readNextWord();
		System.out.println(string);
		string = textFileReader.readNextLine();
		System.out.println(string);

	}

}
