
class Student{
    static int rollno = 1;
    String college ="college";

    public static void main(String[] args) {
        Student test = new Student();
        System.out.println("Integer variable - rollno ="+ test.rollno);
        System.out.println("String variable - college="+ test.college);
        String name =new String("raj");
        System.out.println("String variable - name="+ name);
        test.rollno = test.rollno + 1;


        Student test2 = new Student();
        System.out.println("Integer variable - rollno ="+ test2.rollno);
        System.out.println("String variable - college ="+ test2.college);
        String name2 =new String("ram");
        System.out.println("String variable - name="+ name2);
        test2.rollno = test2.rollno + 1;



    }
}