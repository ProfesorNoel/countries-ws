package nett.formacion.aaa.module4.characters.persist;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import nett.formacion.aaa.module4.characters.PlayerCharacter;

@RepositoryRestResource(collectionResourceRel = "characters", path = "characters")
public interface CharacterRepository extends MongoRepository<PlayerCharacter, String> {

	List<PlayerCharacter> findByName(@Param("name") String name);
}



