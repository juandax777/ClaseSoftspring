package co.ucentral.Gestionardor.perssistencia.entidades;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name  ="propietario")
@Entity


public class Propietario {
    @Id
    @Column(name = "pro_cedula")
    public String cedula;

    @Column(name = "pro_nombre")
    public String nombre;

}
