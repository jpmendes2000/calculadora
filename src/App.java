import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner ler = new Scanner(System.in))
        
        {
            System.out.println("S - Soma");
            System.out.println("M - Subtração");
            System.out.println("D - Divisão");
            System.out.println("T - Tabuada");
            System.out.println("R - Raiz Quadrada");
            System.out.println("B - Bhaskara");
            System.out.println("");
                String value = ler.nextLine();

            switch (value) {
                case "S", "s", "soma", "somar", "SOMAR", "SOMA":
                    System.out.println("Primeiro número");
                        int valorSomaUm = ler.nextInt();
                    System.out.println("Segundo número");
                        int valorSomarDois = ler.nextInt();

                    int somaTotal;
                    somaTotal = valorSomaUm + valorSomarDois;

                    System.out.println(valorSomaUm + " + " + valorSomarDois + " = " + somaTotal);

                    break;



                case "M", "m", "subtracao", "subtrair", "SUBTRACAO", "SUBTRAIR":
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



                case "D", "d", "dividir", "divisao", "DIVIDIR", "DIVISAO":
                    System.out.println("Primeiro número");
                        int valorDivUm = ler.nextInt();

                        int valorDivDois;
                    System.out.println("Segundo número:");
                        valorDivDois = ler.nextInt();

                    double divTotal = valorDivUm / valorDivDois;

                    System.out.println(valorDivUm + " / " + valorDivDois + " = " + divTotal);

                    break;



                case "T", "t", "tabuada", "TABUADA":
                    System.out.println("Primeiro número");
                        int Tabuada = ler.nextInt();
                    System.out.println("até o número");
                        int numberTabuada = ler.nextInt();
                    
                        int multiplicador = 0;
                    while(multiplicador <= numberTabuada) {
                        int resultado = Tabuada * multiplicador;
                        System.out.println(Tabuada + " x " + multiplicador + " = " + resultado);
                        multiplicador++;
                        }
                    System.out.println("");

                    break;

                case "R", "r", "raiz", "raiz quadrada", "RAIZ", "RAIZ QUADRADA":
                    System.out.println("Escreva o índice da Raiz");
                        int indiceRaiz = ler.nextInt();
                    System.out.println("Escreva o radicando da Raiz");
                        int radicandoRaiz = ler.nextInt();

                        int potencia = 0;
                    while (potencia <= indiceRaiz) {
                        int resultPotencia = indiceRaiz * potencia;
                        potencia++;
                    }

                    
                    break;

                case "bascara", "BASCARA" :
                System.out.println("ESCREVE DIREITO SEU PORRA!!!");
                    break;

                case "B", "b", "bhaskara", "BHASKARA":
                System.out.println("7");
                    break;

                default:
                    break;
            }
        }
    }
}
