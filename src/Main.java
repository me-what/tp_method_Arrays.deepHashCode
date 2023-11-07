import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] stringArr = { "tuts","point" };
        int retval = Arrays.deepHashCode(stringArr);
        System.out.println("The Hash Code of stringArr is:" + retval+"\n");


        Integer[] intArr = { 1, 2 };
        int retval2 = Arrays.deepHashCode(intArr);
        System.out.println("The Hash Code of intArr is:" + retval2+"\n");


        Student[] studentArr = { new Student(1, "Julie"), new Student(2, "Robert"), new Student(3, "Adam") };
        int retval3 = Arrays.deepHashCode(studentArr);
        System.out.println("The Hash Code of studentArr is:" + retval3);
    }
}