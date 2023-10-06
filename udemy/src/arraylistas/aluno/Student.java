package arraylistas.aluno;

public class Student {
    private String name;
    private double totalGrade;
    private String email;

    
    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Student(String name, double totalGrade) {
        this.name = name;
        this.totalGrade = totalGrade;
    }
    
    public String getName() {
        return name;
    }
    
    public double getTotalGrade() {
        return totalGrade;
    }
    
    public String getEmail() {
        return email;
    }
    
}
