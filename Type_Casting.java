package Type_Casting.com;

public class Type_Casting {

	public static void main(String[] args) {		
		byte num1 = 8;	//Widening	
		int num2 = num1;			
		System.out.println(num2);
		
		long val1 = 153245552l;	//Narrowing		
		int val2 = (int) val1;		
		System.out.println(val2); 
		
		float dec1 = 53.42f; //Widening
		double dec2 = dec1;
		System.out.println(dec2);
		
		double dec3 = 1234563456278.76d; //Narrowing
		float dec4 = (float) dec3;
		System.out.println(dec4);		
				
		int val3 = 25;
		long val4 = 50000000000l;
		
		val4 = val3;	//Narrowing
		val3 = (int) val4; //Narrowing already applied 
		System.out.println(val3);
		System.out.println(val4);
	}

}
