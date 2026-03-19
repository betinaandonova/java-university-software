public class Discipline {
    private String name;
    private DisciplineType type;
    private int year;

    public Discipline(String name, DisciplineType type, int year) {
        this.name = name;
        this.type = type;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public DisciplineType getType() {
        return type;
    }

    public int getYear() {
        return year;
    }
}
