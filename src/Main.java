import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Schrijf een programma
 * 
 * - Dat een serie van willekeurige namen maakt en deze naar een file write. -
 * een functie waarbij u directory listing opvraagt nadat u zelf de gebruiker om
 * een specifieke directory naam vraagt - een functie waarbij u een file delete
 * als deze groter is geworden dan 1000 bytes. (file.size of lenght)
 * 
 */

public class Main {

	public static void main(String[] args) {

//		createTextFile();
		verwijderAlsMeerDan1000();

	}

	private static String[] namen = { "Bryan Doorson", "Juscelino Kartoebi", "Kirsten Mentopawiro", "Enverny Ingebie",
			"Justin Douglas", "Jayantie Mahangroo" };
	private static File textFile = new File("");

//	public void save() {
//		textFile = new File("");
//	}

	public static long createTextFile() {

		textFile = new File("mijntest.txt");
		File dir = new File(".");
		String[] files = dir.list();

		int tries = 0;
		
		if(!textFile.exists()) {
			
		} else {
			while (tries < namen.length) {
				try {
					FileWriter writer = new FileWriter(textFile, true);

					writer.write(namen[tries++] + "\n");
					writer.close();
				} catch (IOException io) {
					System.err.println("Something went wrong:" + io.getMessage());
				}
			}
		}

		return textFile.length();

	}

	public static void verwijderAlsMeerDan1000() {

		if (createTextFile() > 1000) {
			textFile.delete();
		} else if (!textFile.exists()) {
			System.err.println("Kan niets verwijderen omdat file niet bestaat.");
		} else {
			System.err.println("File is niet boven 1000");
		}
	}
}
