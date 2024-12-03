import java.util.*;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'m');
        System.out.println(sb);

        sb.insert(2,'m');
        System.out.println(sb);

        sb.delete(2,3);          //starting index is included while last one is excluded
        System.out.println(sb);

        // StringBuilder is not Thread-Safe   | Faster
        // StringBuffer is Thread_safe        | Slower

    }
}
