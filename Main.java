import enumeration.OperationEnum;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            var scanner = new Scanner(System.in);
            var opcao = 1;

            while(opcao != 5){

                System.out.println("Escolha uma opção pelo número");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("5 - Sair");
                opcao = scanner.nextInt();

                if(opcao < 1 || opcao > 5){
                    System.out.println("Digite um valor valido");
                    continue;
                }

                if(opcao == 5){
                    System.out.println("Encerrando programa!");
                    break;
                }

                var opcaoSelecionada = OperationEnum.values()[opcao -1];

                System.out.println("Informe o primeiro valor ");
                var valor1 = scanner.nextInt();
                System.out.println("Informe o segundo valor: ");
                var valor2 = scanner.nextInt();

                var resultado = opcaoSelecionada.getCalculate().apply(valor1 , valor2);
                System.out.printf("%s %s %s = %s \n\n",valor1, opcaoSelecionada.getSimbolo(), valor2, resultado);

            }
    }
}