package com.springDataJpa.entity;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Builder
@AttributeOverrides({
        @AttributeOverride(name = "name", column = @Column(name = "guardian_name", nullable = false)),
        @AttributeOverride(name = "email", column = @Column(name = "guardian_email_address", nullable = false)),
        @AttributeOverride(name = "mobileNumber", column = @Column(name = "guardian_mobile_number", nullable = false)),

})
public class Guardian {
    String name;
    String email;
    String mobileNumber;
}
