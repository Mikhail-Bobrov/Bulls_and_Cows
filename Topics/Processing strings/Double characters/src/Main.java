import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);

              sb.append(c).append(c);


        }
        String output = sb.toString();
        System.out.println(output);
    }
}