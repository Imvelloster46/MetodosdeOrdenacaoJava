import java.io.IOException; 

public class Desafio {
 
    public static void main(String[] args) {
        try {
            // Carrega um array de strings a partir do arquivo "dicionario_misturado.txt"
            String[] listaDePalavras = ProcessaArquivo.leitor("dicionario_misturado.txt");

            long inicio = System.currentTimeMillis(); // Marca o tempo de início da execução.

            //Mergesort
            OrdenacaoStrings.mergesort(listaDePalavras); // Chama o método de ordenação Mergesort para ordenar a lista de palavras.
            long fim = System.currentTimeMillis();// Marca o tempo de término da execução.
            System.out.println("Mergesort executou em " + (fim - inicio) + "ms nos dados misturados"); // Imprime o tempo decorrido para a execução do Mergesort nos dados misturados.

            listaDePalavras = ProcessaArquivo.leitor("dicionario.txt"); // Carrega novamente o array de palavras, desta vez do arquivo "dicionario.txt".
            inicio = System.currentTimeMillis(); // Marca o tempo de início da execução.
            OrdenacaoStrings.mergesort(listaDePalavras); // Chama o método de ordenação Mergesort para ordenar a lista de palavras.
            fim = System.currentTimeMillis(); // Marca o tempo de término da execução.

            System.out.println("Mergesort executou em " + (fim - inicio) + "ms nos dados já ordenados"); // Imprime o tempo decorrido para a execução do Mergesort nos dados já ordenados.
            
            // Quicksort
            listaDePalavras = ProcessaArquivo.leitor("dicionario_misturado.txt"); // Carrega novamente o array de palavras, desta vez do arquivo "dicionario.txt".
            inicio = System.currentTimeMillis(); // Marca o tempo de início da execução.
            OrdenacaoStrings.quicksort(listaDePalavras); // Chama o método de ordenação quicksort para ordenar a lista de palavras.
            fim = System.currentTimeMillis();  // Marca o tempo de término da execução.
            System.out.println("Quicksort executou em " + (fim - inicio) + "ms nos dados misturados");

            listaDePalavras = ProcessaArquivo.leitor("dicionario.txt"); // Carrega novamente o array de palavras, desta vez do arquivo "dicionario.txt".
            inicio = System.currentTimeMillis(); // Marca o tempo de início da execução.
            OrdenacaoStrings.quicksort(listaDePalavras); // Chama o método de ordenação quicksort para ordenar a lista de palavras.
            fim = System.currentTimeMillis(); // Marca o tempo de término da execução.
            System.out.println("Quicksort executou em " + (fim - inicio) + "ms nos dados já ordenados");

            //Heapsort
            listaDePalavras = ProcessaArquivo.leitor("dicionario_misturado.txt"); // Carrega novamente o array de palavras, desta vez do arquivo "dicionario.txt".
            inicio = System.currentTimeMillis(); // Marca o tempo de início da execução.
            OrdenacaoStrings.heapsort(listaDePalavras); // Chama o método de ordenação Heap para ordenar a lista de palavras.
            fim = System.currentTimeMillis(); // Marca o tempo de término da execução.
            System.out.println("Heapsort executou em " + (fim - inicio) + "ms nos dados misturados");

            listaDePalavras = ProcessaArquivo.leitor("dicionario.txt"); // Carrega novamente o array de palavras, desta vez do arquivo "dicionario.txt".
            inicio = System.currentTimeMillis(); // Marca o tempo de início da execução.
            OrdenacaoStrings.heapsort(listaDePalavras); // Chama o método de ordenação Heap para ordenar a lista de palavras.
            fim = System.currentTimeMillis(); // Marca o tempo de término da execução.
            System.out.println("Heapsort executou em " + (fim - inicio) + "ms nos dados já ordenados");

        } catch (IOException ex) {
            // Se ocorrer uma exceção de E/S (IOException), este bloco será executado.

            // Imprime informações de erro, como a pilha de chamadas da exceção.
            ex.printStackTrace();
        }
    }
}
