package br.com.tgoulart.services;

import br.com.tgoulart.domain.Cliente;
import br.com.tgoulart.exceptions.DAOException;
import br.com.tgoulart.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

}
