package pruebas.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pruebas.mongo.entities.Persona;

@Repository
public interface Personarepository extends MongoRepository<Persona, String> {
}
