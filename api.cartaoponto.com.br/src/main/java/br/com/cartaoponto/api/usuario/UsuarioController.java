package br.com.cartaoponto.api.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@RequestMapping(method = RequestMethod.GET, value = "")
	public List<UsuarioDTO> findAll() {
		List<UsuarioEntity> usuarios = usuarioRepository.findAll();
		
		return UsuarioDTO.converter(usuarios);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public List<UsuarioDTO> findById(@PathVariable int id) {
		List<UsuarioEntity> usuario = usuarioRepository.findById(id);
		
		return UsuarioDTO.converter(usuario);
	}
}
