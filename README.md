# Sistema de Controle de Reservas de Hotel

Sistema desenvolvido em Java para o gerenciamento de reservas, focado na aplicação prática de conceitos fundamentais de Orientação a Objetos, manipulação de vetores e lógica de programação.

##  Objetivo
O projeto consiste em um programa console para cadastrar reservas, listar hóspedes, realizar buscas e ordenar registros, simulando um ambiente real de gestão hoteleira com regras de negócio e validações específicas.

##  Funcionalidades

O sistema opera através de um menu interativo com as seguintes opções:

-  **Nova Reserva:** Cadastro de hóspedes com validação de dados (dias de estadia e valor da diária).
-  **Listar Reservas:** Exibição detalhada de todos os registros, incluindo cálculo automático do valor total da hospedagem.
-  **Busca por Nome:** Localização de reservas por fragmentos do nome do hóspede (case-insensitive).
-  **Ordenação:** Algoritmo para organizar as reservas de forma decrescente baseada no número de dias de estadia.

##  Tecnologias e Conceitos Aplicados

Este projeto foi construído utilizando **Java** puro, sem frameworks externos, para fortalecer a base em engenharia de software:

* **Java Core:** Tipos primitivos, operadores e estruturas de controle (`if/else`, `switch`, `loops`).
* **Orientação a Objetos (POO):**
    * Encapsulamento (atributos privados e métodos acessores).
    * Uso do `this` e construtores (incluindo sobrecarga).
    * Métodos auxiliares para desacoplamento de lógica.
* **Estruturas de Dados:** Manipulação de **vetores (arrays) de objetos** com tamanho fixo.
* **Algoritmos:** Implementação manual de lógica de ordenação e busca linear.
* **Entrada/Saída:** Interação via `Scanner` e formatação de saída.

##  Estrutura do Projeto

A arquitetura é baseada na classe principal e na entidade `Reserva`.

### Classe `Reserva`
Responsável por modelar o objeto de negócio com os seguintes atributos e comportamentos:
* **Atributos:** `nomeHospede`, `tipoQuarto`, `numeroDias`, `valorDiaria`.
* **Métodos:**
    * `calcularValorTotal()`: Retorna o custo final (dias × diária).
    * `toString()`: Apresentação formatada dos dados da reserva.
* **Validações:** Impede o cadastro de diárias negativas ou estadias inferiores a 1 dia.

##  Como executar

1. Certifique-se de ter o **JDK** instalado.
2. Clone este repositório:
   ```bash
   git clone https://github.com/CarlosOliverDev/sistema-reserva-hotel.git
   ```
3. Abra o projeto em sua IDE de preferência (IntelliJ, Eclipse, VS Code).
4. Execute a classe principal contendo o método main.