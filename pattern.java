class pattern {
     public static void main( String[] args){
    int n =10;
        //  *****
        //   ****
        //    ***
        //     **
        //      *
                            
        // for(int i = 1;i<=n;i++){  
  
        //     for(int j = 1;j<=i;j++){
        //         System.out.print(" ");

        //     }
        //     for(int k =5;k>=i;k--){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //    for(int i = 1;i<=n;i+=2){  //   *
        //                              //   ***
        //                              //  *****
        //       for(int k =5;k>=i;k-=2){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("*");

        //     }
        //     System.out.println("");
          
        // }


        //    for(int i = 1;i<=n;i+=2){  //   *
        //                              //   ***
        //                              //  *****
        //       for(int k =1;k<=i;k+=2){
        //         System.out.print(" ");
        //     }
        //     for(int j = 5;j>=i;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
          
        // }
// printing the letter H using *
            // for(int i = 1;i<=n;i+=2){  
             
            //     for(int j = 1;j<=n;j++){
            //         if(j==1 || j==n || (i==n/2 && j>1 && j<n)){
            //             System.out.print((char)(65+(i-1)/2));
            //         }else{
            //             System.out.print(" ");
            //         }
            //     }
            // System.out.println("");
            // }


    for(int i = 1;i<=n;i++){  //          *
                                     //   ***
             if(i<(n/2)){                       //  *****
              for(int k =n;k>=i;k-=2){
                System.out.print(" ");
              }
             }
            if(i>(n/2)){
            for(int l=n;l>=i;l-=2){
                System.out.print(" ");
            }
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");

            }
    
            System.out.println("");
          
        }




        }
        }
