import java.util.Scanner;

class average{
    public static void main(String args[]){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sum = a+b+c;
        System.out.println(sum/3);
        
    }
}