// printing the arr
import java.util.Scanner;
import java.util.*;
class arr{

    void reverse(int arr[],int n){
        int start = 0;
        int end = n-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            
        }
    }
    void checkodd(int arr[],int n ){
        for(int i = 0;i<n;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i] + " ");
            }
        }
    }
    // 2 sum in array
    void twosum(int arr[],int n,int target){
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("The two numbers are: " + arr[i] + " and " + arr[j]);
                }
            }
        }
    }
    // 2 sum in array using hashmap
    void twosumhash(int arr[],int n,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                System.out.println("The two numbers are: " + arr[i] + " and " + complement);
            }
            map.put(arr[i],i);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
    
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter the value of arr: " + (i+1) + ": ");
            a[i] = sc.nextInt();
        }
         
        for(int i = 0;i< n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
