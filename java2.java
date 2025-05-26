import java.util.Scanner;
public class java2{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your marks, 0-100");
        int marks=input nextInt();
        String grade;
        if(marks>=90){
            grade="A+";
        }
    else if(marks>=80){
        grade="A";
    }
    else if(marks>=70){
        grade="B+";
    }
    else if(marks>=60){
        grade="B+";
    }
    else if(marks>=50){
        grade="C+";
    }
    else if(marks>=40){
        grade="C";
    }
    else{
        grade="F";
    }
    System.out.println("The grade you obtained"+grade);
    input.close();
    }
}