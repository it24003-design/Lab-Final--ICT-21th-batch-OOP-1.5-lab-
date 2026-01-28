class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }

    public int getMarks() {
        return marks;
    }
}

class Classroom {
    private Student[] students;

    public Classroom(Student[] students) {
        this.students = students;
    }

    public void showTopper() {
        if (students.length == 0) {
            System.out.println("No students in the classroom.");
            return;
        }

        Student topper = students[0];
        for (Student s : students) {
            if (s.getMarks() > topper.getMarks()) {
                topper = s;
            }
        }
        System.out.print("Topper: ");
        topper.display();
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] studentArray = {
            new Student("Samir", 85),
            new Student("Khalid", 92),
            new Student("Raiyyan", 78)
        };

        Classroom c = new Classroom(studentArray);

        System.out.println("All Students:");
        for (Student s : studentArray) {
            s.display();
        }

        System.out.println();

        c.showTopper();
    }
}
