# Contador

Este projeto é uma aplicação Java que solicita dois parâmetros do usuário e imprime uma contagem com base na diferença entre esses parâmetros. O programa inclui tratamento de exceções para lidar com parâmetros inválidos.

## Descrição

O programa realiza as seguintes ações:
1. Solicita ao usuário dois parâmetros inteiros.
2. Verifica se o primeiro parâmetro é menor ou igual ao segundo. Caso contrário, lança uma exceção personalizada.
3. Se os parâmetros forem válidos, o programa imprime uma contagem de 1 até a diferença entre os dois parâmetros.

## Exceções Personalizadas

A aplicação utiliza uma exceção personalizada, `ParametrosInvalidosException`, para tratar o caso em que o primeiro parâmetro é maior que o segundo.

## Entrada

Digite o primeiro parâmetro: 2

Digite o segundo parâmetro: 5

## Saída

Após a execução, o programa pode exibir uma mensagem semelhante a esta:

Imprimindo o número 1

Imprimindo o número 2

Imprimindo o número 3

## Exception

Se o primeiro parâmetro for maior que o segundo, o programa exibirá a mensagem de erro:

message: O primeiro parâmetro deve ser menor ou igual ao segundo.
