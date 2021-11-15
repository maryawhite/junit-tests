import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    private Student studentX; //if you're using @Before setUp you need to put this field here

    @Before
    public void setUp(){
        studentX = new Student(100500, "mary");
    }

    @Test
    public void testIfNotNull(){
        assertNotNull(studentX);
    }

    @Test
    public void testCreateStudent(){
        Student stu1 = new Student(222, "stu1");
        Student stu2 = null;
        assertNull(stu2);
        assertNotNull(stu1);
    }

    @Test
    public void testStudentFields(){
//        Student sarah = new Student(Long.valueOf(100601L), "sarah");
//        assertSame(Long.valueOf(100601L), sarah.getId());
//        assertSame("sarah", sarah.getName());
//        assertSame(0, sarah.getGrades().size());

        Student sally = new Student(1L, "sally");
        assertSame(1L, sally.getId());   //why does this work, but the one above doesn't?
        assertSame("sally", sally.getName());
        assertSame(0, sally.getGrades().size());
    }

    @Test
    public void testIfIdIsSet(){
        Student student1 = new Student(100700, "mary");
        assertEquals(100700, student1.getId(), 0);
    }

    @Test
    public void testIfNameIsSet(){
        Student student1 = new Student(100500, "mary");
        String expected = "mary";
        String actual = student1.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testAddGrade(){
        Student student1 = new Student(100500, "mary");
        student1.addGrade(99);
        assertEquals(1, student1.getGrades().size());
    }

    @Test
    public void testGetGrades(){
        Student student1 = new Student(100500, "mary");
        student1.addGrade(99);
        assertFalse(student1.getGrades().isEmpty());
    }

    @Test
    public void testGetGradeAverage(){
        Student student1 = new Student(100800, "mary");

        student1.addGrade(90);
        student1.addGrade(100);
        int expected = 95;
        int actual = (int) student1.getGradeAverage();
        assertEquals(expected, actual, .1);
    }

    @Test
    public void testAssertNotSame(){
        Student studentA = new Student(101, "Anne");
        Student studentB = new Student(101, "Bob");
        assertNotSame("should no be same Object", studentA, studentB);
    }

    @Test
    public void canGetGradeAverageWithZeroGrades(){
        double gradeAverage = studentX.getGradeAverage();
        assertEquals(0, gradeAverage, 0);
    }

}
