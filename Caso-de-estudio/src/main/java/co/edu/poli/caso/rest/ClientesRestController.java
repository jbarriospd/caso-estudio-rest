package co.edu.poli.caso.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.caso.dto.ClientesDTO;
import co.edu.poli.caso.servicios.ClientesService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClientesRestController {
	@Autowired
	private ClientesService service;
	
	@GetMapping("/clientes")
	public List<ClientesDTO> consultar(){
		return service.consultar();
	}
}
