public class HoraDaPratica {
        public static void main(String[] args) {


            // Atividade 1: Média de duas notas decimais
            double nota1 = 8.5;
            double nota2 = 7.3;
            double media = (nota1 + nota2) / 2;
            System.out.println("A média das notas é: " + media);

            // Atividade 2: Casting de double para int
            double numeroDouble = 9.99;
            int numeroInt = (int) numeroDouble; // Casting
            System.out.println("O número double convertido para int é: " + numeroInt);

            // Atividade 3: Variável char e String
            char letra = 'N';
            String palavra = "ILSON";
            String mensagem = letra + palavra; // Concatenação
            System.out.println("A mensagem concatenada é: " + mensagem);

            // Atividade 4: Cálculo do valor total
            double precoProduto = 5.50;
            int quantidade = 3;
            double valorTotal = precoProduto * quantidade;
            System.out.println("O valor total é: " + valorTotal);

            // Atividade 5: Conversão de dólares para reais
            double valorEmDolares = 10.0;
            double taxaDeCambio = 4.94;
            double valorEmReais = valorEmDolares * taxaDeCambio;
            System.out.printf("O valor em reais é: R$ %.2f%n", valorEmReais); // Formatação

            // Atividade 6: Cálculo de desconto
            double precoOriginal = 100.0;
            double percentualDesconto = 10.0; // 10%
            double valorDesconto = (percentualDesconto / 100) * precoOriginal;
            double precoComDesconto = precoOriginal - valorDesconto;
            System.out.printf("O preço com desconto é: R$ %.2f%n", precoComDesconto);
        }


}
