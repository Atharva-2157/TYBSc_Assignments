// javap -c ex1Samp2

// PS C:\Users\Atharva\Desktop\Java TYBSc> javap -c ex1Samp2
// Compiled from "ex1Samp2.java"
// public class ex1Samp2 {
//   int num;

//   public ex1Samp2();
//     Code:
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: aload_0
//        5: iconst_0
//        6: putfield      #7                  // Field num:I
//        9: return

//   public ex1Samp2(int);
//     Code:
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: aload_0
//        5: iload_1
//        6: putfield      #7                  // Field num:I
//        9: return

//   public static void main(java.lang.String[]);
//     Code:
//        0: new           #8                  // class ex1Samp2
//        3: dup
//        4: invokespecial #13                 // Method "<init>":()V
//        7: astore_1
//        8: aload_0
//        9: arraylength
//       10: ifle          52
//       13: aload_0
//       14: iconst_0
//       15: aaload
//       16: invokestatic  #14                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
//       19: istore_2
//       20: new           #8                  // class ex1Samp2
//       23: dup
//       24: iload_2
//       25: invokespecial #20                 // Method "<init>":(I)V
//       28: astore_3
//       29: getstatic     #23                 // Field java/lang/System.out:Ljava/io/PrintStream;
//       32: aload_1
//       33: getfield      #7                  // Field num:I
//       36: invokevirtual #29                 // Method java/io/PrintStream.println:(I)V
//       39: getstatic     #23                 // Field java/lang/System.out:Ljava/io/PrintStream;
//       42: aload_3
//       43: getfield      #7                  // Field num:I
//       46: invokevirtual #29                 // Method java/io/PrintStream.println:(I)V
//       49: goto          60
//       52: getstatic     #23                 // Field java/lang/System.out:Ljava/io/PrintStream;
//       55: ldc           #34                 // String insufficient arguments
//       57: invokevirtual #36                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V        
//       60: return
// }