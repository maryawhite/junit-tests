import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {
    //can add a Student to the list of students
    //can get current List of students
    //can get the average,

    List<Student> studentList;
    Student newStudent1;
    Cohort quasar;

    @Before
    public void setUp() throws Exception {
        quasar = new Cohort();
        newStudent1 = new Student(12345L, "Mary");
        studentList = quasar.getStudents();
    }

    @Test
    public void getCohortAverageTest() {
        studentList.add(newStudent1);
        Student student = new Student(67891L, "Charlie");
        studentList.add(student);
        newStudent1.addGrade(90);
        student.addGrade(90);
    }

    @Test
    public void addStudentToListTest() {
        studentList.add(newStudent1);
        assertNotNull(studentList);
        assertEquals(1, studentList.size());
    }

    @Test
    public void getStudentsTest() {
        studentList.add(newStudent1);
        Student student = quasar.getStudents().get(0);
        assertEquals("Mary", student.getName());
        assertEquals(12345L, student.getId());
    }
}