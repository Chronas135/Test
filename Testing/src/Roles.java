import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Roles {
	//chekcs
	String champs = "ListOfChampions.txt";
	public String getTopRole() throws FileNotFoundException {
		File_Reader f = new File_Reader();
		String check[] = f.file_Reader(champs);
		int champion = this.random(check);
		for (int i = 0; i < champion; i+= 1) {
			System.out.println(check[i] + ": " + i);
		}
		return check[champion];
		
	}
	
	public List <String> toList(){
		
	}
	public int random(String[] check) {
		Random rand = new Random();
		int upperbound = check.length - 1;
		int int_random = rand.nextInt(upperbound);
		return int_random;
	}

}
