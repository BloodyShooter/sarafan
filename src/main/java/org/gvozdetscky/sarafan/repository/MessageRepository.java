package org.gvozdetscky.sarafan.repository;

import org.gvozdetscky.sarafan.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Egor Gvozdetscky
 */
public interface MessageRepository extends JpaRepository<Message, Long> {
}
