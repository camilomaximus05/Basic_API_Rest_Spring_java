package com.riwi.tallerRestapi.services.crud;

import java.util.Optional;
import java.util.UUID;

public interface Update<Entity>{

    public Entity update (UUID id, Entity e);
}
