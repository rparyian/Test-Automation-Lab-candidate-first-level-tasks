import java.util.*;

public class MainTask {
    public static ArrayList<Student> listOfStudents = new ArrayList<>();
    public static void main(String[] args) {
        listOfStudents=createListOfStudents();
        printListOfStudentsByDepartment("Строительный");
        printListOfStudentsBornedAfterDate(new GregorianCalendar(1988,0,1) );
        printListOfStudentsByGroup(301);
        printListOfStudentsByAllCourses();
        printListOfStudentsByAllDepartments();
    }
    public static ArrayList<Student> createListOfStudents(){
        ArrayList<Student> listOfStudents = new ArrayList<Student>(){
            {
                add(new Student(1,"Иванов","Иван", "Иванович",
                        new GregorianCalendar(1990,12,12),
                       "Красная 1", "232-22-32","Строительный", 1,101 ));
                add(new Student(2,"Иванова","Жанна", "Ивановна",
                        new GregorianCalendar(1989,4,2),
                        "Красная 15", "232-242-32","Менеджмента", 1,101 ));
                add(new Student(3,"Петров","Петр", "Иванович",
                        new GregorianCalendar(1984,2,11),
                        "Красная 1", "232-22-32","Строительный", 2,201 ));
                add(new Student(4,"Нос","Николай", "Семенович",
                        new GregorianCalendar(1988,3,1),
                        "Красная 1", "232-22-323","Маркетинга", 3,301 ));
            }
        };
    return listOfStudents;
    }
    public static void printListOfStudentsByDepartment(String department){
        for (Student student:
             listOfStudents) {
            if (student.getDepartment()==department)
                System.out.println(student);
        }
    }
    public static void printListOfStudentsBornedAfterDate(Calendar date){
        for (Student student:
             listOfStudents) {
            if ((student.getDateOfBirth().compareTo(date))==1)
                System.out.println(student);
        }
    }
    public static void printListOfStudentsByGroup (int group){
        for (Student student:
             listOfStudents) {
            if (student.getGroup()==group)
                System.out.println(student);
        }
    }
    public static void printListOfStudentsByCourse (int course){
        for (Student student:
                listOfStudents) {
            if (student.getCourse()==course)
                System.out.println(student);
        }
    }
    public static void printListOfStudentsByAllCourses (){
        HashSet<Integer> hashSet=new HashSet<>();
        for (Student student:
                listOfStudents) {
           if (hashSet.add(student.getCourse()))
            printListOfStudentsByCourse(student.getCourse());
        }
    }
    public static void printListOfStudentsByAllDepartments (){
        HashSet<String> hashSet=new HashSet<>();
        for (Student student:
                listOfStudents) {
            if (hashSet.add(student.getDepartment()))
                printListOfStudentsByDepartment(student.getDepartment());
        }
    }
}
