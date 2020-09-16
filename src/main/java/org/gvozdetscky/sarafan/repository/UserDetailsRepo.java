package org.gvozdetscky.sarafan.repository;

import org.gvozdetscky.sarafan.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Egor Gvozdetscky
 */
public interface UserDetailsRepo extends JpaRepository<User, String> {
}
