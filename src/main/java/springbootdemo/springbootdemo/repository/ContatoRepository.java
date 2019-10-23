package springbootdemo.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springbootdemo.springbootdemo.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
