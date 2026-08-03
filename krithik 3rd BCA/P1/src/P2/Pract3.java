package P2;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

class employee{
    String name="krithik";
    int id=36;
    private int salary;

    public void setData(int sal) {
        salary=sal;
    }
    public int getData() {
        return salary;
    }
}
public class Pract3{
    public static void main(String[] args) {
        employee e=new employee();
        System.out.println(e.id);
        System.out.println(e.name);
        //System.out.println(e.double);
        e.setData(60000);
        System.out.println(e.getData());
    }
}

