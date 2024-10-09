package br.com.tgoulart.services;

import br.com.tgoulart.dao.IClienteDAO;
import br.com.tgoulart.domain.Cliente;
import br.com.tgoulart.exceptions.DAOException;
import br.com.tgoulart.exceptions.MaisDeUmRegistroException;
import br.com.tgoulart.exceptions.TableException;
import br.com.tgoulart.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}
	
	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			e.printStackTrace();
		}
		return null;
	}
}
