import java.lang.Exception.*;

public class ExceptTest{
	public static void main(String[] args){
		try{
			int a=5,b=0,c;
			c=a/b;
		}
		catch(ArithmeticException e){
			System.out.println("Divide by Zero can't allow!");
		}
		try{
			String s=null;  
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			System.out.println("Null variable can't allow!");
		}
		try{
			String s="abc";  
			int i=Integer.parseInt(s);
		}
		catch(NumberFormatException e){
			System.out.println("Number format exception occured!");
		}
		try{
			int a[]=new int[5];  
			a[10]=50;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bounds!");
		}
		finally{
			System.out.println("Thank u");
		}
	}
}