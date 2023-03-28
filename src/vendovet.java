///* package diagnostico;
//
//public class VetVendedor {
//    private Vendedor[] vetor;
//    private int nElem;
//
//    public VetVendedor (int tamanho){
//        this.vetor = new Vendedor[tamanho];
//        this.nElem = 0;
//    }
//
//    public int getnElem() {
//        return nElem;
//    }
//    /*
//     * getVendedor que recebe uma posi��o e retorna o vendedor
//     * desta posi��o ou null se a posi��o for inv�lida.
//     */
//    public Vendedor getVendedor (int pos){
//        if (pos>=0 && pos<this.nElem){
//            return this.vetor[pos];
//        }
//        return null;
//    }
//
//    /*
//     *  pesquisa que recebe o nome do vendedor e retorna a posi��o
//     *  do vendedor que tem este nome ou -1, se n�o encontrar.
//     */
//    public int pesquisa (String nome){
//        for (int i=0; i<this.nElem; i++){
//            if (nome.equalsIgnoreCase(this.vetor[i].getNome())){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    /*
//     * insere que recebe um Vendedor e insere na primeira posi��o
//     * vazia do vetor. Se o vetor estiver cheio retorna -1, se o
//     * vendedor j� foi cadastrado retorna -2 e, se a opera��o foi bem
//     * sucedida, retorna 0.
//     */
//
//    public int insere (Vendedor novo){
//        if (this.nElem==this.vetor.length){
//            return -1;
//        }else if (pesquisa(novo.getNome())>=0){
//            return -2;
//        }else{
//            this.vetor[this.nElem] = novo;
//            this.nElem++;
//            return 0;
//        }
//    }
//    /*
//     * remove que recebe o nome de um Vendedor e remove-o do
//     * vetor. Se o vendedor não existir, retorna false. Se a
//     * operação for bem sucedida retorna true.
//     */
//    public boolean remove (String nome) {
//        int pos = pesquisa(nome);
//        if (pos == -1) {
//            return false;
//        } else {
//            this.vetor[pos] = this.vetor[this.nElem-1];
//            this.vetor[this.nElem-1] = null;
//            this.nElem--;
//            return true;
//        }
//    }
//
//
//    /*
//     * totalVendas que recebe uma determinada categoria, soma
//     * e retorna o total das vendas de todos os vendedores desta
//     * categoria.
//     */
//    public double totalVendas (char categoria){
//        double total =0;
//        for (int i=0; i<this.nElem; i++){
//            if (categoria == this.vetor[i].getCategoria()){
//                total += this.vetor[i].getTotalVendas();
//            }
//        }
//        return total;
//    }
//    /*
//     * quantVendedor que recebe uma determinada categoria e
//     * retorna a quantidade de Vendedores desta categoria.
//     */
//
//    public int quantVendedor (char categoria) {
//        int quant=0;
//        for (int i=0; i<this.nElem; i++) {
//            if (categoria == this.vetor[i].getCategoria()) {
//                quant++;
//            }
//        }
//        return quant;
//    }
//
//    /*
//     * MediaVendas que recebe uma determinada categoria,
//     * calcula e retorna a média das vendas desta categoria (total
//     * das vendas/quantidade de vendedores) .
//     */
//    public double MediaVendas (char categoria) {
//        return totalVendas(categoria)/quantVendedor(categoria);
//    }
//}
//*/