public class Prueba_1 {

    public static void main(String[] args) {
        int n1 = 1, n2 = 2, n3 = 1;

        if (n1 >= n2 && n1 >= n3) {
            // n1 es el mayor
            if (n2 >= n3) {
                // El orden es n1 >= n2 >= n3

            } else {
                // El orden es n1 >= n3 >= n2
            }
        } else if (n2 >= n1 && n2 >= n3) {
            // n2 es el mayor
            if (n1 >= n3) {
                // El orden es n2 >= n1 >= n3
            } else {
                // El orden es n2 >= n3 >= n1
            }
        } else {
            // n3 es el mayor
            if (n1 >= n2) {
                // El orden es n3 >= n1 >= n2
            } else {
                // El orden es n3 >= n2 >= n1
            }
        }

    }
}
