package bullscows;

import java.util.Scanner;


public class Main {
    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        String [] secretCode = {"9", "3","0","5"};
        int bull = 0;
        int cow = 0;
        int none= 0 ;
        String a = scanner.nextLine();
        String number[] = a.split("");
//        int number1 = Integer.parseInt(number[0]);
//        int number2 = Integer.parseInt(number[1]);random
//        int number3 = Integer.parseInt(number[2]);
//        int number4 = Integer.parseInt(number[3]);
        for (int i = 0; i < 4; i++) {
           if  (a.contains(secretCode[i]) && !number[i].equals(secretCode[i])){
               cow++;
           }
           else if (number[i].equals(secretCode[i])){
               bull++;
           }
        }
        if (bull>0 && cow==0){
            System.out.println("Grade: "+bull+" bull(s). The secret code is 9305." );
        }
        else if (bull>0 && cow>0){
            System.out.println("Grade: "+bull+" bull(s) and "+cow+" cow(s). The secret code is 9305." );
        }
        else if (cow>0 && bull==0){
            System.out.println("Grade: "+cow+" cow(s). The secret code is 9305." );
        }
        else {
            System.out.println("Grade: None. The secret code is 9305." );
        }
        }}




