public class linearsearch {
    public static int indexvalue(int numbers[], int key){
        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {5,2,8,2,9,6,1};
        int key = 5;
        int index = indexvalue(numbers, key);
        if(index == -1){
            System.out.println("Index not found");
        }
        else{
            System.out.println("Index found " + index);
        }
    
    }
}
