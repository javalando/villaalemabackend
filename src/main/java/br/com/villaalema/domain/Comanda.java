package br.com.villaalema.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the comanda database table.
 * 
 */
@Entity
@NamedQuery(name="Comanda.findAll", query="SELECT c FROM Comanda c")
public class Comanda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_comanda")
	private int idComanda;

	private BigDecimal desconto;

	@Temporal(TemporalType.DATE)
	private Date dtabertura;

	@Temporal(TemporalType.DATE)
	private Date dtfechamento;

	private String nome;

	private BigDecimal pagar;

	private BigDecimal percentual;

	private BigDecimal total;

	//bi-directional many-to-one association to Mesa
	@ManyToOne
	@JoinColumn(name="idmesa")
	private Mesa mesa;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuarioBean;

	//bi-directional many-to-one association to ItensComanda
	@OneToMany(mappedBy="comanda")
	private List<ItensComanda> itensComandas;

	public Comanda() {
	}

	public int getIdComanda() {
		return this.idComanda;
	}

	public void setIdComanda(int idComanda) {
		this.idComanda = idComanda;
	}

	public BigDecimal getDesconto() {
		return this.desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public Date getDtabertura() {
		return this.dtabertura;
	}

	public void setDtabertura(Date dtabertura) {
		this.dtabertura = dtabertura;
	}

	public Date getDtfechamento() {
		return this.dtfechamento;
	}

	public void setDtfechamento(Date dtfechamento) {
		this.dtfechamento = dtfechamento;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPagar() {
		return this.pagar;
	}

	public void setPagar(BigDecimal pagar) {
		this.pagar = pagar;
	}

	public BigDecimal getPercentual() {
		return this.percentual;
	}

	public void setPercentual(BigDecimal percentual) {
		this.percentual = percentual;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Mesa getMesa() {
		return this.mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Usuario getUsuarioBean() {
		return this.usuarioBean;
	}

	public void setUsuarioBean(Usuario usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

	public List<ItensComanda> getItensComandas() {
		return this.itensComandas;
	}

	public void setItensComandas(List<ItensComanda> itensComandas) {
		this.itensComandas = itensComandas;
	}

	public ItensComanda addItensComanda(ItensComanda itensComanda) {
		getItensComandas().add(itensComanda);
		itensComanda.setComanda(this);

		return itensComanda;
	}

	public ItensComanda removeItensComanda(ItensComanda itensComanda) {
		getItensComandas().remove(itensComanda);
		itensComanda.setComanda(null);

		return itensComanda;
	}

}