package week2.day2.assignment1;

public class Charactercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int totalCharacters = 0;
        char temp;
        for (int i = 0; i < str.length(); i++) {

            temp = str.charAt(i);
            if (temp == 'e')
                totalCharacters++;
	}
        System.out.println("e appears " + totalCharacters + " times in example");
		
	}

}
