import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Roles {
	//chekcs
	String champs = "ListOfChampions.txt";
	public String getChampions() throws FileNotFoundException {
		File_Reader f = new File_Reader();
		String check[] = f.file_Reader(champs);
		int champion = this.random(check);
		for (int i = 0; i < champion; i+= 1) {
			System.out.println(check[i] + ": " + i);
		}
		return check[champion];
		
	}
	
	public ArrayList toList() throws FileNotFoundException{
		File_Reader f = new File_Reader();
		String check[] = f.file_Reader(champs);
		int champion = check.length;
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < champion; i+= 1) {
			list.add(check[i]);			
		}
		return list;
	}
	
	//Assign Roles to each Champion
	public ArrayList<List> rolesToChamps() throws FileNotFoundException{
		ArrayList list = new ArrayList();
		list = this.toList();
		int size = list.size();
		Scanner scan = new Scanner(System.in);
		ArrayList<List> champRoles = new ArrayList<List>();
		//Asking user how many roles the champion has
		for(int i = 0; i < size; i+=1) {
			System.out.println("Please type in the number roles for " + list.get(i) + ": ");
			int numOfRoles = scan.nextInt();
			List role = new List();
			//Ask to type role for the number of roles the champ can have
			for (int j = 0; j < numOfRoles; j +=1 ) {
				System.out.println("Please type in the role for " + list.get(i) + ": ");
				String r = scan.next();
				role.add(r);
			}
			champRoles.add(role);
			role = new List();
		}
		return champRoles;
	}
	public int random(String[] check) {
		Random rand = new Random();
		int upperbound = check.length - 1;
		int int_random = rand.nextInt(upperbound);
		return int_random;
	}

}
