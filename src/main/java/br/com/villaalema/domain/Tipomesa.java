package br.com.villaalema.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


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
}