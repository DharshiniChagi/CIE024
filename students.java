public class students{
    String name;
    int sem;
    String program;
    String course;
    int marks;
    students(String name,int sem, String program,String course,int marks){
        this.name=name;
        this.sem=sem;
        this.program=program;
        this.course=course;
        this.marks=marks;
    }
    void display(){
        System.out.println("Name" +name);
        System.out.println("Sem" +sem);
        System.out.println("Program" +program);
        System.out.println("Course" +course);
        System.out.println("Marks" +marks);
    }   
    }
class course extends students{

    course(String name, int sem, String program, String course, int marks) {
        super(name, sem, program, course, marks);
      
    }
    void calculate(){
        if(marks<40){
        System.out.println("Students who scored less than 40:");
        System.out.println("Name" +name);
        System.out.println("Sem" +sem);
        System.out.println("Program" +program);
        System.out.println("Course" +course);
        System.out.println("Marks" +marks);
    }
}
}
class displaydetails{
    public static void main(String[] args){
        students s1=new students("Dharshini",4,"BCA","DevOps",80);
        s1.display();
        students s2=new students("Jessica",4,"BCA","DevOps",30);
        s2.display();
        course c1 = new course("Dharshini",4,"BCA","DevOps",80);
        c1.calculate();
        course c2= new course("Jessica",4,"BCA","DevOps",30);
        c2.calculate();
    }
}
    
