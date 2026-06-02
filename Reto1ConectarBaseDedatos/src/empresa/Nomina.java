package empresa;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Nomina {

    // ?? Porcentajes de deducción ??????????????????????????????????????????????
    private static final double IRPF = 0.15; // 15% IRPF
    private static final double SEGURIDAD_SOCIAL = 0.064; // 6.4% Seguridad Social
    private static final double DESEMPLEO = 0.016; // 1.6% Desempleo

    private Empleado empleado;
    private double salarioBase;
    private double irpf;
    private double seguridadSocial;
    private double desempleo;
    private double totalDeducciones;
    private double salarioNeto;

    // ?? Constructor ???????????????????????????????????????????????????????????
    public Nomina(Empleado empleado) {
        this.empleado = empleado;
        this.salarioBase = empleado.getSalarioBase();
        calcular();
    }

    // ?? Cálculo ???????????????????????????????????????????????????????????????
    private void calcular() {
        irpf = salarioBase * IRPF;
        seguridadSocial = salarioBase * SEGURIDAD_SOCIAL;
        desempleo = salarioBase * DESEMPLEO;
        totalDeducciones = irpf + seguridadSocial + desempleo;
        salarioNeto = salarioBase - totalDeducciones;
    }

    // ?? Mostrar nómina ????????????????????????????????????????????????????????
    public void mostrar() {
        System.out.println("------------------------------------------");
        System.out.println("-           NÓMINA MENSUAL             -");
        System.out.println("------------------------------------------");
        System.out.printf("- Empleado : %-26s?%n", empleado.getNombre());
        System.out.printf("- Puesto   : %-26s?%n", empleado.getPuesto());
        System.out.println("------------------------------------------");
        System.out.printf("- Salario bruto    : %,10.2f €      ?%n", salarioBase);
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("- DEDUCCIONES                          -");
        System.out.printf("- IRPF (15%%)       : %,10.2f €      ?%n", irpf);
        System.out.printf("- Seg. Social(6.4%%): %,10.2f €      ?%n", seguridadSocial);
        System.out.printf("- Desempleo (1.6%%): %,10.2f €       ?%n", desempleo);
        System.out.printf("- Total deducciones: %,10.2f €      ?%n", totalDeducciones);
        System.out.println("------------------------------------------");
        System.out.printf("- SALARIO NETO     : %,10.2f €      ?%n", salarioNeto);
        System.out.println("------------------------------------------");
    }
    
}//end class