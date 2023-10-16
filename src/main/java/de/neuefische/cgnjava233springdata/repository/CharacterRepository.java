package de.neuefische.cgnjava233springdata.repository;

import de.neuefische.cgnjava233springdata.model.Character;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends MongoRepository<Character, String> {
}
