package inventario.betto.apiinventario.serviceinterfaces;

import inventario.betto.apiinventario.dtos.RolloDisponibleDTO;

import java.util.List;

public interface ImovimientoRolloDService {
    public List<String[]>listar();
    public List<String[]> buscarRolloDisponible(String codigo);
}
