import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {


        Estoque entradaEmEstoque = new Estoque();
        Scanner entrada1 = new Scanner(System.in);
        int opecao ;
        do {
            System.out.println("1 – Entrada em Estoque\n" +
                    "2 – Venda\n" +
                    "3 – Sai");
            opecao =entrada1.nextInt();
            if (opecao==1){

            entradaEmEstoque.EntradaDeEstoque();
            }if (opecao==2){

            entradaEmEstoque.vendaDeIntens();
            entradaEmEstoque.mostraTotalCompra();
            }

        } while (opecao !=3);



    }
}
