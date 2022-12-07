/**
 * Task_02 (Строки)
 */
public class Task_02 {
    public static void main(String[] args) {
        String[] name = { "M", "A", "X", "I", "M"};
        String sk = "MAX IM.";
        System.out.println(sk.toLowerCase());   // max im.
        System.out.println(String.join("", name));  // MAXIM
        System.out.println(String.join("", "M", "A", "X", "I", "M"));   // MAXIM
        System.out.println(String.join(",", "M", "A", "X", "I", "M"));  // M,A,X,I,M
    }
}
