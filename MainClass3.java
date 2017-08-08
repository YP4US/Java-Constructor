//Method can accept multiple arguments
//Nmae: Yogesh Pawar

class Demo 
{
	int prn;
	String name;
	Demo(int arg1,String arg2)
	{
		prn=arg1;
		name=arg2;
	}

	void display()
	{
	System.out.println("PRN is:"+prn);
	System.out.println("Name is:"+name);
	}
}

class MainClass3
{
	public static void main(String args[])
	{
		Demo d=new Demo(47,"Yogesh Pawar");
		d.display();
	}
}