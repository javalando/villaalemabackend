package br.com.villaalema.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mesa database table.
 * 
 */
@Entity
@NamedQuery(name="Mesa.findAll", query="SELECT m FROM Mesa m")
public class Mesa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idmesa;

	private String descricao;

	//bi-directional many-to-one association to Comanda
	@OneToMany(mappedBy="mesa", fetch = FetchType.LAZY)
	private List<Comanda> comandas;

	@OneToOne(mappedBy = "mesa", cascade = CascadeType.ALL, 
    		 fetch = FetchType.LAZY, optional = true)
	private Tipomesa tipomesa;

	public Mesa() {
	}

	public int getIdmesa() {
		return this.idmesa;
	}

	public void setIdmesa(int idmesa) {
		this.idmesa = idmesa;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Comanda> getComandas() {
		return this.comandas;
	}

	public void setComandas(List<Comanda> comandas) {
		this.comandas = comandas;
	}

	public Comanda addComanda(Comanda comanda) {
		getComandas().add(comanda);
		comanda.setMesa(this);

		return comanda;
	}

	public Comanda removeComanda(Comanda comanda) {
		getComandas().remove(comanda);
		comanda.setMesa(null);

		return comanda;
	}

	public Tipomesa getTipomesa() {
		return this.tipomesa;
	}

	public void setTipomesa(Tipomesa tipomesa) {
		this.tipomesa = tipomesa;
	}

}