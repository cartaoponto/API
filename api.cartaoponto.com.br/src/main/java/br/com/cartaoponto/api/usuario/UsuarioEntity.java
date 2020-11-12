package br.com.cartaoponto.api.usuario;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class UsuarioEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private int id;
	
	@Column(name = "NOME_USUARIO")
	private String nomeUsuario;
	
	@Column(name = "CD_SENHA")
	private String senhaUsuario;
	
	@Column(name = "CD_GRUPO")
	private int grupoUsuario;
	
	@Column(name = "FL_ATIVO")
	private int flAtivo;
	
	@Column(name = "DH_INSERT")
	private LocalDateTime dhInsert;
	
	@Column(name = "DH_UPDATE")
	private LocalDateTime dhUpdate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public int getGrupoUsuario() {
		return grupoUsuario;
	}

	public void setGrupoUsuario(int grupoUsuario) {
		this.grupoUsuario = grupoUsuario;
	}

	public int getFlAtivo() {
		return flAtivo;
	}

	public void setFlAtivo(int flAtivo) {
		this.flAtivo = flAtivo;
	}

	public LocalDateTime getDhInsert() {
		return dhInsert;
	}

	public void setDhInsert(LocalDateTime dhInsert) {
		this.dhInsert = dhInsert;
	}

	public LocalDateTime getDhUpdate() {
		return dhUpdate;
	}

	public void setDhUpdate(LocalDateTime dhUpdate) {
		this.dhUpdate = dhUpdate;
	}
	
	
}
