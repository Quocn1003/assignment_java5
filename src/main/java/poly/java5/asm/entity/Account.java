package poly.java5.asm.entity;

import org.hibernate.validator.constraints.UniqueElements;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name = "accounts")
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @UniqueElements
    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String fullname;

    @UniqueElements
    private String email;

    @Builder.Default
    private boolean activated = true;

    @NotNull
    private boolean admin;
}
