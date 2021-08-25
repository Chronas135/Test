import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Reader {
	public static void File_Reader(String file_Name) throws FileNotFoundException {
		File file = new File(file_Name);
		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			String record = scan.nextLine();
			Scanner sc = new Scanner(record);
			sc.useDelimiter(",");
		}
	}
}
