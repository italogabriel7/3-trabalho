
package model;


public class Professor {
    
int id_prof;
String nome;
String email;
String senha;

public Professor () {
}
public Professor (int id, String nome, String email, String senha) {
    this.id_prof = id;
    this.email= email;
    this.nome = nome;
    this.senha = senha;
}


    public int getId_prof() {
        return id_prof;
    }

    public void setId_prof(int id_prof) {
        this.id_prof = id_prof;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    

}