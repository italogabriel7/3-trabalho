
package model;


public class Aluno {
   private int id_estudante;
   private String nome;
   private String matricula;
   private String senha; 
   private int fkidTurma;

    public Aluno() {
        
    }

    public Aluno(int id_estudante, String nome, String matricula, String senha, int fkidTurma) {
        this.id_estudante = id_estudante;
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
        this.fkidTurma = fkidTurma;
    }

    public int getId_estudante() {
        return id_estudante;
    }

    public void setId_estudante(int id_estudante) {
        this.id_estudante = id_estudante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getFkidTurma() {
        return fkidTurma;
    }

    public void setFkidTurma(int fkidTurma) {
        this.fkidTurma = fkidTurma;
    }

  
    }

 