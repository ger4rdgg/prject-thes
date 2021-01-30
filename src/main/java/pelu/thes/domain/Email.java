package pelu.thes.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Email {

    @Id
    private String id;

    private String sender;

    private String body;
    private String subject;

}
