import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Matmusa", 21, "Java"));
        students.add(new Student("Abdymomun", 18, "Java"));
        students.add(new Student("Akylay", 15, "Js"));
        students.add(new Student("Baha", 19, "Java"));
        students.add(new Student("Nurlan", 20, "Js"));
        students.add(new Student("Adilet", 22, "Java"));
        students.add(new Student("Kasym", 18, "Js"));
        students.add(new Student("Anara", 23, "Js"));
        students.add(new Student("Manas", 27, "Java9"));
        students.add(new Student("Erzhigit", 19, "Java9"));

        System.out.println("PeakSoft студенттери: ");
        allStudents(students);


        ArrayList<Student> java = searchGroup(students, "Java");
        ArrayList<Student> js = searchGroup(students, "Js");
        System.out.println("\n Java students:");
        allStudents(java);
        System.out.println("\n Js students:");
        allStudents(js);

        ArrayList<Student> ageNorm = searchAge(students, 19,23);
        System.out.println("\nЖашы 19дан 23ко чейинки студенттер:");
        allStudents(ageNorm);

        ArrayList<Student> aStudents = searchStartName(students,"A");
        System.out.println("\nЖашы А тамгасынан башталган студенттер:");
        allStudents(aStudents);
    }
    private static void  allStudents(ArrayList<Student> students){
        for (Student s : students){
            System.out.println("Аты: "+s.getName() +" | Группасы: "+s.getGroup()+ " | Жашы: "+s.getAge());
        }
    }
    private static ArrayList<Student> searchGroup(ArrayList<Student> students, String group){
        ArrayList<Student>result= new ArrayList<>();
        for(Student a : students){
            if(a.getGroup().equals(group)){
              result.add(a);
            }
        }return result;
    }
    private static ArrayList<Student>searchAge(ArrayList<Student> students, int minAge, int maxAge){
        ArrayList<Student>result= new ArrayList<>();
        for (Student s : students){
            int a = s.getAge();
            if (a < maxAge && a > minAge){
                result.add(s);
            }
        }return result;
    }
    private static ArrayList<Student>searchStartName(ArrayList<Student> students, String start){
        ArrayList<Student> rus = new ArrayList<>();
        for (Student c : students){
            String name = c.getName();
            if (name.startsWith(start)){
                rus.add(c);
            }
        }return rus;
    }
}