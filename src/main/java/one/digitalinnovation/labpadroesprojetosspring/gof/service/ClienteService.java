package one.digitalinnovation.labpadroesprojetosspring.gof.service;

import one.digitalinnovation.labpadroesprojetosspring.gof.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
