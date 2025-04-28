import java.util.Scanner;

class training {
    public static void main(String[] args){
        // check weather a character is uppercase or lowercase
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        
        char  ch = sc.next().charAt(0);
    
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is lowercase letter.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
        // byte   a= 43;
        // byte b = 34;
        // byte c = (byte)(a+b);
        // System.out.println("sum = "+c);
 
        // 
         int a = 'z';
        System.out.println(a);

    

    }
}