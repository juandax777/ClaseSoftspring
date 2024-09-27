package co.ucentral.Gestionardor.perssistencia.repositorio;

import co.ucentral.Gestionardor.perssistencia.entidades.Vehiculo;
import org.springframework.data.repository.CrudRepository;

public interface PropietarioRepositorio extends CrudRepository<Vehiculo, String > {
}
