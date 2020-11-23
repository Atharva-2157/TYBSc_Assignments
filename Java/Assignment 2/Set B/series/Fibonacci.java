package series;

public class Fibonacci {
    private int n;

	public Fibonacci(int n) {
		this.n = n;
	}

    public void printSeries() 
    {
        int a = 1, b = 1, result;
        for(int i = 0; i < this.n; i += 1)
        {
            System.out.print(a + "\t");
            result = a + b;
            a = b;
            b = result;
        }
        System.out.println();
    }
}