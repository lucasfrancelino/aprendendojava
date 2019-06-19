package com.company;

import javax.swing.*;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) {


//        int numero = 0;
//
//        while (numero <= 3){
//
//            System.out.println("O número está na contagem de: " + numero);
//
//            numero++;
//
//        }
//
//        /*************************************************************/
//
//        int numero2 = 0;
//
//        do{
//            System.out.println("O numero é: " + numero2);
//            numero2++;
//
//        }while(numero2 <= 3);
//
//        /*************************************************************/
//
//
//        for(int num = 10; num >= 0; num--){
//            System.out.println("no FOR o número é: " +num);
//        }
//
//        /*************************************************************/
//
//        for(int valor = 100; valor >= 0; valor--)
//            if(valor <= 40){
//                System.out.println("Produto está barato " + valor);
//            } else if(valor <= 60){
//                System.out.println("Produto está com valor padrão " + valor);
//            } else{
//                System.out.println("Produto está caro " + valor);
//            }
//
//        /*************************************************************/
//
//        for(int valor1 = 0; valor1 <= 100; valor1++){
//            if(valor1 <= 20){
//                System.out.println("Continua em loop " + valor1);
//            }else if (valor1 == 66){
//                System.out.println("Pausa o loop: " + valor1);
//                break;
//            }
//        }
//
//        for(int valor1 = 0; valor1 <= 100; valor1++){
//            if(valor1 == 20 || valor1 == 55 || valor1 == 100) {
//                System.out.println("Eitaaaa encontrei o valor " + valor1);
//                continue;
//            }
//            System.out.println("processando laço de repetição");
//        }

//        /*************************************************************/


//        String carro = JOptionPane.showInputDialog("Entre com a quantidade de carros");
//        String pessoa = JOptionPane.showInputDialog("Entre com a quantidade de pessoas");
//
//        double carrosNumro = Double.parseDouble(carro);
//        double pessoaNumero = Double.parseDouble(pessoa);
//
//        int divisao = (int) ((carrosNumro * 2)/pessoaNumero);
//
//        JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da operação?");
//
//
//
//        JOptionPane.showMessageDialog(null, divisao);

//        /*************************************************************/

        Aluno aluno = new Aluno();


//        aluno.setNome("Lucas");
//        aluno.setIdade(22);
//        aluno.setDataNascimento("24/10/1996");
//        aluno.setRegistroGeral("123.1234");
//        aluno.setNumeroCpf("465.465.546-78");
//        aluno.setNomeMae("");
//        aluno.setNomePai("Eulogio");
//        aluno.setDataMatricula("18/04/2012");
//        aluno.setSerieMatriculado("5º");
//
//
//        System.out.println("Nome: " + aluno.getNome());
//        System.out.println("Idade: " + aluno.getIdade());
//        System.out.println("Data de nascimento: " + aluno.getDataNascimento());
//        System.out.println("RG: " + aluno.getRegistroGeral());
//        System.out.println("CPF: " + aluno.getNumeroCpf());
//        System.out.println("Nome da mãe: " + aluno.getNomeMae());
//        System.out.println("Nome do pai: " + aluno.getNomePai());
//        System.out.println("Data da matrícula: " + aluno.getDataMatricula());
//        System.out.println("Série: " + aluno.getSerieMatriculado());

//        /*************************************************************/
//
//
//            aluno.setNota1(99);
//            aluno.setNota2(40);
//            aluno.setNota3(66);
//            aluno.setNota4(77);
//
//        System.out.println("A média do aluno no bimestre foi de: " + aluno.getMediaNota());


        /*************************************************************/

//        String nomeEntrada = JOptionPane.showInputDialog("Qual nome do estudante?");
//            aluno.setNome(nomeEntrada);
//
//        String idadeEntrada = JOptionPane.showInputDialog("Qual a idade do estudate?");
//            int idade = Integer.parseInt(idadeEntrada);
//                aluno.setIdade(idade);
//
//        String dataNascimentoEntrada = JOptionPane.showInputDialog("Data de nascimento de " +nomeEntrada+ "?");
//            aluno.setDataNascimento(dataNascimentoEntrada);
//
//        String rg = JOptionPane.showInputDialog("Insira o RG de " +nomeEntrada+ ":");
//            aluno.setRegistroGeral(rg);
//
//        String cpf = JOptionPane.showInputDialog("Insira o CPF de " +nomeEntrada+ ":");
//            aluno.setNumeroCpf(cpf);
//
//        String nomeMae = JOptionPane.showInputDialog("Insira o nome da mãe de " +nomeEntrada+ ":");
//            aluno.setNomeMae(nomeMae);
//
//        String nomePai = JOptionPane.showInputDialog("Insira o nome do pai de " +nomeEntrada+ ":");
//            aluno.setNomePai(nomePai);
//
//        String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula?");
//            aluno.setDataMatricula(dataMatricula);
//
//        String serie = JOptionPane.showInputDialog("Qual a série que o estudante está matriculado? ");
//            aluno.setSerieMatriculado(serie);

        String disciplina1 = JOptionPane.showInputDialog("Insira a disciplina 1 cursando");
            aluno.getDisciplina().setDisciplina1(disciplina1);

        String nota1 = JOptionPane.showInputDialog("Qual a nota da primeira prova? ");
            double notaEntrada1 = Double.parseDouble(nota1);
            aluno.getDisciplina().setNota1(notaEntrada1);

        String disciplina2 = JOptionPane.showInputDialog("Insira a disciplina 2 cursando");
            aluno.getDisciplina().setDisciplina2(disciplina2);

        String nota2 = JOptionPane.showInputDialog("Qual a nota da segunda prova? ");
            double notaEntrada2 = Double.parseDouble(nota2);
            aluno.getDisciplina().setNota2(notaEntrada2);

        String disciplina3 = JOptionPane.showInputDialog("Insira a disciplina 3 cursando");
            aluno.getDisciplina().setDisciplina3(disciplina3);

        String nota3 = JOptionPane.showInputDialog("Qual a nota da terceira prova? ");
            double notaEntrada3 = Double.parseDouble(nota3);
            aluno.getDisciplina().setNota3(notaEntrada3);

        String disciplina4 = JOptionPane.showInputDialog("Insira a disciplina 4 cursando");
            aluno.getDisciplina().setDisciplina4(disciplina4);

        String nota4 = JOptionPane.showInputDialog("Qual a nota da quarta prova? ");
            double notaEntrada4 = Double.parseDouble(nota4);
            aluno.getDisciplina().setNota4(notaEntrada4);
//
//
//
//        System.out.println("Nome: " + aluno.getNome());
//        System.out.println("Idade: " + aluno.getIdade());
//        System.out.println("Data de nascimento: " + aluno.getDataNascimento());
//        System.out.println("RG: " + aluno.getRegistroGeral());
//        System.out.println("CPF: " + aluno.getNumeroCpf());
//        System.out.println("Nome da mãe: " + aluno.getNomeMae());
//        System.out.println("Nome do pai: " + aluno.getNomePai());
//        System.out.println("Data da matrícula: " + aluno.getDataMatricula());
//        System.out.println("Série: " + aluno.getSerieMatriculado());

        System.out.println("Disciplina 1: "+aluno.getDisciplina().getDisciplina1());
        System.out.println("Nota 1: " + aluno.getDisciplina().getNota1());
        System.out.println("Disciplina 2: "+aluno.getDisciplina().getDisciplina2());
        System.out.println("Nota 2: " + aluno.getDisciplina().getNota2());
        System.out.println("Disciplina 3: "+aluno.getDisciplina().getDisciplina3());
        System.out.println("Nota 3: " + aluno.getDisciplina().getNota3());
        System.out.println("Disciplina 4: "+aluno.getDisciplina().getDisciplina4());
        System.out.println("Nota 4: " + aluno.getDisciplina().getNota4());
        aluno.situacaoAluno();


        /*************************************************************/

//
//        System.out.println(aluno); /*toString*/
//        System.out.println("Media do estudante: " +aluno.getMediaNota());


        /*************************************************************/

//        utilizando o equals e hashcode

//        Aluno aluno101 = new Aluno();
//            aluno101.setNome("Alex");
//        Aluno aluno202 = new Aluno();
//            aluno202.setNome("Alex");
//
//
//        if(aluno101.equals(aluno202)){
//            System.out.println("São iguais");
//        }else{
//            System.out.println("São diferentes");
//        }


        /*************************************************************/

        /*Lista em Java*/

        List lista = new ArrayList();



    }
}