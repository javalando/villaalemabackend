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
	private int idmesa;

	private String descricao;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idtipomesa",referencedColumnName="idtipomesa")
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

	
	public Tipomesa getTipomesa() {
		return this.tipomesa;
	}

	public void setTipomesa(Tipomesa tipomesa) {
		this.tipomesa = tipomesa;
	}

}