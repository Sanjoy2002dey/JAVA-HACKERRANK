package Test;

public class TypeCastingDay4 {

	public static void main(String[] args) {
		float num1 = 9.78f;
		float num2 =10.33f;
	    int myInt1 = (int) num1;
	    int myInt2 =(int) num2;
		String myStr1 = Float.toString(num1);
		String myStr2=  Float.toString(num2);
		
	    System.out.println(num1);       //float output//
	    System.out.println(num2);
	    
	    System.out.println(myInt1);     //int output//
	    System.out.println(myInt2);
	    
	    System.out.println(myStr1);    //string output//  
	    System.out.println(myStr2);
	    
	    System.out.println(myStr1+"  "+myStr2);  //concat//

	}

}
