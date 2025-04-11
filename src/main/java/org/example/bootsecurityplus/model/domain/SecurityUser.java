package org.example.bootsecurityplus.model.domain;

import java.time.LocalDateTime;

public record SecurityUser(
        Long userId,    // null
        String username,
        String password,
        String role,
        LocalDateTime createAt  //null
) {
    public static SecurityUser toDB(String username, String paddword, String role) {
        return new SecurityUser(null, username, paddword, role, null);
    }
}
