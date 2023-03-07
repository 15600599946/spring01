package test01;

public class Student1 {


    private static  Student1 instance = null;


    private Student1(){

    }


    public static Student1 getInstance(){
        if(instance==null){
            return new Student1();
        }
        return instance;
    }
}
class T{
    public static void main(String[] args) {

//        test01.Student student = new test01.Student();

        Student1 student = Student1.getInstance();

    }

}
class F{
    public static void main(String[] args) {
        Student1 student = Student1.getInstance();
    }
}
