package P3;
class Nitte{
    void details(){
        System.out.println("from nitte");
    }
}
class nsam extends Nitte{
    void nsam_details() {
        System.out.println("degree clg");
    }}
class nmamit extends Nitte{
        void nmamit_details() {
            System.out.println("eng clg");
        } }
class jks extends Nitte{
            void jks_details(){
                System.out.println("mba clg");
            }}
public class prgm4 {
    public static void main(String[] args) {
        nsam N =new nsam();
        jks j=new jks();
        nmamit n=new nmamit();
        j.details()                                                                                             ;
        j.jks_details();
        n.details();
        n.nmamit_details();
        N.details();
        N.nsam_details();
    }
}
