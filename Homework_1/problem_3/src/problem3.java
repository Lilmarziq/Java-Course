
public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "To be or not to be, that is the question;"
                +"Whether `tis nobler in the mind to suffer"
                +" the slings and arrows of outrageous fortune,"
                +" or to take arms against a sea of troubles,"
                +" and by opposing end them?";

        int spaces = 0,
            vowels = 0,
            letters = 0;

        // change to lower case to reduce number of object
        String input = text.toLowerCase();

        // go through every character in string to compare
        for (int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);

            //number of space
            if(c == ' ')
            {
                spaces++;
            }
            //number of vowels
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            {
                vowels++;
            }

            // number of letter (skip if the character is not a letter)
            if(c == ' ' || c == '`' || c == ';' || c == '?' || c == ',')
            {
                continue;
            }
            letters++;
        }

        System.out.println("The text contained: \n" + vowels + " vowels, \n" + (letters - vowels) + " consonants, \n" + spaces + " spaces, \n" + letters + " letters.");

		
		
	}
}
