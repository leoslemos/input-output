package br.com.inputoutput.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @OneToMany(mappedBy = "curso")
    private Set<CursoRegistro> cursoRegistros;

    public Curso() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<CursoRegistro> getCursoRegistros() {
        return cursoRegistros;
    }

    public void setCursoRegistros(Set<CursoRegistro> cursoRegistros) {
        this.cursoRegistros = cursoRegistros;
    }
}
