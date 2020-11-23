public class ex1Samp2 {
    int num;
    public ex1Samp2() {
    num=0;
    }
    public ex1Samp2(int num) {
    this.num = num;
    }

    public static void main(String[] args) {
    ex1Samp2 m1 = new ex1Samp2();
    if(args.length > 0)
    {
        int n = Integer.parseInt(args[0]);
        ex1Samp2 m2 = new ex1Samp2(n);
        System.out.println(m1.num);
        System.out.println(m2.num);
    }
    else
        System.out.println("insufficient arguments");
    }
}

// PS C:\Users\Atharva\Desktop\Java TYBSc> javac ex1Samp2.java   
// PS C:\Users\Atharva\Desktop\Java TYBSc> java ex1Samp2
// insufficient arguments
// PS C:\Users\Atharva\Desktop\Java TYBSc> java ex1Samp2 10 
// 0
// 10