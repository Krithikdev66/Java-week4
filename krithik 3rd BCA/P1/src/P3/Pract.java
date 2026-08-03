package P3;
interface Nsam{
    void cse_dept();
    void com_dept();
}

class student implements Nsam {
    @Override
            public void cse_dept(){
        System.out.println("students from cse dept");
    }
    @Override
    public void com_dept() {
        System.out.println("students from com dept");
    }
}
public class Pract {
    public static void main(String[] args) {
        student s=new student();
        s.com_dept();
        s.cse_dept();
    }
}
