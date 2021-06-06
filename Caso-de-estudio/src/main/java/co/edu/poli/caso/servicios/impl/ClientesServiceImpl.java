package co.edu.poli.caso.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.poli.caso.dto.ClientesDTO;
import co.edu.poli.caso.entidades.Clientes;
import co.edu.poli.caso.repositorios.ClientesRepository;
import co.edu.poli.caso.servicios.ClientesService;

@Service
public class ClientesServiceImpl implements ClientesService {

	@Autowired
	private ClientesRepository ClientesRepo;
	
	@Override
	public List<ClientesDTO> consultar() {
		List<Clientes> listaTmp = (List<Clientes>)ClientesRepo.findAll();
		List<ClientesDTO> lstClientes  = new ArrayList<ClientesDTO>();
		
		for(Clientes e : listaTmp) {
			ClientesDTO dto  = new ClientesDTO();
			dto.setIdClientes(e.getIdClientes());
			dto.setNom_Clientes(e.getNom_Clientes());
			lstClientes.add(dto);
		}
		
		return lstClientes;
	}

}
