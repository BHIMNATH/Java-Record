import java.io.*;

public class IOTest{
	public static void main(String[] args) throws IOException{
		String string;
		int integer;
		double doubles;
		char character;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		string=br.readLine();
		System.out.println("Enter Integer");
		integer=Integer.parseInt(br.readLine());
		System.out.println("Enter double");
		doubles=Double.parseDouble(br.readLine());
		System.out.print("You entered String:"+string+" Integer:"+integer+" Double:"+doubles);
	}
}