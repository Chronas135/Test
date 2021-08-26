import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Check
public class File_Reader {
	public static void File_Reader(String file_Name) throws FileNotFoundException {
		File file = new File(file_Name);
		Scanner scan = new Scanner(file);
		Scanner sizeCheck = new Scanner(file);
		int i = 0;
		while (sizeCheck.hasNext()) {
			String record = scan.nextLine();
			Scanner sc = new Scanner(record);
			sc.useDelimiter(",");
			i+=1;			
		}
		System.out.println(i);
		while (scan.hasNext()) {
			String record = scan.nextLine();
			Scanner sc = new Scanner(record);
			sc.useDelimiter(",");
			
		}
	}
}
