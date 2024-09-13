package inventario.betto.apiinventario.serviceimplements;

import inventario.betto.apiinventario.dtos.RolloDisponibleDTO;
import inventario.betto.apiinventario.repositories.ImovimientoRolloDRepository;
import inventario.betto.apiinventario.serviceinterfaces.ImovimientoRolloDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class movimientoRolloDServiceImplement implements ImovimientoRolloDService {
    @Autowired
    private ImovimientoRolloDRepository mrR;

    @Override
    public List<String[]> listar() {
        return mrR.listar();
    }

    @Override
    public List<String[]> buscarRolloDisponible(String codigo) {
        return mrR.buscarRolloDisponible(codigo);
    }
}
