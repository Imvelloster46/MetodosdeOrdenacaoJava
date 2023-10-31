

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProcessaArquivo {

    // Método para ler um arquivo e retornar seu conteúdo como um array de strings.
    public static String[] leitor(String path) throws IOException {
        ArrayList<String> linhas = new ArrayList<String>();  // Cria uma lista para armazenar as linhas do arquivo.
        BufferedReader buffRead = new BufferedReader(new FileReader(path));  // Abre o arquivo para leitura.
        String linha = "";
        while (true) {
            if (linha != null) {
                linhas.add(linha);  // Adiciona a linha à lista.
            } else
                break;
            linha = buffRead.readLine();  // Lê a próxima linha do arquivo.
        }
        buffRead.close();  // Fecha o arquivo após a leitura.

        String[] palavras = new String[linhas.size()];  // Cria um array de strings com base nas linhas lidas.
        int i = 0;
        for (String s : linhas) {
            palavras[i] = s;  // Copia as linhas da lista para o array.
            i++;
        }
        return palavras;  // Retorna o array de strings com o conteúdo do arquivo.
    }

    // Método para escrever um array de strings em um arquivo.
    public static void escritor(String path, String[] lista) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));  // Abre o arquivo para escrita.
        for (String linha : lista) {
            buffWrite.append(linha + "\n");  // Escreve cada string seguida de uma quebra de linha no arquivo.
        }
        buffWrite.close();  // Fecha o arquivo após a escrita.
    }
}