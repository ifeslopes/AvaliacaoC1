import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {


        EntradaEmEstoque entradaEmEstoque = new EntradaEmEstoque();
        Scanner entrada = new Scanner(System.in);
        int opecao ;
        do {
            System.out.println("1 – Entrada em Estoque\n" +
                    "2 – Venda\n" +
                    "3 – Sai");
            opecao =entrada.nextInt();
            if (opecao==1){

            entradaEmEstoque.EntradaDeEstoque();
            }if (opecao==2){

            entradaEmEstoque.vendaDeIntens();
            }

        } while (opecao !=3);


    }
}
