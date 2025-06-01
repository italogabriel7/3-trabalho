
package model;


public class Pergunta {
    private int id_pergunta;
    private int tipo;
    private int fkidcaso_clinico;
    private int fkidResposta;

    public Pergunta() {
    }

    public Pergunta(int id_pergunta, int tipo, int fkidcaso_clinico, int fkidResposta) {
        this.id_pergunta = id_pergunta;
        this.tipo = tipo;
        this.fkidcaso_clinico = fkidcaso_clinico;
        this.fkidResposta = fkidResposta;
    }

    public int getId_pergunta() {
        return id_pergunta;
    }

    public void setId_pergunta(int id_pergunta) {
        this.id_pergunta = id_pergunta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getFkidcaso_clinico() {
        return fkidcaso_clinico;
    }

    public void setFkidcaso_clinico(int fkidcaso_clinico) {
        this.fkidcaso_clinico = fkidcaso_clinico;
    }

    public int getFkidResposta() {
        return fkidResposta;
    }

    public void setFkidResposta(int fkidResposta) {
        this.fkidResposta = fkidResposta;
    }
    
    
}
