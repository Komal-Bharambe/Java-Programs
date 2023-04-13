public class hollow_rectangle {
    public static void rectangle(int totalrows, int totalcols){
        for(int row = 1; row<=totalrows; row++){ // it represent totalrows
            for(int col = 1; col<= totalcols; col++){ // it represent total cols
                // cell(i-j)
                if(row == 1 || row == totalrows || col == 1 || col == totalcols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rectangle(30,10);
    }
}
