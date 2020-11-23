package series;

public class Prime {
    private int n;

    public Prime(int n) {
        this.n = n;
    }
    
    public void printSeries() 
    {
        int flag;
        int num = 2;
        System.out.print(2 + "\t");
        while(this.n != 1) 
        {
            flag = 0;
            for(int j = 2; j <= (num/2) + 1; j += 1) 
            { 
                if(num % j == 0) 
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.print(num + "\t");
                this.n -= 1;
            }
            
            num += 1;
        }
        System.out.println();
    }
}
