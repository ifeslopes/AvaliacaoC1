# EXERCÍCIO AVALIATIVO 1 DA C1
```
Disciplina: LINGUAGEM DE PROGRAMAÇÃO ORIENTADA A OBJETOS 
Professor: Cinthia Cristina Lucio Caliari 
Instituição: Faesa Centro Universitario
```
## Descrição
1) Faça uma classe Produto que contenha:<br>
- Atributos de Instância:<br>
a. Código, nome, quantidade, preço de venda.<br>
- Atributo de Classe:<br>
a. Gerador de código inicializado com 1.<br>
- Métodos<br>
a. Construtor (vai receber o nome, a quantidade e o preço de venda. <br>
Vai inicializar o atributo código com o valor do gerador de código. <br> Ao final, deve
incrementar o gerador de código)<br>
b. gets (exceto gerador de código) sets (exceto para o código e o gerador de
código), toString (exceto para o gerador de código)<br>
<br>

2) Faça um aplicativo que crie um vetor capaz de armazenar 10 produtos (Vetor de
Estoque) e tenha o menu:<br>
1 – Entrada em Estoque<br>
2 – Venda<br>
3 – Sai<br>

## Opções:<br>
### 1 – Entrada em Estoque
• Deve perguntar ao usuário o nome do produto.<br>
• Se ele já existir no vetor de Estoque, deve pedir a quantidade de entrada e somar<br>
este valor à quantidade do objeto para alterar o atributo quantidade <br>(Por exemplo:
caneta – devem entrar 5 canetas, porém já tinham 10 canetas, então deve alterar a
quantidade para 15).<br>
• Se o objeto ainda não existir, deve cadastrar esse produto na primeira posição
vazia do vetor de Estoque.<br>
• Se o vetor estiver cheio, imprima uma mensagem na tela.<br>
## 2 – Venda
• Deve pedir ao usuário o código do produto.<br>
• Se o produto não existir, imprima uma mensagem na tela.<br>
• Se o produto existir, peça ao usuário a quantidade a ser vendida.<br> Se a quantidade
digitada for maior que a quantidade em estoque, imprima uma mensagem na tela.<br>
• Caso contrário, faça a venda, armazenando em uma String o nome do produto, o
valor unitário, a quantidade vendida e o valor total (valor*quantidade).<br> Não esqueça
de diminuir a quantidade em estoque.<br>
• Pergunte ao usuário se ele quer continuar comprando. Repita o processo até
terminar sua compra.<br>
• Ao final, imprima na tela a String com as informações dos produtos vendidos e o
valor total da venda.
