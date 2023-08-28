package com.marketitems.domain.user;


import com.marketitems.dtos.UserDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity()
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique = true)
    private String email;

    private String password;


    public User(UserDTO data){
        this.firstName = data.firstname();
        this.lastName = data.lastname();
        this.email = data.email();
        this.password = data.password();

    }
}
