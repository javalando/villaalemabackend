package br.com.villaalema.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the produtos database table.
 * 
 */
@Entity
@Table(name="produtos")
@NamedQuery(name="Produto.findAll", query="SELECT p FROM Produto p")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_produto")
	private int idProduto;

	@Column(name="fl_ativo")
	private String flAtivo;

	@Column(name="nome_produto")
	private String nomeProduto;

	private BigDecimal valor;

	//bi-directional many-to-one association to ItensComanda
	@OneToMany(mappedBy="produto")
	private List<ItensComanda> itensComandas;

	public Produto() {
	}

	public int getIdProduto() {
		return this.idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getFlAtivo() {
		return this.flAtivo;
	}

	public void setFlAtivo(String flAtivo) {
		this.flAtivo = flAtivo;
	}

	public String getNomeProduto() {
		return this.nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public List<ItensComanda> getItensComandas() {
		return this.itensComandas;
	}

	public void setItensComandas(List<ItensComanda> itensComandas) {
		this.itensComandas = itensComandas;
	}

	public ItensComanda addItensComanda(ItensComanda itensComanda) {
		getItensComandas().add(itensComanda);
		itensComanda.setProduto(this);

		return itensComanda;
	}

	public ItensComanda removeItensComanda(ItensComanda itensComanda) {
		getItensComandas().remove(itensComanda);
		itensComanda.setProduto(null);

		return itensComanda;
	}

}