package D.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import D.demo.model.Passeio;

public interface PasseioRepository extends JpaRepository<Passeio, UUID>{
 
}
