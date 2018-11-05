package com.scruffybeard.fequencyofcharacters;

public class FerquencyOfCharacters {

	public static void main(String[] args) {
		
		String string = "Picture Perfect"; //String to be counted 
		
		int frequencyArray[] = new int[string.length()]; 
		
		char stringArray[] = string.toCharArray();
		
		
		//Count characters
		
		for (int i = 0; i < string.length(); i++) {
			
			frequencyArray[i] = 1;
			
			for(int j = i + 1; j < string.length(); j++) {
				
				if(stringArray[i] == stringArray[j]) frequencyArray[i]++;
				
				stringArray[j] = '0'; //To avoid revisiting a character
				
			}// For j
			
		}// For i
		
		
		//Display results
		
		System.out.println("Characters and their corresponding frequencies");
		
		for (int i = 0; i < frequencyArray.length; i++) {
			
			if (stringArray[i] != ' ' && stringArray[i] != '0') {
				
				System.out.println(stringArray[i] +"-" + frequencyArray[i]); 
				
			}//print if
		
		}//Print loop
	
	}// main()

}// Class
