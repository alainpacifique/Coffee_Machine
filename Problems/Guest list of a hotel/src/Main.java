        import java.util.Scanner;
        class Main {
            public static void main(String[] args) {
                Scanner Scanner = new Scanner(System.in);
                String[] s = new String[8];
                for (int i=0; i < 8; i++){
                    s[i] = Scanner.next();
                }
                for (int i = 7; i >= 0; i--) {
                    System.out.println(s[i]);
                }
                }
        }
