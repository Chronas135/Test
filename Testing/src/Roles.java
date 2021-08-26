import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Roles {
	//chekcs
	String topChamps = "Top.txt";
	public String getTopRole() throws FileNotFoundException {
		File_Reader f = new File_Reader();
		String check[] = f.file_Reader(topChamps);
		int champion = this.random(check);
		return check[champion];
		
	}
	
	public int random(String[] check) {
		Random rand = new Random();
		int upperbound = check.length - 1;
		int int_random = rand.nextInt(upperbound);
		return int_random;
	}

}
