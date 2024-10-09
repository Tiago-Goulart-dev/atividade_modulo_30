package br.com.tgoulart.dao;

import br.com.tgoulart.dao.generic.IGenericDAO;
import br.com.tgoulart.domain.Venda;
import br.com.tgoulart.exceptions.DAOException;
import br.com.tgoulart.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
