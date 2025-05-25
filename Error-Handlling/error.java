import java.util.*;
class error {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    //     int a=1;
    //    while(a!=99){

       
    //     System.out.println("enter a: ");
    //      a = sc.nextInt();
    //     System.out.println("enter b ");
    //     int b = sc.nextInt();
    //     try {
    //         int c = a/b;
    //         System.out.println("the result is : " +c);
    //     } catch (Exception e) {
    //         System.out.print("we can not divide by zero");
    //     }
    //    }
    int arr[] = {12,32,42,-122,103};
    int n = arr.length;
        int index =2;
        // while(index!=0){
        
        
        //     try {
        //         System.err.println("enter index : ");
        //          index = sc.nextInt();
        //         System.out.println("the value is " +arr[index]);
        //     } catch (ArrayIndexOutOfBoundsException e) {
        //         System.out.println("The index is invalid ");
        //       }finally{
        //         System.out.println("Everything is fine \nenter index 0 to close the progaram");
        //     }

        // }
     int maxi = 0;
     int sum = 0;
        for(int i = 0; i<n;i++){
          sum+=arr[i];
           if(maxi<sum){
            maxi = sum;
           }
          if(sum<0){
            sum = 0;
          }

        }
        System.out.println(maxi);
        

        

        
 
    }
}