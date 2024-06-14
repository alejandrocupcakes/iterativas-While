import javax.swing.JOptionPane;

public class solicitarGenero {
    public static void main(String[] args) {
        String[] nombres = {"Daniela", "Cristiano", "Jesus", "Heidi", "Leonel", "David", "Angelica"};
        int iterador = 0, hombres=0, mujeres=0, otro=0;
        while (iterador < nombres.length) {
            String genero = JOptionPane.showInputDialog("Ingrese el genero de (m/f): "+nombres[iterador]);
            switch (genero) {
                case "m":
                case "masculino":
                case "M":
                    hombres++;
                    break;
                case "f":
                case "femenino":
                case "F":
                    mujeres++;
                    break;
                default:
                    otro++;
            }
            iterador++;
        }
        System.out.println("Hay "+hombres+" hombres, "+mujeres+" mujeres y "+otro+" otro/no especificado");
    }
}