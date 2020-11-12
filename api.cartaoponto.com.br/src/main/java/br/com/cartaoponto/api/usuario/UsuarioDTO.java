package br.com.cartaoponto.api.usuario;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioDTO {
	private int id;
	private String nomeUsuario;
	private String senhaUsuario;
	private int grupoUsuario;
	private int flAtivo;
	private LocalDateTime dhInsert;
	private LocalDateTime dhUpdate;
	
	public UsuarioDTO(UsuarioEntity usuario) {
		this.id = usuario.getId();
		this.nomeUsuario = usuario.getNomeUsuario();
		this.senhaUsuario = usuario.getSenhaUsuario();
		this.grupoUsuario = usuario.getGrupoUsuario();
		this.flAtivo = usuario.getFlAtivo();
		this.dhInsert = usuario.getDhInsert();
		this.dhUpdate = usuario.getDhUpdate();
	}
	

	public int getId() {
		return id;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public int getGrupoUsuario() {
		return grupoUsuario;
	}
	public int getFlAtivo() {
		return flAtivo;
	}

	public static List<UsuarioDTO> converter(List<UsuarioEntity> usuarios) {
		
		return usuarios.stream().map(UsuarioDTO::new).collect(Collectors.toList());
	}

	public LocalDateTime getDhInsert() {
		return dhInsert;
	}	
	
	public LocalDateTime getDhUpdate() {
		return dhUpdate;
	}	
	
}
