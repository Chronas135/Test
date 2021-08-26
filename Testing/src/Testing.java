import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Testing {
	public static void main (String args[]) throws FileNotFoundException {

		//GUI gui = new GUI();
		File f = new File("Top.txt");
		Scanner sc = new Scanner(new File("/Users/rameshkarki/git/Test/Testing/src/Top.txt"));
		sc.useDelimiter(",");
		System.out.println(f.getName());
		System.out.println(sc.hasNext());
		while(sc.hasNext()) {
			System.out.println("Try");
			System.out.println(sc.nextLine());
		}
		/*String a = sc.nextLine();
		System.out.println(a);
		sc.useDelimiter(",");
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}*/
		
	}
}
