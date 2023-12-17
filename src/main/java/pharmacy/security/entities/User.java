package pharmacy.security.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "user" )
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "id_user", columnDefinition = "int4")
    private Integer id_user;

    @ManyToOne
    @JoinColumn(name = "id_person", nullable = true)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "id_user_type", nullable = true)
    private UserType userType;

    @Column(name = "email", length = 110)
    private String email;

    @JsonIgnore
    @Column(name = "password", length = 150)
    private String password;

    @Column(name = "state", length = 1)
    private String state;

  
    
}
