import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public long getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade){
        if(grade < 0) return;    //return will stop the function if the grade is negative.
        this.grades.add(grade);
    }

        public ArrayList<Integer> getGrades(){
        return this.grades;
        }

        // returns the average of the students grades
        public double getGradeAverage(){
        if(this.grades.size() == 0) return 0;

        double sum = 0;
        for(int grade : this.grades){
            sum += grade;
        }
        return sum/this.grades.size();
        }

        //bonus addGrade and deleteGrade

}
