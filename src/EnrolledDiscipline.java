public class EnrolledDiscipline {
    private Discipline discipline;
    private Double grade; // null ако няма оценка

    public EnrolledDiscipline(Discipline discipline) {
        this.discipline = discipline;
        this.grade = null;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public boolean hasGrade() {
        return grade != null;
    }
}