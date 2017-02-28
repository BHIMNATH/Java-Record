import java.io.*;
class StringOperations{
	String string1;
	String string2;
	StringOperations(String s1,String s2){
			this.string1=s1;
			this.string2=s2;
	}
	public void OperationResult(){
			System.out.println("Length "+string1.length());
			System.out.println("After Concatenation: "+string1.concat(string2));
      		System.out.println("Character at position 2: "+string1.charAt(2));
      		System.out.println("Replace e by X: "+string1.replace('e','X'));
      		System.out.println("Substring after 3 characters: "+string1.substring(3));
      		System.out.println("Lowercase: "+string1.toLowerCase());
      		System.out.println("Uppercase: "+string1.toUpperCase());

	}
}
public class StringOperationTest{
	public static void main(String[] args){
		StringOperations sOp=new StringOperations("Computer","Science");
		sOp.OperationResult();
		}
	}
