import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String st1 = scanner.nextLine();
        String [] arr = st1.split(" ");
        String longer = " ";
        for (int i = 0; i < arr.length; i++){
            if (arr[i].length()>longer.length()){
                longer = arr[i];
            }}
        System.out.println(longer);
    }
}