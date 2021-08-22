import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String stArr = scanner.nextLine();
        String [] arr2= stArr.split("");
        int [] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(arr2[i]);
        }
        if (arr[0]+arr[1]+arr[2]==arr[3]+arr[4]+arr[5]){
            System.out.println("Lucky");
        }
        else {
            System.out.println("Regular");
        }
    }
}