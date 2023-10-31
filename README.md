# Metodos de Ordenacao Java
Desafio de Ordenação de Palavras.

O programa é composto por vários componentes principais:

ProcessaArquivo: Uma classe responsável por ler um arquivo de texto e carregar seu conteúdo em um array de strings. Neste projeto, o programa lê dois arquivos diferentes: "dicionario_misturado.txt" e "dicionario.txt."

OrdenacaoStrings: Uma classe que contém implementações dos algoritmos de ordenação mencionados (Mergesort, Quicksort e Heapsort).

main(): O método principal da classe "Desafio." Ele orquestra a execução do programa. Primeiro, carrega a lista de palavras do arquivo "dicionario_misturado.txt" e realiza as seguintes ações:

Executa o Mergesort na lista de palavras e mede o tempo necessário.
Recarrega a lista de palavras do arquivo "dicionario.txt" e executa novamente o Mergesort, medindo o tempo.
Repete o mesmo processo para o Quicksort e o Heapsort, tanto com dados misturados como já ordenados.
O programa utiliza as classes "ProcessaArquivo" e "OrdenacaoStrings" para realizar as operações de leitura de arquivos e ordenação de palavras, respectivamente. O tempo de execução de cada algoritmo é medido e impresso no console, permitindo a comparação de desempenho entre eles em diferentes conjuntos de dados.

Esse código é uma ferramenta útil para compreender e comparar o desempenho dos algoritmos de ordenação em diferentes situações e conjuntos de dados. Ele também serve como um ótimo ponto de partida para estudantes e entusiastas da programação que desejam aprender mais sobre algoritmos de ordenação em Java.
