abstract class Demo
{
    public int i, j;

    public int Add(int a, int b)    // Concrete method
    {
        return a + b;
    }
}

// Child class
class Marvellous extends Demo
{
}

class Abstract_demo
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();

        System.out.println("Addition is : " + mobj.Add(10, 20));
    }
}