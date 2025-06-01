
package model;


public class Resposta {
    private int id_resposta;
    private int id_estudante;
    private int id_pergunta;
    private int id_caso;
    private int fkidaluno;

    public Resposta() {
    }

    public Resposta(int id_resposta, int id_estudante, int id_pergunta, int id_caso, int fkidaluno) {
        this.id_resposta = id_resposta;
        this.id_estudante = id_estudante;
        this.id_pergunta = id_pergunta;
        this.id_caso = id_caso;
        this.fkidaluno = fkidaluno;
    }

    public int getId_resposta() {
        return id_resposta;
    }

    public void setId_resposta(int id_resposta) {
        this.id_resposta = id_resposta;
    }

    public int getId_estudante() {
        return id_estudante;
    }

    public void setId_estudante(int id_estudante) {
        this.id_estudante = id_estudante;
    }

    public int getId_pergunta() {
        return id_pergunta;
    }

    public void setId_pergunta(int id_pergunta) {
        this.id_pergunta = id_pergunta;
    }

    public int getId_caso() {
        return id_caso;
    }

    public void setId_caso(int id_caso) {
        this.id_caso = id_caso;
    }

    public int getFkidaluno() {
        return fkidaluno;
    }

    public void setFkidaluno(int fkidaluno) {
        this.fkidaluno = fkidaluno;
    }
    
    
}
