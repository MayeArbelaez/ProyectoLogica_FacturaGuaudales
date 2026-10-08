package FacturaGuaduales;

import java.util.Scanner;

public class FacturaGuaduales {
    public static void main(String[] args) {

        double[] consumos = new double[6];

        registrarConsumo(consumos);
        consultarFactura(consumos);


    }

    public static void mostrarMenu() {


    }
//Funsión para registrar consumo//

    public static void registrarConsumo(double[] consumos) {

        int apto = 1;
        Scanner sc = new Scanner(System.in);


        while (apto <= 6) {
            System.out.println("Ingrese el número de apartamento");
            int numeroapto = sc.nextInt();

            if (numeroapto > 0 && numeroapto <= 6) {
                System.out.println("Apartamento: " + numeroapto);
                System.out.println("Ingrese el consumo de ese apartamento en m3");
                double consumo = sc.nextDouble();

                if (consumo <= 0) {
                    System.out.println("Ingrese un consumo valido");
                } else {
                    consumos[numeroapto-1]=consumo;
                    apto++;
                }


            }else {
                System.out.println("Ingrese un número de apto valido");

            }
        }
    }
//Consultar factura//

    public static void consultarFactura(double[] consumos) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CONSULTAR FACTURA\n"+
                "Para consultar la factura Ingrese el número de apartamento");
        int numeroapto = sc.nextInt();

        while (numeroapto <1 || numeroapto >6 ) {
            System.out.println("Ingrese un número de apartamento valido");
            numeroapto = sc.nextInt();
        }

        if (consumos[numeroapto-1]<=0){
            System.out.println("El apartamento " + numeroapto + " no tiene consumo registrado");

        }else {
            imprimirFactura(numeroapto, consumos);
        }

        }



    }



public static void imprimirFactura (int apartamento, double[] consumos){


    double tarifaAplicada;
    double precioConsumo;
    double cargoFijo = 12000;
    double recargo;
    double totalPagar;
    int numeroapto;

    System.out.println("----FACTURA---");


}





