class student {
    String name  = "tony";
    int age = 16;
    student(String name , int age){
        name = name;
        age = age;
        System.out.println(name + age);

    }
    void eat(){
        System.out.println("hii i am eating");
    }
}
class inheritance {
  

    public static void main(String args[]){
        
        student s1 = new student("hulk",43);
        

    }
}