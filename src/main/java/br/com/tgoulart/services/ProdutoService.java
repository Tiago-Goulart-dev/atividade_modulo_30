package br.com.tgoulart.services;

import br.com.tgoulart.dao.IProdutoDAO;
import br.com.tgoulart.domain.Produto;
import br.com.tgoulart.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
