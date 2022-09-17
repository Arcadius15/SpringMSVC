package org.dvicente.springcloud.msvc.cursos.models.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "cursos_usuarios")
@Getter
@Setter
@RequiredArgsConstructor
public class CursoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario_id", unique = true)
    private Long usuarioId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CursoUsuario)){
            return false;
        }
        CursoUsuario obj = (CursoUsuario) o;
        return this.usuarioId != null && this.usuarioId.equals(obj.usuarioId);
    }
}
