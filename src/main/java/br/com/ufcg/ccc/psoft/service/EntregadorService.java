package br.com.ufcg.ccc.psoft.service;

import br.com.ufcg.ccc.psoft.dto.EntregadorDTO;
import br.com.ufcg.ccc.psoft.exception.EntregadorAlreadyCreatedException;
import br.com.ufcg.ccc.psoft.exception.EntregadorNotFoundException;

import java.util.List;

public interface EntregadorService {

    public EntregadorDTO criaEntregador(EntregadorDTO entregadorDTO) throws EntregadorAlreadyCreatedException;

    public List<EntregadorDTO> listarEntregadores();

    public void removerEntregadorCadastrado(Long id) throws EntregadorNotFoundException;

    public EntregadorDTO getEntregadorById(Long id) throws EntregadorNotFoundException;

    public EntregadorDTO atualizaEntregador(Long id, EntregadorDTO entregadorDTO) throws EntregadorNotFoundException;

}
