import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("S - Soma");
        System.out.println("M - Subtração");
        System.out.println("D - Divisão");
        System.out.println("T - Tabuada");
        System.out.println("R - Raiz Quadrada");
        System.out.println("B - Bhaskara");
        System.out.println("");
            String value = ler.nextLine();

        switch (value) {
            case "S", "s":
                System.out.println("Primeiro número");
                    int valorSomaUm = ler.nextInt();
                System.out.println("Segundo número");
                    int valorSomarDois = ler.nextInt();

                int somaTotal;
                somaTotal = valorSomaUm + valorSomarDois;

                System.out.println(valorSomaUm + " + " + valorSomarDois + " = " + somaTotal);

                break;



            case "M", "m":
                System.out.println("Primeiro número");
                    int valorSubUm = ler.nextInt();

                    int valorSubDois;
                    do {
                        System.out.println("Segundo número (deve ser igual ou menor que o primeiro):");
                        valorSubDois = ler.nextInt();
                    } while (valorSubDois > valorSubUm);

                int subTotal;
                subTotal = valorSubUm - valorSubDois;

                System.out.println(valorSubUm + " - " + valorSubDois + " = " + subTotal);

                break;



            case "D", "d":
                System.out.println("Primeiro número");
                    int valorDivUm = ler.nextInt();

                    int valorDivDois;
                System.out.println("Segundo número:");
                    valorDivDois = ler.nextInt();

                double divTotal = valorDivUm / valorDivDois;

                System.out.println(valorDivUm + " / " + valorDivDois + " = " + divTotal);

                break;



            case "T", "t":
                System.out.println("Primeiro número");
                    int Tabuada = ler.nextInt();
                System.out.println("até que o número");
                    int numberTabuada = ler.nextInt();

                    
                System.out.println("");

                break;

            case "R", "r":
            System.out.println("6");
                break;

            case "B", "b":
            System.out.println("7");
                break;
        
            default:
                break;
        }
    }
}
