package com.parkon.auth_service.domain.model.repository;

import com.parkon.auth_service.domain.model.User;
// 1. Añade este import que faltaba
import java.util.Optional;

// 2. Asegúrate de que este nombre sea EXACTO al del archivo .java
public interface UserGetRepository {
    // 3. Usa Optional para manejar la ausencia de usuario con elegancia
    Optional<User> getUserById(long id);
}