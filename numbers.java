class numbers {
    // wap to find if a number is a majic number or not
    // A number is a magic number if the sum of its digits is 1 or 0
    public static boolean isMagicNumber(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return (sum == 1 || sum == 0);
    }
    // wap to find if a number is buzz number or not
    // A number is a buzz number if it is divisible by 7 or ends with 7
    public static boolean isBuzzNumber(int n) {
        return (n % 7 == 0 || n % 10 == 7);
    }
    //wap to check if a number is duck number or not
    // A number is a duck number if it has zeroes present in it but not at the beginning
    public static boolean isDuckNumber(int n) {
        String str = Integer.toString(n);
        return (str.indexOf('0') != -1 && str.charAt(0) != '0');
    }
    // wap to find sum of aleternate digits of a number
    public static int sumOfAlternateDigits(int n) {
        int sum = 0;
        boolean alternate = true;
        while (n > 0) {
            if (alternate) {
                sum += n % 10;
            }
            n /= 10;
            alternate = !alternate;
        }
        return sum;
    }
    // wap to swap first and last digit of a number
    public static int swapFirstAndLastDigit(int n) {
        String str = Integer.toString(n);
        if (str.length() == 1) {
            return n; // No swap needed for single digit numbers
        }
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        String swapped = last + str.substring(1, str.length() - 1) + first;
        return Integer.parseInt(swapped);
    }
    // wap to swap two numbers without using third variable
    public static void swapWithoutThirdVariable(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    // wap to print fibonacci series  upto n terms
    public static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
    // wap to print fibbonacci series in a geven range
    public static void fibonacciSeriesInRange(int start, int end) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series in range: ");
        while (a <= end) {
            if (a >= start) {
                System.out.print(a + " ");
            }
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
    // wap to find gcd of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // wap to find lcm of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
// wap to find if a number a harshad number or not 
// A number is a Harshad number if it is divisible by the sum of its digits
public static void isHarshadNumber(int n) {
    int sum = 0;
    int temp = n;
    while (temp > 0) {
        sum += temp % 10;
        temp /= 10;
    }
    if (n % sum == 0) {
        System.out.println(n + " is a Harshad number.");
    } else {
        System.out.println(n + " is not a Harshad number.");
    }
}
// wap to find if a number is perfect number or not
// A number is a perfect number if it is equal to the sum of its proper divisors
public static void isPerfectNumber(int n) {
    int sum = 0;
    for (int i = 1; i <= n / 2; i++) {
        if (n % i == 0) {
            sum += i;
        }
    }
    if (sum == n) {
        System.out.println(n + " is a perfect number.");
    } else {
        System.out.println(n + " is not a perfect number.");
    }
}

    public static void main(String[] args) {
      
    }
}