 public static void main(String[] args) {
        int sumas = 0, contador = 1;
        while (contador <= 20) {
            if (contador % 2 != 0) {
                sumas += contador;
            }
            contador++;
        }
        System.out.println("La suma de los números impares es: "+sumas);
    }
