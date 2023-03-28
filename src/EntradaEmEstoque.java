import java.util.Scanner;

public class EntradaEmEstoque {

    private Produto[] produtoVet = new Produto[10];
    private int numeroProduto =0;
    private static String produtoVendidos="";
    private static double valorTotal;
    private  static Scanner entrada =new Scanner(System.in);


    public int pesquisaNome(String nome){

        for (int i = 0; i<this.numeroProduto; i++){
            if (nome.equalsIgnoreCase(this.produtoVet[i].getNome())){
                return i;
            }
        }
        return -1;
    }



    public int insereProduto(String novo){

        if ( pesquisaNome(novo)>=0){
            return -1;
        }else if ( this.numeroProduto ==(this.produtoVet.length)){
            return -2;
        }else{

            return 0;
        }
    }

    public void EntradaDeEstoque(){
        mostraEstoque();

        int opecao=0;

        System.out.println("Entre com mome do protudo");
        String nomeProtudo = entrada.next();

        if (numeroProduto !=0){
            opecao = insereProduto(nomeProtudo);
        }


        if(opecao==-1){
            atualizaQuatidadeProduto(nomeProtudo);
        }
        if(opecao==-2){
            System.out.println("Vetor esta cheio");
        }
        if(opecao== 0){

            cadastraNovoProduto();

        }
    }



    private void cadastraNovoProduto() {
        System.out.println("Cadastra Do Novo Produto");
        System.out.println("Entre com nome:");
        String nome = entrada.next();
        System.out.println("Entre com quantidade:");
        int quantidade = entrada.nextInt();
        System.out.println("Entre com valor:");
        double valo = entrada.nextDouble();

        Produto produto =new Produto(nome,quantidade,valo);
        produtoVet[numeroProduto]=produto;
        this.numeroProduto++;

    }

    private void atualizaQuatidadeProduto(String nomeProtudo) {
        int possicaoVetor = pesquisaNome(nomeProtudo);
        int quantidade = produtoVet[possicaoVetor].getQuantidade();

        System.out.println("Produto em estoque Entre com quantidade do produto: ");
        produtoVet[possicaoVetor].setQuantidade(quantidade +entrada.nextInt());
        System.out.println("Operação realizada com sucesso!");
    }




    //Venda de produtos

    public void vendaDeIntens(){
        mostraEstoque();

        int opecao=0;

        System.out.println("Entre com Id do protudo");
        int idProtudo = entrada.nextInt();

        if (numeroProduto !=0){
            opecao = pesquisaID(idProtudo);
        }

        if(opecao==-1){
            System.out.println("Produdo não encontrado!");
        }
        if(opecao >= 0){
            int continarComprando=0;


                int quantidade = quantidadeEmEstoque(opecao);
                System.out.println(" produto atulaizado! ");
                produtoVendidos += vendendoProduto(opecao, quantidade);

                System.out.println("deseja continunar comprando? entre com id do produto ou  -1 sair");
                if(continarComprando == -1){
                    vendaDeIntens();
                }




        }

    }

    private int quantidadeEmEstoque(int opecao) {
        int quantidade=0;

        do {

        System.out.println("Entre com quantidade a ser vendida");
         quantidade = entrada.nextInt();

         if(produtoVet[opecao].getQuantidade()< quantidade){
            System.out.println("Quantidade em estoque  inferior  quantidade a ser vendida!");
            System.out.println("Quantidade em estoque:"+produtoVet[opecao].getQuantidade());

         }
        }while (produtoVet[opecao].getQuantidade()< quantidade);
        return quantidade;
    }

    public int pesquisaID(int id){

        for (int i = 0; i<this.numeroProduto; i++){
            if (id ==this.produtoVet[i].getCodigo()){
                return i;
            }
        }
        return -1;
    }

    public String vendendoProduto(int indece, int quantidade){
        Produto produto = produtoVet[indece];
        int quantidaProduto = produtoVet[indece].getQuantidade();

        produtoVet[indece].setQuantidade(quantidaProduto - quantidade);
        valorTotal +=quantidade * produto.getPrecoDeVenda();

        return " Nome do produto: "+produto.getNome()+" Valor do produto R$:"+produto.getPrecoDeVenda()+
                " Quantidade Vendida " +quantidade+" Valor total R$: "+ quantidade * produto.getPrecoDeVenda()+"\n";
    }
    public void mostraEstoque(){
        System.out.println("\n Produtos em estoque:");
        if(produtoVet[0]!=null) {
            for (int i=0;i< numeroProduto; i++) {
                System.out.println("Id "+produtoVet[i].getCodigo()+", Nome " + produtoVet[i].getNome() + ", Quantidade: " +
                        produtoVet[i].getQuantidade() + ", Valor R$: " + produtoVet[i].getPrecoDeVenda());

            }

        }
    }

    public void mostraTotalCompra()



}
