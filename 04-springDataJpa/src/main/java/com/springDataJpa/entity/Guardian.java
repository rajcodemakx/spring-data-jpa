package com.springDataJpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
@AttributeOverrides({
        @AttributeOverride(name = "name", column = @Column(name = "guardian_name")),
        @AttributeOverride(name = "emailId", column = @Column(name = "guardian_email_address", nullable = false)),
        @AttributeOverride(name = "contact", column = @Column(name = "guardian_mobile_number", nullable = false)),
})
public class Guardian {


    private String name;

    private String emailId;

    private String contact;
}
