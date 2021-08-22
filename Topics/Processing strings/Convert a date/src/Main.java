import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String st = scanner.nextLine();
        String [] arr = st.split("-");
        int [] array =  new int [3];
        for (int i = 0; i < array.length; i++) {
            array[i]= Integer.parseInt(arr[i]);
        }
        System.out.println(array[1]+"/"+array[2]+"/"+array[0]);
    }
}