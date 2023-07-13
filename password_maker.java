import java.util.Random;
import java.util.Scanner;

public class password_maker {
    static Scanner scanner=new Scanner(System.in);
    static char[] numbers={'1','2','3','4','5','6','7','8','9','0','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m',',','.','/','|','-','+','='};
   
    
    static Random rand_number=new Random();
    

    public static void main(String[] args) {
        
        generate();
        
    }
    public  static int input_length(){
        System.out.println("How long?");
        int x=scanner.nextInt();
    

        return x;

    }
    public static void generate(){
        int y=input_length();
        char[] password=new char[y];
        for (int i = 0; i < y; i++) {
            password[i]=numbers[rand_number.nextInt(numbers.length)];

            
        }
        System.out.println("Your password is");
        for (int i = 0; i < password.length; i++) {
            System.out.print(password[i]+"");
        }

    }


}