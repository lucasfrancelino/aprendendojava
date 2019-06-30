package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//@Getter @Setter @NoArgsConstructor
public class Aluno {

    private String nome;
    private int idade;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    private String resultado;


    /*Declarando minnha classe de Disciplina como sendo uma Lista*/
    /*Significa que eu tenho uma lista de Disciplinas*/
    private List <Disciplina> disciplinas = new ArrayList<Disciplina>();

    public List<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplinas = disciplina;
    }

    public Aluno() {

    }


    public Aluno(String nomePadrao) {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public double getMediaNota() {

        double soma = 0.0;

                for(Disciplina disciplinaMedia : disciplinas){
                    soma += disciplinaMedia.getNota();
                }

        return soma / disciplinas.size();
    }


    public String situacaoAluno() {
        if (getMediaNota() >= 70) {
            System.out.println("Estudante aprovado direto " + getMediaNota());
        } else if (getMediaNota() <= 60) {
            System.out.println("Estudante terá que fazer recuperação: " + getMediaNota());
        }else if (getMediaNota() <= 50){
            System.out.println("Estudante reprovado direto: " + getMediaNota());
        }
        return resultado;
    }

}