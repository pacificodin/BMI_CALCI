import java.util.*;

public class BMI_CALCI{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n<--------------- WELCOME TO OUR BMI CALCULATOR ---------------->\n");
        System.out.print("Enter your weight in kilogram:");
        Float weight=sc.nextFloat();
        System.out.print("Enter your height in feet:");
        Float height=sc.nextFloat();
        Double height_M=height/3.28;
        Double bmi_w=weight/(height_M*height_M);
        System.out.println("Your BMI weight is:"+bmi_w);
        if(bmi_w<18.5){
            System.out.println("You are inside the underweight catogary.");
        }
        else if(bmi_w>18.5 || bmi_w<25){
            System.out.println("You are inside the normal condition(mean totaly fit).");
        }
        else if(bmi_w>25 || bmi_w<30){
            System.out.println("You are inside the overweight catogary.");
        }
        else{
            System.out.println("Cause you bmi weight >30 so you are inside the obese condition.");
        }
    }
}