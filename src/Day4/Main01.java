package Day4;

import javax.xml.transform.dom.DOMResult;

public class Main01 {
    public static void main(String[] args) {

        System.out.println("main.Main01()");

        Student studentOne = new Student();
        Teacher teacherOne = new Teacher();

        studentOne.setName("Dorekofu");
        studentOne.setBirthday(1994);
        studentOne.setCode("001");


        System.out.println("Sinh vien thu 1: ");
        System.out.println("Year: " + studentOne.getBirthday());
        System.out.println("Name: " + studentOne.getName());
        System.out.println("Code: " + studentOne.getCode());

        System.out.println("Giao vien thu 1: ");

    }
}
