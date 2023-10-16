package de.neuefische.cgnjava233springdata.service;

import de.neuefische.cgnjava233springdata.model.Character;
import de.neuefische.cgnjava233springdata.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CharacterService {

	private final CharacterRepository characterRepository;

	public List<Character> getAllCharacters() {
		return characterRepository.findAll();
	}

	public List<Character> saveCharacters(List<Character> characters){
		return characterRepository.saveAll(characters);
	}

}
