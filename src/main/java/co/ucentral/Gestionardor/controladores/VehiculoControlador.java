package co.ucentral.Gestionardor.controladores;

import co.ucentral.Gestionardor.perssistencia.entidades.Vehiculo;
import co.ucentral.Gestionardor.servicios.VehiculoServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor
@Controller

public class VehiculoControlador {

    VehiculoServicio vehiculoServicio;

    public List<Vehiculo> obtenerTodos(){
        return vehiculoServicio.obtenerVehiculos();
    }

}
