
package model;


public class Turma {
 private int id_turma;
 private String nome;
 private String periodo;
 private int fkidProfessor;
 private int fkidCasos_clinicos;

    public Turma() {
    }

    public Turma(int id_turma, String nome, String periodo, int fkidProfessor, int fkidCasos_clinicos) {
        this.id_turma = id_turma;
        this.nome = nome;
        this.periodo = periodo;
        this.fkidProfessor = fkidProfessor;
        this.fkidCasos_clinicos = fkidCasos_clinicos;
    }

    public int getId_turma() {
        return id_turma;
    }

    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getFkidProfessor() {
        return fkidProfessor;
    }

    public void setFkidProfessor(int fkidProfessor) {
        this.fkidProfessor = fkidProfessor;
    }

    public int getFkidCasos_clinicos() {
        return fkidCasos_clinicos;
    }

    public void setFkidCasos_clinicos(int fkidCasos_clinicos) {
        this.fkidCasos_clinicos = fkidCasos_clinicos;
    }
    
}