/*
📂 Situação: Controle de Projetos em uma Empresa de Consultoria

Você foi contratado para desenvolver um sistema simples de gerenciamento de projetos internos.
A empresa precisa organizar os projetos ativos e acompanhar seus responsáveis.

Requisitos:
- Cada projeto deve ter:
  • Nome do projeto
  • Nome do responsável
  • Status (em andamento, concluído, cancelado)

- Os projetos serão armazenados em um ArrayList.

Funcionalidades que o sistema deve oferecer:
1. Adicionar novos projetos.
2. Remover projetos pelo nome.
3. Atualizar o status de um projeto existente.
4. Listar todos os projetos ativos e seus responsáveis.

Objetivo:
Criar um programa em Java que utilize ArrayList para manipular dinamicamente
a lista de projetos, simulando um sistema interno de uma empresa.
*/


import java.util.ArrayList;
import java.util.Scanner;

class Projetos{
    String nomeResp;
    String nomeProjeto;
    String status;

    public Projetos(String nomeResp, String nomeProjeto, String status){
        this.nomeResp = nomeResp;
        this.nomeProjeto = nomeProjeto;
        this.status = status;
    }

    public String toString() {
        return "\nNome do Responsavel: " + nomeResp +
                "\nNome do Projeto: " + nomeProjeto +
                "\nStatus do Projeto: " + status +
                "\n============================";
    }
}

public class main {
    public static void main(String[] args){
        ArrayList<Projetos> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {

            System.out.println("\n=== Controle de projetos ===");
            System.out.println("=== 1. Adicionar projeto ===");
            System.out.println("=== 2. Atualizar projetos ===");
            System.out.println("=== 3. Remover projetos ===");
            System.out.println("=== 4. Listar projetos ===");
            System.out.println("=== 5. Sair do programa ===");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do resposavel: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digte o nome do projeto: ");
                    String nomeProjeto = scanner.nextLine();

                    System.out.print("Status do projeto (em andamento, concluído, cancelado): ");
                    String status = scanner.nextLine();

                    System.out.println("\nProjeto adicionado com sucesso!!");

                    Projetos novo = new Projetos(nome, nomeProjeto, status);
                    lista.add(novo);
                    break;

                case 2:
                    System.out.print("\nDigite o projeto que deseja atualizar: ");
                    String atualizar = scanner.nextLine();

                    Projetos atualizarProjeto = null;
                    for (Projetos p : lista) {

                        if (p.nomeProjeto.equalsIgnoreCase(atualizar)) {
                            atualizarProjeto = p;
                            break;
                        }
                    }
                    if (atualizarProjeto != null) {
                        System.out.println("\n1. Atualizar o nome do responsavel");
                        System.out.println("2. Atualizar o nome do projeto");
                        System.out.println("3. Atualizar o status do projeto");
                        System.out.println("4. Voltar para o menu principal");
                        System.out.print("Digite a opção desejada: ");
                        int escolha = scanner.nextInt();
                        scanner.nextLine();
                        switch (escolha) {

                            case 1:
                                System.out.print("Digite o novo responsavel pelo projeto: ");
                                String novoResp = scanner.nextLine();
                                atualizarProjeto.nomeResp = novoResp;
                            break;

                            case 2:
                                System.out.print("Digite o novo nome do projeto: ");
                                String novoProj = scanner.nextLine();
                                atualizarProjeto.nomeProjeto = novoProj;
                            break;

                            case 3:
                                System.out.print("Digite o novo status desse projeto: ");
                                String novoStatus = scanner.nextLine();
                                atualizarProjeto.status = novoStatus;
                            break;
                        }

                        System.out.print("\n O projeto " + atualizar + " atualizado com sucesso!");
                    }else{
                        System.out.println("\nO projeto " + atualizar + " não foi encontrado!");
                    }
                    break;

                case 3:
                    System.out.print("\nDigite o nome do projeto para remover: ");
                    String remover = scanner.nextLine();
                    boolean removido = lista.removeIf(p -> p.nomeProjeto.equalsIgnoreCase(remover));
                    if (removido) {
                        System.out.println("\nProjeto removido com sucesso");
                    } else {
                        System.out.println("\nO projeto " + remover + " não foi encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("\n=== Lista de Projetos ===");
                    for (Projetos p : lista) {
                        System.out.println(p);
                    }
                    break;

                case 5:

                    System.out.println("\nEncerrando o programa ...");
                    break;

                default:
                    System.out.println("\nOpção Invalida");
                    break;
            }
        }while (opcao !=5);
    }
}

