import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        boolean result = false;
        if ((str.length()==2  && letters.contains(str))){
            result = true;
        }
        else if (str.equals("w")){
            result=true;
        }

        for (int i = 0; i < str.length()-2; i++) {
            if (letters.contains(str.substring(i,i+3))){
                result = true;
            }


        }
        System.out.println(result);
    }
}