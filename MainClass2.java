//Constructor with parameters
//Name: Yogesh Pawar
class Demo
{
	static double j=10.50;
	//userdefined constructor
	Demo(int k,double l)
	{

		j=k+l;
		System.out.println("Running Parameterised constructor of demo class...");
		System.out.println(j);
	}
}

class MainClass2
{
	public static void main(String args[])
	{
		new Demo(12,12.50);
	}
}