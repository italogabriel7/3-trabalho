
package model;


public class Feedback {
    private int id_feedback;
    private int id_resposta;
    private String comentario;
    private double pontuacao;
    private String sugestao;
    private int fkidResposta;

    public Feedback() {
    }

    public Feedback(int id_feedback, int id_resposta, String comentario, double pontuacao, String sugestao, int fkidResposta) {
        this.id_feedback = id_feedback;
        this.id_resposta = id_resposta;
        this.comentario = comentario;
        this.pontuacao = pontuacao;
        this.sugestao = sugestao;
        this.fkidResposta = fkidResposta;
    }

    public int getId_feedback() {
        return id_feedback;
    }

    public void setId_feedback(int id_feedback) {
        this.id_feedback = id_feedback;
    }

    public int getId_resposta() {
        return id_resposta;
    }

    public void setId_resposta(int id_resposta) {
        this.id_resposta = id_resposta;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getSugestao() {
        return sugestao;
    }

    public void setSugestao(String sugestao) {
        this.sugestao = sugestao;
    }

    public int getFkidResposta() {
        return fkidResposta;
    }

    public void setFkidResposta(int fkidResposta) {
        this.fkidResposta = fkidResposta;
    }
    
    
}
