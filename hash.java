
import java.util.HashMap;

class hash {
    public static void main(String args[]){
        String str = "aaabcccddeef";
        //  String words[] = str.split(" ");
        // HashMap<String,Integer> map = new HashMap<>();
        // for(String i : words){
        //  map.put(i, map.getOrDefault(i, 0) + 1);
        // }
      char arr[] = str.toCharArray();

       HashMap<Character,Integer> map = new HashMap<>();
       for(char i : arr){
        map.put(i, map.getOrDefault(i,0)+1);
       }
       System.out.println(map);
       int cnt = 0;
       for (char i : arr) {
       if (map.get(i) == 1) {
        cnt++;
       
        }
        if(cnt ==2 ){
             System.out.println("second non repeating  character : " + i);
        break;
        }
       }
      //  System.out.println(map);
                    



     // end  of main method 
     

    }
}