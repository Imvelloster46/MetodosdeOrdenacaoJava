public class OrdenacaoStrings {

    // Método público para iniciar o Mergesort em um array de strings.
    public static void mergesort(String[] vetor) {
        mergesort(vetor, 0, vetor.length - 1);
    }

    // Método privado para implementar o algoritmo mergesort recursivamente
    private static void mergesort(String[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergesort(vetor, inicio, meio);
            mergesort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    // Método para mesclar duas metades de um vetor em um vetor ordenado
    private static void merge(String[] vetor, int inicio, int meio, int fim) {
        // Calcula o tamanho das duas partes a serem mescladas.
        int tamanhoEsquerda = meio - inicio + 1;
        int tamanhoDireita = fim - meio;
    
        // Cria arrays temporários para armazenar as duas partes.
        String[] esquerda = new String[tamanhoEsquerda];
        String[] direita = new String[tamanhoDireita];
    
        // Copia os elementos das partes esquerda e direita para os arrays temporários.
        for (int i = 0; i < tamanhoEsquerda; i++) {
            esquerda[i] = vetor[inicio + i];
        }
    
        for (int j = 0; j < tamanhoDireita; j++) {
            direita[j] = vetor[meio + 1 + j];
        }
    
        // Inicializa índices para percorrer os arrays temporários e o array original.
        int i = 0, j = 0;
        int k = inicio;
    
        // Mescla as partes esquerda e direita de forma ordenada no array original.
        while (i < tamanhoEsquerda && j < tamanhoDireita) {
            if (esquerda[i].compareTo(direita[j]) <= 0) {
                vetor[k] = esquerda[i];
                i++;
            } else {
                vetor[k] = direita[j];
                j++;
            }
            k++;
        }
    
        // Copia quaisquer elementos restantes da parte esquerda, se houver.
        while (i < tamanhoEsquerda) {
            vetor[k] = esquerda[i];
            i++;
            k++;
        }
    
        // Copia quaisquer elementos restantes da parte direita, se houver.
        while (j < tamanhoDireita) {
            vetor[k] = direita[j];
            j++;
            k++;
        }
    }    
    
    // Método público para ordenar um vetor usando o algoritmo quicksort
    public static void quicksort(String[] vetor) {
        quicksort(vetor, 0, vetor.length - 1);
    }

    // Método privado para implementar o algoritmo quicksort recursivamente
    private static void quicksort(String[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(vetor, inicio, fim);
            quicksort(vetor, inicio, indicePivo - 1);
            quicksort(vetor, indicePivo + 1, fim);
        }
    }

    // Função privada para particionar o array e encontrar o índice do pivô.
    private static int particionar(String[] vetor, int inicio, int fim) {
        String pivo = vetor[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (vetor[j].compareTo(pivo) <= 0) {
                i++;
                String temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        String temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;

        return i + 1;
    }

     // Método público para ordenar um vetor usando o algoritmo heapsort
    public static void heapsort(String[] vetor) {
        int n = vetor.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(vetor, n, i); // Converte o array em uma árvore de max-heap.
        }

        for (int i = n - 1; i > 0; i--) {
            String temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;

            heapify(vetor, i, 0); // Reorganiza a árvore de max-heap.
        }
    }

    // Método para transformar um vetor em um heap máximo
    private static void heapify(String[] vetor, int n, int raiz) {
        int maior = raiz;
        int esquerda = 2 * raiz + 1;
        int direita = 2 * raiz + 2;

        if (esquerda < n && vetor[esquerda].compareTo(vetor[maior]) > 0) {
            maior = esquerda;
        }

        if (direita < n && vetor[direita].compareTo(vetor[maior]) > 0) {
            maior = direita;
        }

        if (maior != raiz) {
            String temp = vetor[raiz];
            vetor[raiz] = vetor[maior];
            vetor[maior] = temp;

            heapify(vetor, n, maior);
        }
    }
}
