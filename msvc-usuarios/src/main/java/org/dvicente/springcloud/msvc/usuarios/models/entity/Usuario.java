package org.dvicente.springcloud.msvc.usuarios.models.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;
    @NotEmpty
    @Email
    @Column(unique = true)
    private String email;
    @NotEmpty
    private String password;
}
