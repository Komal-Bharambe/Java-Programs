public class floydtraingle {
    public static void main(String[] args) {
        int count = 1;
        int n = 5;
        for(int line = 1; line <= n; line++){
            for(int j = 1; j <= line; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
