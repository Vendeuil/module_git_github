public class TableMultiplication {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                k = i * j;
                System.out.printf("%d fois %d donne %d\n", i, j, k);
            }
        }
    }
}
