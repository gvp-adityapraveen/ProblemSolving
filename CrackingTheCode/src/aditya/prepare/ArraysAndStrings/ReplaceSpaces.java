package aditya.prepare.ArraysAndStrings;

public class ReplaceSpaces {
	
	private void replaceSpaces(String input) {
		//input = input.replace(" ", "%20");
		input = replace(input);
		System.out.println(input);
	}
	
	public static void main(String args[]) {
		ReplaceSpaces r = new ReplaceSpaces();
		r.replaceSpaces("Welcome to my World!");
	}
	
	private String replace(String input) {
		int length = input.length();
		StringBuilder b = new StringBuilder(2*length);
		for(int i=0;i<length;i++) {
			if(input.charAt(i)!= ' ') {
				b.append(input.charAt(i));
			}else
			{
				b.append("%20");
			}
		}
		return b.toString();
	}

}
