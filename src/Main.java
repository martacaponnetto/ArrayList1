import java.util.ArrayList;

/*Creare una classe Student che accenti nel costruttore il parametro
 name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
*/
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Mia", 24));
        studentList.add(new Student("Bea", 25));
        studentList.add(new Student("Gaia", 27));
        studentList.add(new Student("Sofia", 23));
        stampaStudents(studentList);
        System.out.println("collex di studenti :");
        studentList.add(new Student("Gio", 19));
        studentList.add(new Student("Leo", 20));
        studentList.add(new Student("Rocco", 22));
        studentList.add(new Student("Federico", 21));
        System.out.println("\ncollex aggiornata: ");
        stampaStudents(studentList);





    }
    public static void stampaStudents(ArrayList<Student> studentList){
        for(Student student : studentList){
            System.out.println("name: " + student.getName() + ", age: " + student.getAge());
        }

    }
}