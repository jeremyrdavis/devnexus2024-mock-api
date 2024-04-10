package io.arrogantprogrammer;

import java.util.Optional;

public record CharacterAssignment(Long id, String name, String characterName, String whoIs, String poem, String updatedPoem, Boolean isLiked){

    public CharacterAssignment(Long id, String name, String characterName) {
        this(id, name, characterName, null, null, null, null);
    }
    public CharacterAssignment(Long id, String name, String characterName, String whoIs){
        this(id, name, characterName, whoIs, null, null, null);
    }

    public CharacterAssignment(Long id, String name, String characterName, String whoIs, String poem) {
        this(id, name, characterName, whoIs, poem, null, null);
    }

    public CharacterAssignment(Long id, String name, String characterName, String whoIs, String poem, String updatedPoem) {
        this(id, name, characterName, whoIs, poem, updatedPoem, null);
    }

}
