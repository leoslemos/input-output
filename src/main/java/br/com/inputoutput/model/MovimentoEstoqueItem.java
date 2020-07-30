package br.com.inputoutput.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "relmovimentoestoqueitem")
public class MovimentoEstoqueItem {

    @Id
    @Column(name = "id_movimentosestoqueitem")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMovimentoEstoqueItem;

    @ManyToOne
    @JoinColumn(name = "movimentoestoque_id")
    private br.sc.senai.model.MovimentoEstoque movimentoEstoque;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private br.sc.senai.model.Produto produtoEstoque;

    private LocalDateTime registeredAt;

    public MovimentoEstoqueItem() {
    }

//    public MovimentoEstoqueItem(Double qtdMovimento, Double vlrUnitario){
//        this.qtdMovimento = qtdMovimento;
//        this.vlrUnitario = vlrUnitario;
//    }

    public Integer getIdMovimentoEstoqueItem() {
        return idMovimentoEstoqueItem;
    }

    public void setIdMovimentoEstoqueItem(Integer idMovimentoEstoqueItem) {
        this.idMovimentoEstoqueItem = idMovimentoEstoqueItem;
    }

    public br.sc.senai.model.MovimentoEstoque getMovimentoEstoque() {
        return movimentoEstoque;
    }

    public void setMovimentoEstoque(br.sc.senai.model.MovimentoEstoque movimentoEstoque) {
        this.movimentoEstoque = movimentoEstoque;
    }

//    public Double getQtdMovimento() {
//        return qtdMovimento;
//    }
//
//    public void setQtdMovimento(Double qtdMovimento) {
//        this.qtdMovimento = qtdMovimento;
//    }
//
//    public Double getVlrUnitario() {
//        return vlrUnitario;
//    }
//
//    public void setVlrUnitario(Double vlrUnitario) {
//        this.vlrUnitario = vlrUnitario;
//    }

    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(LocalDateTime registeredAt) {
        this.registeredAt = registeredAt;

    }

    public br.sc.senai.model.Produto getProdutoEstoque() {
        return produtoEstoque;
    }

    public void setProdutoEstoque(br.sc.senai.model.Produto produtoEstoque) {
        this.produtoEstoque = produtoEstoque;
    }
}
