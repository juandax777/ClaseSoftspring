package co.ucentral.Gestionardor.servicios;

import co.ucentral.Gestionardor.perssistencia.entidades.Vehiculo;
import co.ucentral.Gestionardor.perssistencia.repositorio.VehiculoRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;



@AllArgsConstructor
@Service
public class VehiculoServicio {

    VehiculoRepositorio vehiculoRepositorio;

    public List<Vehiculo> obtenerVehiculos(){
        List<Vehiculo> listado = (List<Vehiculo>) vehiculoRepositorio.findAll();
        return listado;
    }

    public boolean borrar(Vehiculo vehiculo){
        try {
            vehiculoRepositorio.delete(vehiculo);
        }catch (Exception e){
            return false;
        }
        return true;
    }

}
