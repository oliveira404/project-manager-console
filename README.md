# 📋 Sistema de Controle de Projetos

## 📖 Descrição

Este projeto é um sistema simples de **gerenciamento de projetos internos** desenvolvido em Java.  
Ele permite organizar projetos ativos e acompanhar seus responsáveis de forma dinâmica.

---

## 🚀 Funcionalidades

- ✅ Adicionar novos projetos
- ✅ Atualizar informações de um projeto existente
- ✅ Remover projetos pelo nome
- ✅ Listar projetos cadastrados
- ✅ Menu interativo via terminal

---

## 🏗️ Estrutura do Projeto

### Classe `Projetos`

Responsável por representar um projeto, armazenando:

- Nome do responsável
- Nome do projeto
- Status do projeto

### Classe `Main`

Responsável pelo funcionamento do sistema:

- Exibição do menu
- Cadastro de projetos
- Atualização de dados
- Remoção de projetos
- Listagem dos projetos

---

## 🛠️ Tecnologias Utilizadas

- Java
- ArrayList
- Scanner
- Programação Orientada a Objetos (POO)

---

## 📂 Funcionalidades do Menu

```text
=== Controle de Projetos ===

1. 📁 Adicionar projeto
2. 📝 Atualizar projeto
   ├─ 1. Atualizar o nome do responsável
   ├─ 2. Atualizar o nome do projeto
   ├─ 3. Atualizar o status do projeto
   └─ 4. Voltar para o menu principal
3. 🗑️ Remover projeto
4. 📋 Listar projetos
5. 🚪 Sair do programa
```

---

## ▶️ Como Executar

### Compilar o projeto

```bash
javac Main.java
```

### Executar o projeto

```bash
java Main
```

---

## 💻 Exemplo de Uso

### Cadastro de Projeto

```text
Digite o nome do responsável: João Silva
Digite o nome do projeto: Sistema Financeiro
Status do projeto: Em andamento
```

### Listagem

```text
Nome do Responsavel: João Silva
Nome do Projeto: Sistema Financeiro
Status do Projeto: Em andamento
============================
```

---

## 📚 Conceitos Aplicados

- Manipulação de coleções com ArrayList
- Estruturas de repetição (`for`, `do-while`)
- Estruturas condicionais (`if`, `switch`)
- Busca e atualização de objetos
- Remoção de elementos com `removeIf()`
- Programação Orientada a Objetos

---

## 🎯 Objetivo

Praticar o uso de coleções em Java através da implementação de um sistema simples de gerenciamento de projetos, simulando um cenário real de uma empresa de consultoria.

---

## 👨‍💻 Autor

Desenvolvido por **Guilherme Henrique** como exercício de estudo em Java para praticar manipulação de listas e Programação Orientada a Objetos.
