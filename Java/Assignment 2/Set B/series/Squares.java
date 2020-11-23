package series;

public class Squares {
    private int n;

	
	public Squares(int n) {
		this.n = n;
	}

    public void printSeries() 
    {
        for(int i = 1; i <= this.n; i += 1)
        {
            System.out.print((i*i) + "\t");
        }
    }
    
}