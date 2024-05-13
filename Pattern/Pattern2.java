package Pattern;

public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int x = i + 65;
            for (int j = 65; j <= x; j++) {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
