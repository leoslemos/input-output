package br.com.inputoutput.model;

import javax.persistence.*;

@Entity
@Table(name = "cadfornecendereco")
public class FornecedorEndereco extends Endereco {

    @Enumerated(value = EnumType.STRING)
    @Column(name = "tipo_endereco")
    private EEndereco tipoEndereco;

    // TODO: 25/07/2020 >>> criar uma forma de incluir apenas o id do fornecedor sem necessidade da tabela de relação
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_fornecedor")
//    private Fornecedor fornecedor;


    public FornecedorEndereco(){
        super();
    }

    public FornecedorEndereco(String cep, String logradouro, String complemento, String outroComplemento, String bairro, String localidade, String uf) {
        super(cep, logradouro, complemento, outroComplemento, bairro, localidade, uf);
    }

    public EEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(EEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

}
