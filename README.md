# Sistema de Controle de Reservas de Hotel

Sistema desenvolvido em Java para o gerenciamento de reservas, focado na aplicação prática de conceitos de Orientação a Objetos, relacionamento entre classes, manipulação de vetores e lógica de programação.

## 🎯 Objetivo
O projeto consiste em um programa console para simular a gestão de um hotel. O foco principal foi a refatoração de um sistema simples para uma arquitetura baseada em **Composição** e **Enums**, aplicando boas práticas de Engenharia de Software como separação de responsabilidades e Injeção de Dependência.

## 🚀 Funcionalidades

O sistema opera através de um menu interativo com as seguintes opções:

- **Nova Reserva:** Cadastro completo injetando as dependências de Hóspede e Tipo de Quarto.
- **Listar Reservas:** Exibição detalhada de todos os registros ativos no vetor.
- **Busca por Nome:** Localização de reservas navegando pelo objeto Hóspede.
- **Ordenação:** Algoritmo de ordenação para organizar reservas por tempo de estadia.
- **Check-Out:** Funcionalidade de remoção de reserva com reorganização dinâmica do vetor.

## 🛠 Tecnologias e Conceitos Aplicados

Este projeto foi construído utilizando **Java** puro para fortalecer a base em POO e Algoritmos:

* **Orientação a Objetos (POO):**
    * **Composição:** A classe `Reserva` é composta por objetos `Hospede` e `TipoQuarto`.
    * **Enums Ricos:** Uso de Enumeradores (`TipoQuarto`) com atributos (preço, nome formatado) e construtores.
    * **Injeção de Dependência:** Objetos são instanciados no `Menu` e injetados prontos no construtor da `Reserva`.
    * **Encapsulamento:** Uso estrito de modificadores de acesso e métodos Getters.
* **Algoritmos e Estruturas de Dados:**
    * Manipulação avançada de **vetores (arrays)**.
    * Algoritmo de remoção e deslocamento de elementos.
    * Lógica de busca e ordenação manual.
* **Versionamento:** Uso de Git Flow (Branches, Pull Requests e Merges).

## 📂 Estrutura do Projeto

A arquitetura foi dividida para respeitar a responsabilidade única:

### 1. Entidades (`entities`)
* **`Hospede`:** Armazena dados pessoais (Nome, CPF, Idade).
* **`TipoQuarto` (Enum):** Centraliza as regras de negócio dos quartos (Valores fixos e Nomes).
* **`Reserva`:** Classe agregadora que une o Hóspede ao Quarto e calcula o valor total (`valorQuarto` * `dias`).

### 2. Aplicação (`application`)
* **`Menu`:** Classe principal responsável pela interação com o usuário, controle de fluxo (`do-while`, `switch`) e gerenciamento do vetor de reservas.

## ▶️ Como executar

1. Certifique-se de ter o **JDK** instalado.
2. Clone este repositório:
   ```bash
   git clone https://github.com/CarlosOliverDev/sistema-reserva-hotel.git
   ```
3. Abra o projeto em sua IDE de preferência (IntelliJ, Eclipse, VS Code).
4. Execute a classe Menu.java.
