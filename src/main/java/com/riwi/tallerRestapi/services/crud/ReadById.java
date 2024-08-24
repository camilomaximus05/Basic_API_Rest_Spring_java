package com.riwi.tallerRestapi.services.crud;

import java.util.Optional;
import java.util.UUID;

public interface ReadById <Entity> {

    public Optional<Entity> readById(UUID id);

}
