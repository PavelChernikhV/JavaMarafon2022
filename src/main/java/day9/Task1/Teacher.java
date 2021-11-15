package day9.Task1;

public class Teacher extends Human {
    String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Это учитель с именем "+name);
    }
    public void lessons (String n){
        subjectName = subjectName+n;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                getName()+" "+ subjectName + '\'' +
                '}';
    }
}