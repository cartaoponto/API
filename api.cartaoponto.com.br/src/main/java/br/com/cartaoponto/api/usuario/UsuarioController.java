package br.com.cartaoponto.api.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	public List<UsuarioDTO> listaUsuarios() {
		List<UsuarioEntity> usuarios = usuarioRepository.findAll();
		
		return UsuarioDTO.converter(usuarios);
	}
}
