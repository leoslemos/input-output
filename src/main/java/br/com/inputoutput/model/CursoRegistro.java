package br.com.inputoutput.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "curso_registro")
public class CursoRegistro {

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "estudante_id")
    private Estudante estudante;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    private Integer duracao;

    public CursoRegistro() {
    }

    public CursoRegistro(Integer duracao){
        super();
        this.duracao = duracao;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

}
