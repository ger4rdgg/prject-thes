package pelu.thes.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class EmailRequest {

    @Id
    private String id;

    @Email
    @NotBlank
    private String sender;

    private String body;

    @NotBlank
    private String subject;

}
