package Java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Count testReader=new Count();
        boolean input=true;
        while(input) {
            System.out.println("Enter Text ");
            String str=sc.nextLine();
            input=testReader.count(str);
        }
        System.out.println("Total count of Characters : "+ testReader.getCharacter());
        System.out.println("Total no of Lines are : "+testReader.getLine());
    }
}
