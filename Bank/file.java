
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

class file {
    public static void main(String args[]){
        System.out.println("hello wolr d");
        try {
            FileWriter file = new FileWriter("new.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to the file writing program!");
            System.out.println("Please enter the data you want to write to the file txt .");
            System.out.println("Enter your name:");
            String name = sc.nextLine();    
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            file.write("Name: " + name + "\n");
            file.write("Age: " + age + "\n");
            file.close();
            sc.close();
            System.out.println("Data written to file successfully.");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } 

        
            // Ensure resources are closed properly
            // read from the file 
            try {
                File file = new File("new.txt");
                Scanner fileScanner = new Scanner(file);
                System.out.println("Reading from file:");
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println(line);
                }
            } catch (Exception e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
            }
        
        
    }
}