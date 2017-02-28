 interface Interface1
{
   public void callMe();
}

 interface Interface2 extends Interface1
{
   public void message(String message);
}

class Interface3 implements Interface1,Interface2{

	public void callMe(){
		System.out.println("This is Interface1");
	}
	public void message(String message){
		System.out.println(message);
	}
}
public class TestInterface{
	public static void main(String[] args){
		Interface3 iface=new Interface3();
		iface.callMe();
		iface.message("Welcome");
	}
}

