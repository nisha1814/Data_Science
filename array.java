import java.util.Scanner;
 class array{
    public static void main(String args[])
    {
        int i;
        int[] a=new int[5];
        Scanner scan=new Scanner(System.in);
        for(i=0;i<5;i=i+1)
        {
        
        a[i]=scan.nextInt();

        }
        for(i=0;i<5;i=i+1)
        {
            System.out.print(a[i]);
        }
    }
 }