package P2;

import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        String s1 = "Java";
        String sr[] = s1.split("a");
        System.out.println(Arrays.toString(sr));
        String s2 = "Java@gmail.com";
        String a[] = s2.split("@");
        System.out.println(Arrays.toString(a));
        String s3 = "Java@gmail.com";
        System.out.println(s3.replace("gmail.com", "nitte.edu.in"));
        String s4 = "Java Python C++ Java";
        System.out.println(s4.replaceFirst("gmail.com", "nitte.edu.in"));
        String s5 = "Java";
        System.out.println(s5.replaceAll("J", "j"));

        String s6 = "123-456-789";
        System.out.println(s6.replace("-", ""));

        String s7 = "<p>Hello</p><p>World</p>";
        System.out.println(s7.replace("<p>", "").replace("</p>", ""));

        String p = "Java";
        int q = 10;
        System.out.println(p + q);
        String d[] = {"Java", "Python", "C++"};
        System.out.println(String.join("-", d));
        String p1 = "Java";
        System.out.println(p1.matches("^[A-Z].*"));
        String p2 = "krish@06";
        System.out.println(p2.matches(".*[^A-Z,a-z,0-9].*"));
        String p3 = "Java#246";
        System.out.println(p3.replaceAll("[^A-Z,a-z,0-9]", " "));
        String p4 = "Java123";
        System.out.println(p4.replaceAll("\\d", " "));
        String name = "Aston Robert Dmello";
        int p5 = name.indexOf(" ");
        int p6 = name.lastIndexOf(" ");
        System.out.println(name.substring(p5, p6));

        String n = "Java@gmail.com";
        System.out.println(n.substring(n.indexOf("@")));
        String p7 = "15451351";
        System.out.println(p7.matches("^[0-9].*"));
        String p8 = "Java&246";
        System.out.println(p8.replaceAll("\\d", " "));
        String pass = "java123@!*1";
        if (pass.length() > 10 && pass.matches(".*[^A-Z,a-z,0-9].*") && pass.matches(".*[A-Z,a-z,0-9].*")) {
            System.out.println("strong password");
        } else {
            System.out.println("weak password");
        }
        String email = "java@+gmail.com";
        //System.out.println(Arrays.toString(email.split("@")));
        if (Arrays.toString(email.split("@")).length() < 2) {
            //if (Arrays.toString(email.split(".")).length() < 2) {
                System.out.println("valid email");
            } else {
                System.out.println("Invalid email");
            }
        }
    }




class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Move left pointer forward if character is not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right pointer backward if character is not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters ignoring case
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
