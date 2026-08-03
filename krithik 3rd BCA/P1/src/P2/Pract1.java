package P2;

public class Pract1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Java");
        System.out.println(s);
        StringBuffer s1 = new StringBuffer("Python");
        System.out.println(s1);
        s1.append("language");
        System.out.println(s1);
        s1.insert(1, "abd");
        System.out.println(s1);
        s1.replace(0, 5, "C");
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        s1.delete(2, 5);
        System.out.println(s1);

        String s2 = "Java";
        String s3 = new String("Python");
        String str1 = "NSAM";
        String str2 = "NSAM";
        System.out.println(str1 == str2);
        String str3 = new String("NSAM");
        String str4 = new String("NSAM");
        System.out.println(str3 == str4);

        String s5 = "krish Kumar Suthar";
        System.out.println(s5.charAt(8));
        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());
        System.out.println(s5.indexOf("K"));
        System.out.println(s5.lastIndexOf("K"));
        System.out.println(s5.substring(1, 5));
        System.out.println(s5.length());
        String x = "NSAM";
        String y = "JAVA";
        //System.out.println(x.equals(y));
        System.out.println(x.equalsIgnoreCase(y));
        String p = "RajaRamMohanRoy";
        for (char ch : p.toCharArray()) {
            System.out.println(ch);
        }
        for (int i = 0; i < p.length(); i++) {
            System.out.println(p.charAt(i));
        }
    }
}
