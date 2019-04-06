package br.com.villaalema.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the itens_comanda database table.
 * 
 */
@Entity
@Table(name="itens_comanda")
@NamedQuery(name="ItensComanda.findAll", query="SELECT i FROM ItensComanda i")
public class ItensComanda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="iditens_comanda")
	private int iditensComanda;

	private int quantidate;

	@Column(name="valor_item")
	private BigDecimal valorItem;

	//bi-directional many-to-one association to Comanda
	@ManyToOne
	@JoinColumn(name="id_comanda")
	private Comanda comanda;

	//bi-directional many-to-one association to Produto
	@ManyToOne
	@JoinColumn(name="id_produto")
	private Produto produto;

	public ItensComanda() {
	}

	public int getIditensComanda() {
		return this.iditensComanda;
	}

	public void setIditensComanda(int iditensComanda) {
		this.iditensComanda = iditensComanda;
	}

	public int getQuantidate() {
		return this.quantidate;
	}

	public void setQuantidate(int quantidate) {
		this.quantidate = quantidate;
	}

	public BigDecimal getValorItem() {
		return this.valorItem;
	}

	public void setValorItem(BigDecimal valorItem) {
		this.valorItem = valorItem;
	}

	public Comanda getComanda() {
		return this.comanda;
	}

	public void setComanda(Comanda comanda) {
		this.comanda = comanda;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}