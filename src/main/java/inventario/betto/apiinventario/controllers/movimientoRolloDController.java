package inventario.betto.apiinventario.controllers;

import inventario.betto.apiinventario.dtos.RolloDisponibleDTO;
import inventario.betto.apiinventario.serviceinterfaces.ImovimientoRolloDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rollos")
@CrossOrigin(origins = {"http://localhost:80", "https://localhost:443"})

public class movimientoRolloDController {
    @Autowired
    private ImovimientoRolloDService mrS;

    @GetMapping("/listar")
    public List<RolloDisponibleDTO> listar(){
        List<String[]> lista=mrS.listar();
        List<RolloDisponibleDTO> listaDTO=new ArrayList<>();

        for(String[] columna:lista){
            RolloDisponibleDTO dto=new RolloDisponibleDTO();
            dto.setCodigo_articulo(columna[0]);
            dto.setNombre_articulo(columna[1]);
            dto.setCodigo_ingreso(columna[2]);
            dto.setCodigo_color(columna[3]);
            dto.setNombre_color(columna[4]);
            dto.setFecha_ingreso(columna[5]);
            dto.setAnexo(columna[6]);
            dto.setCantidad(Double.parseDouble(columna[7]));
            dto.setSaldo(Double.parseDouble(columna[8]));
            dto.setCalidad(columna[9]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }
    @GetMapping("/rolloDisponible")
    public List<RolloDisponibleDTO> buscarRolloDisponible(@RequestParam String codigo){
        List<String[]> lista=mrS.buscarRolloDisponible(codigo);
        List<RolloDisponibleDTO> listaDTO=new ArrayList<>();

        for(String[] columna:lista){
            RolloDisponibleDTO dto=new RolloDisponibleDTO();
            dto.setCodigo_articulo(columna[0]);
            dto.setNombre_articulo(columna[1]);
            dto.setCodigo_ingreso(columna[2]);
            dto.setCodigo_color(columna[3]);
            dto.setNombre_color(columna[4]);
            dto.setFecha_ingreso(columna[5]);
            dto.setAnexo(columna[6]);
            dto.setCantidad(Double.parseDouble(columna[7]));
            dto.setSaldo(Double.parseDouble(columna[8]));
            dto.setCalidad(columna[9]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }

}
