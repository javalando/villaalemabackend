package br.com.villaalema.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipomesa database table.
 * 
 */
@Entity
@NamedQuery(name="Tipomesa.findAll", query="SELECT t FROM Tipomesa t")
public class Tipomesa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idtipomesa;

	private String descricao;

	     @MapsId
		 @OneToOne(fetch = FetchType.LAZY)
		 @JoinColumn(name = "idtipomesa")
	private Mesa mesa;

	public Tipomesa() {
	}

	public int getIdtipomesa() {
		return this.idtipomesa;
	}

	public void setIdtipomesa(int idtipomesa) {
		this.idtipomesa = idtipomesa;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Mesa getMesa() {
		return this.mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	
}