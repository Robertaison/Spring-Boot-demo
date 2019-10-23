package springbootdemo.springbootdemo.service;

import springbootdemo.springbootdemo.model.Contato;

import java.util.List;
import java.util.Optional;


public interface ContatoService {
    Contato save(Contato contato);
    List <Contato> getAllContatos();
    Optional<Contato> getById(Long id);
}
