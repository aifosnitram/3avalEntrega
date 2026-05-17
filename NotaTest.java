import java.util.Scanner;

public class NotaTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            //definicion de variables
            double notaFinal;
            double notaEntrega;
            double notaTest;
            double notaRecuperacion;

            System.out.print("Ingrese la nota del test: ");
            notaTest = scanner.nextDouble();
            System.out.print("Ingrese la nota de la entrega: ");
            notaEntrega = scanner.nextDouble();
            if (notaTest >= 5 && notaEntrega >= 5) {
                notaFinal = (notaTest * 0.4 + notaEntrega * 0.6) / 2;
            } else {
                System.out.print("Ingrese la nota de la recuperación: ");
                notaRecuperacion = scanner.nextDouble();
                notaFinal = notaRecuperacion;
            }
            System.out.println("Nota Final: " + notaFinal);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
