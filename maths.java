class maths {
    public static void main(String args[]){
        int a = 12349;
         int sum = 0;
         while(a>0){
            int digit = a%10;
            sum = sum + digit;
            a = a/10;
         }
         int b = 012;
            System.out.println("sum of digit is: " + sum+ " b is : "+ b);
    }
}