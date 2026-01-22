public class Student {
    private int id;
    private String name;
    private int age;
    private int year;
    private int sem;
    private String Dept;


    public Student(int id, String name, int age, int year, int sem, String Dept) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.year = year;
        this.sem = sem;
        this.Dept = Dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getYear() {
        return year;
    }

    public int getSem() {
        return sem;
    }

    public String getDept() {
        return Dept;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public void setDept(String Dept) {
        this.Dept = Dept;
    }

    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Sem: " + sem);
        System.out.println("Department: " + Dept);
    }
}