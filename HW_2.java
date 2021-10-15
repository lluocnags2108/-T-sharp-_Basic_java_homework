public class HW_2 {
    public static void main(String[] args) {
        String a = "This is a book";
        String[] b = a.split(" ");
        for (int i = 0; i < b.length; i++) {
            String c = b[i];
            if (c.length() > 1) {
                String s1 = c.substring(0, 1).toUpperCase();
                c = s1 + c.substring(1);
            }
            b[i] = c;
        }
        a = String.join(" ", b);
        System.out.println(a);
    }
}
