
package model;

import java.time.LocalDate;


public class CasosClinicos {
private    int id_caso;
private String enunciado;
private String complexidade;
private String especialidade; 
private LocalDate dataCriacao;
private int fkidProfessor;
     
    


    public CasosClinicos() {
    }

    public CasosClinicos(int id_caso, String enunciado, String complexidade, String especialidade, LocalDate dataCriacao, int fkidProfessor) {
        this.id_caso = id_caso;
        this.enunciado = enunciado;
        this.complexidade = complexidade;
        this.especialidade = especialidade;
        this.dataCriacao = dataCriacao;
        this.fkidProfessor = fkidProfessor;
    }

    public int getId_caso() {
        return id_caso;
    }

    public void setId_caso(int id_caso) {
        this.id_caso = id_caso;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(String complexidade) {
        this.complexidade = complexidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getFkidProfessor() {
        return fkidProfessor;
    }

    public void setFkidProfessor(int fkidProfessor) {
        this.fkidProfessor = fkidProfessor;
    }
    
}