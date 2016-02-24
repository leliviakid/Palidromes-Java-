import java.util.*;
	/*
	 * Create a HashMap where the Key is a alphabetic character and the value 
	 * is the number of times that character is found in the given string. 
	 * 
	 * Check if the string is a Palindrome: it should have 1 or 0 countChar 
	 * 
	 * Create the new Palindrome. Firstly append on a string the even chars n/2 times. 
	 * Reverse this string and append it to the first one. Add the odd characters in the middle. 
	 */
public class Word {
	private String word;
	HashMap<Character, Integer> hmap;
	public Word(String wrd){
		this.word=wrd;
	}
	
	public void createMap(){
		hmap= new HashMap<Character,Integer>();
		for(int i=0; i<word.length(); i++){
			Character ch = word.charAt(i);
			int charCount=0;
			for(int j=0; j<word.length(); j++){
				if(ch == word.charAt(j)) charCount++;
			}
			hmap.put(ch, charCount);
		}
	}
	
	public boolean isPalindrome(){
		this.createMap();
		int countOdd=0;
		for (Integer count : hmap.values()) 
		    if(count%2!=0) countOdd++;
		if(countOdd<=1) return true;
		else
			return false;
	}
	
	public void reversePalidrome(){
		if(this.isPalindrome()){
			//this.createMap();
			Character oddChar=null; int countOdd=0; // save the number of times the odd character is present 
			StringBuilder string = new StringBuilder();
			
			for(Map.Entry<Character, Integer> entry : hmap.entrySet()){
				if(entry.getValue()%2==0){
					for(int i=0; i<entry.getValue()/2; i++) 
						string.append(entry.getKey()); 
				}
				else{
					oddChar=entry.getKey();
					countOdd=entry.getValue();
				}
			}

			string = string.append(new StringBuffer(string).reverse());
			
			for(int i=0;i<countOdd; i++){
				string.insert(string.length()/2, oddChar);
			}
			
			System.out.println(string);
		}
		else
			System.out.println(0);
	}
}

