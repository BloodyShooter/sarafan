package org.gvozdetscky.sarafan.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author Egor Gvozdetscky
 */
@Entity
@Table(name = "usr")
@Data
public class User {

    @Id
    private String id;
    private String name;
    private String userpic;
    private String email;
    private String gender;
    private String locale;
    private LocalDateTime lastVisit;

}
