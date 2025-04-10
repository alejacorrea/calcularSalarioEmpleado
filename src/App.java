import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado, documentoEmpleado, diaDescanso = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double deduccionPension = 0;
        double deduccionSalud = 0;
        double horasTrabajadas = 0;
        double valorHora = 0;
        double bonificacionEmpleado = 0;
        double valorSalarioMinimo = 1423500;
        double auxilioTransporte = 200000;
        double cantidadHorasExtras = 0;
        double valorHoraExtra = 0;
        double totalValorHorasExtras = 0;

        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese el documento del empleado: ");
        documentoEmpleado = sc.nextLine();
        System.out.println("Ingrese el dia de descanso: (Lunes-Viernes)");
        diaDescanso = sc.nextLine();
        System.out.println("Ingrese el valor de la hora: ");
        valorHora = sc.nextDouble();
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        horasTrabajadas = sc.nextDouble();

        salarioBruto = horasTrabajadas * valorHora;
        if (salarioBruto <= valorSalarioMinimo * 2) {
            auxilioTransporte = 200000;
            bonificacionEmpleado = salarioBruto * 0.1;
        } else {
            auxilioTransporte = 0;
            bonificacionEmpleado = 0;
        }

        deduccionPension = salarioBruto * 0.04;
        deduccionSalud = salarioBruto * 0.04;

        if (horasTrabajadas > 96) {
            cantidadHorasExtras = horasTrabajadas - 96;
            valorHoraExtra = valorHora * 1.25;
            totalValorHorasExtras = cantidadHorasExtras * valorHoraExtra;
        }

        if (horasTrabajadas < 24) {
            System.out.println("Aun no le puedo pagar, trabaje más");
        } else {
            salarioNeto = salarioBruto - deduccionPension - deduccionSalud + auxilioTransporte + bonificacionEmpleado
                    + totalValorHorasExtras;
            System.out.println("El salario neto del empleado es: " + salarioNeto);
        }

        System.out.println("El nombre del empleado es:" + nombreEmpleado);
        System.out.println("El documento del empleado es: " + documentoEmpleado);
        System.out.println("El dia de descanso será: " + diaDescanso);
        System.out.println("El salario bruto es de: " + salarioBruto);
        System.out.println("El valor de la hora trabajada es de: " + valorHora);
        System.out.println("La cantidad de horas trabajadas es de: " + horasTrabajadas);
        System.out.println("El valor del salario neto es: " + salarioNeto);
        System.out.println("La bonificacion del empleado es de: " + bonificacionEmpleado);
        System.out.println("El auxilio de transporte es de: " + auxilioTransporte);
        System.out.println("Las deducciones de pension es de: " + deduccionPension);
        System.out.println("Las deducciones de pension es de: " + deduccionSalud);
        System.out.println("La cantidad de horas extras son: " + cantidadHorasExtras);
        System.out.println("El total de las horas extras trabajadas son: " + totalValorHorasExtras);
    }

}
