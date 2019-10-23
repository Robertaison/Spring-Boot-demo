package springbootdemo.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springbootdemo.springbootdemo.model.Contato;
import springbootdemo.springbootdemo.repository.ContatoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Profile("dev")
public class ContatoServiceDevImpl implements ContatoService{

    @Autowired
    private ContatoRepository contatoRepository;

    @Override
    public Contato save(Contato contato) {
        return contatoRepository.save(contato);
    }

    @Override
    public List<Contato> getAllContatos() {
        List<Contato> contatos = contatoRepository.findAll();
        List<Contato> devers = new ArrayList<>();
        for(Contato aux: contatos){
            aux.setName(aux.getName() + " Dev");
        }
        return contatoRepository.findAll();
    }

    @Override
    public Optional<Contato> getById(Long id) {
        return contatoRepository.findById(id);
    }
}
