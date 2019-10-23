package springbootdemo.springbootdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootdemo.springbootdemo.model.Contato;
import springbootdemo.springbootdemo.service.ContatoService;

import java.util.List;
import java.util.Optional;

@RestController("/contato")
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @GetMapping
    public String hi(){
        return "Hello World";
    }

    @PostMapping("/post")
    public Contato save(Contato contato){
        return contatoService.save(contato);
    }

    @GetMapping("/list")
    public List<Contato> listarContatos(){
        return contatoService.getAllContatos();
    }

    @GetMapping("/{id}")
    public Optional<Contato> getById(@PathVariable Long id){
        return contatoService.getById(id);
    }
}
