import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String st = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(st);
       StringBuilder a = sb.reverse();
       if (a.toString().equals(st)){
           System.out.println("yes");
       }
       else {
           System.out.println("no");
       }
    }
}