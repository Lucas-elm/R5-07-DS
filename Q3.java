public class Q3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez fournir un entier N en paramètre.");
            return;
        }
        int n = Integer.parseInt(args[0]);
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
