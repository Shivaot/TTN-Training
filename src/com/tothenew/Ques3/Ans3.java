package com.tothenew.Ques3;

public class Ans3 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("AbsentClass");
    }
}
class toBeDeleted{
    public void print() {
        System.out.println("hey there");
    }

}
class justToCompile{
    public static void main(String[] args) throws NoClassDefFoundError{
        toBeDeleted obj = new toBeDeleted();
        obj.print();
    }
}
