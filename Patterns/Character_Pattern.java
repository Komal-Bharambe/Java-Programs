public class Character_Pattern {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 5;
        for(int line = 1; line<=n; line++){
            for(int chars = 1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
