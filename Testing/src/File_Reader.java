import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Checks
public class File_Reader {
	public String fileName(String file) {
		return file;
	}
	
	public String[] file_Reader(String file_Name) throws FileNotFoundException {
		File file = new File(file_Name);
		Scanner scan = new Scanner(file);
		scan.useDelimiter(",");
		Scanner sizeCheck = new Scanner(file);
		sizeCheck.useDelimiter(",");
		int i = 0;
		//Getting Size or Array
		while (sizeCheck.hasNext()) {
			String record = sizeCheck.next();
			i+=1;			
		}
		String champs [] = new String[i];
		//Initializing the the Text to Array
		int j = 0;
		scan.useDelimiter(",");
		while (scan.hasNext()) {
			String record = scan.next();
			champs[j] = record;
			j+= 1;
		}
		return champs;
	}

}
