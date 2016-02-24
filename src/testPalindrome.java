import java.util.*;

public class testPalindrome {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 5 words");
		
		ArrayList<String> array = new ArrayList<String>();
		
		int n=0;
		while(n<5){
				array.add(scanner.next());
				n++;
		}
		for(String str: array){
			Word myword = new Word(str);
			myword.reversePalidrome();
		}
		
	}
}
