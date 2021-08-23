import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String st1 = scanner.nextLine();
        StringBuilder sb = new StringBuilder(st1);
        sb.deleteCharAt(sb.length()/2);
        if (sb.length()%2==0){
            System.out.println(sb);
        }
        else {
            sb.deleteCharAt(sb.length()/2);
            System.out.println(sb);
        }
    }
}