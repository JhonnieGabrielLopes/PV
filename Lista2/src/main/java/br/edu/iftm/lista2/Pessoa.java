package br.edu.iftm.lista2;

import java.util.List;

/**
 *
 * @author jhonn
 */
public class Pessoa {
    private String nome;
    private String senha;
    private String cpf;
    private String curso;
    private String comentario;
    private String interesse;
    private String turno;
    private String habilidade="Não possui";
    private String email="Não cadastrado";
    private String telefone="Não cadastrado";

    public Pessoa(String nome, String senha, String cpf, String curso, String comentario, String interesse, String turno, String habilidade) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.curso = curso;
        this.comentario = comentario;
        this.interesse = interesse;
        this.turno = turno;
        this.habilidade = habilidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return "Cadastro Realizado!" + "\nNome: " + nome + "\nSenha: " + senha + "\nCPF: " + cpf + "\nCurso: " + curso + "\nComentario: " + comentario + "\nReceber: " + interesse + "\nEmail: " + email + "\nTelefone: " + telefone +"\nTurno: " + turno + "\nHabilidades:\n" + habilidade;
    }
    
}
