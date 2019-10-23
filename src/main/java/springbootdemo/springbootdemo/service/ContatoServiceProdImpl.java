package springbootdemo.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootdemo.springbootdemo.model.Contato;
import springbootdemo.springbootdemo.repository.ContatoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoServiceProdImpl implements ContatoService {


    @Autowired
    private ContatoRepository contatoRepository;

    @Override
    public Contato save(Contato contato) {
        return contatoRepository.save(contato);
    }

    @Override
    public List<Contato> getAllContatos() {
        return contatoRepository.findAll();
    }

    @Override
    public Optional<Contato> getById(Long id) {
        return contatoRepository.findById(id);
    }
}
