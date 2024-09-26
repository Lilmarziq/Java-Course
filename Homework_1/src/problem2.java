
public class problem2 {

	public static void main(String[] args) {
		
		int nValues = 50;
		
		//loop for all numbers until 50
        here: for(int i = 1; i <= nValues; i++)
        {
            // include number that its square root value < 2
            if (Math.sqrt(i)<2)
            {
                System.out.println(i);
            }

            // try and divide by integers up to the square root of the number being tested.
            for (int j = 2; j<= (int)Math.sqrt(i) ;j++)
            {
                // skip number that can be divided with number less than its square root value
                if (i % j == 0) {
                	
                	//set j more than square root to break the loop
                    j = (int)Math.sqrt(i) + 1;
                    
                    continue here; // labeled continue
                }

                // the number cannot be divided  with number less than its square root value is prime number
                if ( j >= (int)Math.sqrt(i) ){
                    System.out.println(i);
                }

            }
        }

	}

}



