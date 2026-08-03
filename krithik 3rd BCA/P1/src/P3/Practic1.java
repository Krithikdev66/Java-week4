package P3;
interface camera {
    void click_pic();
}
interface music{
    void click_play();

}
class laptop implements camera,music {
    @Override
    public void click_pic(){
        System.out.println(" from camera interface ");
    }
    @Override
    public void click_play() {
        System.out.println(" from music interface ");
    }
}

public class Practic1 {
    public static void main(String[] args) {
        laptop s=new laptop();
        s.click_pic();
        s.click_play();
    }
}
