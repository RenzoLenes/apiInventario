package inventario.betto.apiinventario.repositories;

import inventario.betto.apiinventario.dtos.RolloDisponibleDTO;
import inventario.betto.apiinventario.entities.rollodID;
import inventario.betto.apiinventario.entities.tb_movimiento_rollod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImovimientoRolloDRepository extends JpaRepository<tb_movimiento_rollod, rollodID> {
    @Query(value ="SELECT TOP 10 tb_movimiento_rollod.pro_codart as codigo,tb_movimiento_rollod.pro_nomart as nombre,\n" +
            "\ttb_movimiento_rollod.pro_codrol as codigo_ingreso,\n" +
            "\ttb_colores.pro_codcol as codigo_color,tb_colores.pro_nomcol as nombre_color,\n" +
            "\ttb_movimiento_rolloc.pro_fecmov as fecha_ingreso,vis_Anexo.nombre as anexo,\n" +
            "\ttb_movimiento_rollod.pro_canart as cantidad,\n" +
            "\ttb_movimiento_rollod.pro_canart - ISNULL(tb_movimiento_rollod.pro_cancom,0) as saldo,\n" +
            "\ttb_calidad.pro_nomcal AS calidad\n" +
            "FROM tb_movimiento_rolloc INNER JOIN tb_movimiento_rollod ON\n" +
            "\ttb_movimiento_rolloc.pro_codtic = tb_movimiento_rollod.pro_codtic AND\n" +
            "\ttb_movimiento_rolloc.pro_codtid = tb_movimiento_rollod.pro_codtid AND\n" +
            "\ttb_movimiento_rolloc.pro_numser = tb_movimiento_rollod.pro_numser AND\n" +
            "\ttb_movimiento_rolloc.pro_numdoc = tb_movimiento_rollod.pro_numdoc\n" +
            "\tINNER JOIN vis_Anexo ON\n" +
            "\ttb_movimiento_rolloc.pro_codtia\t=\tvis_Anexo.tipo AND\n" +
            "\ttb_movimiento_rolloc.pro_codane\t=\tvis_Anexo.codigo\n" +
            "\tINNER JOIN tb_articulo ON\n" +
            "\ttb_movimiento_rollod.pro_codtic\t=\ttb_articulo.pro_codtic AND\n" +
            "\ttb_movimiento_rollod.pro_codart\t=\ttb_articulo.pro_codart\n" +
            "\tINNER JOIN tb_colores ON\n" +
            "\ttb_movimiento_rollod.pro_codtic\t=\ttb_colores.pro_codtic AND\n" +
            "\ttb_movimiento_rollod.pro_codcol\t=\ttb_colores.pro_codcol\n" +
            "\tINNER JOIN tb_calidad ON\n" +
            "\ttb_articulo.pro_codtic\t=\ttb_calidad.pro_codtic AND\n" +
            "\ttb_articulo.pro_codcal\t=\ttb_calidad.pro_codcal\n" +
            "\tINNER JOIN tb_diseno ON\n" +
            "\ttb_articulo.pro_codtic\t=\ttb_diseno.pro_codtic AND\n" +
            "\ttb_articulo.pro_coddis\t=\ttb_diseno.pro_coddis\n" +
            "WHERE tb_movimiento_rolloc.pro_codtic = '001' AND\n" +
            "\ttb_movimiento_rolloc.pro_codtid = 'NE' AND tb_movimiento_rolloc.pro_estmov <> 'ANULADO' AND \n" +
            "\ttb_movimiento_rollod.pro_canart > tb_movimiento_rollod.pro_cancom \n" +
            "ORDER BY (tb_calidad.pro_nomcal) ,\n" +
            "\ttb_movimiento_rollod.pro_codCol,tb_colores.pro_nomcol" ,nativeQuery = true)
    public List<String[]> listar();

    @Query(value ="SELECT tb_movimiento_rollod.pro_codart as codigo,tb_movimiento_rollod.pro_nomart as nombre,\n" +
            "\ttb_movimiento_rollod.pro_codrol as codigo_ingreso,\n" +
            "\ttb_colores.pro_codcol as codigo_color,tb_colores.pro_nomcol as nombre_color,\n" +
            "\ttb_movimiento_rolloc.pro_fecmov as fecha_ingreso,vis_Anexo.nombre as anexo,\n" +
            "\ttb_movimiento_rollod.pro_canart as cantidad,\n" +
            "\ttb_movimiento_rollod.pro_canart - ISNULL(tb_movimiento_rollod.pro_cancom,0) as saldo,\n" +
            "\ttb_calidad.pro_nomcal AS calidad\n" +
            "FROM tb_movimiento_rolloc INNER JOIN tb_movimiento_rollod ON\n" +
            "\ttb_movimiento_rolloc.pro_codtic = tb_movimiento_rollod.pro_codtic AND\n" +
            "\ttb_movimiento_rolloc.pro_codtid = tb_movimiento_rollod.pro_codtid AND\n" +
            "\ttb_movimiento_rolloc.pro_numser = tb_movimiento_rollod.pro_numser AND\n" +
            "\ttb_movimiento_rolloc.pro_numdoc = tb_movimiento_rollod.pro_numdoc\n" +
            "\tINNER JOIN vis_Anexo ON\n" +
            "\ttb_movimiento_rolloc.pro_codtia\t=\tvis_Anexo.tipo AND\n" +
            "\ttb_movimiento_rolloc.pro_codane\t=\tvis_Anexo.codigo\n" +
            "\tINNER JOIN tb_articulo ON\n" +
            "\ttb_movimiento_rollod.pro_codtic\t=\ttb_articulo.pro_codtic AND\n" +
            "\ttb_movimiento_rollod.pro_codart\t=\ttb_articulo.pro_codart\n" +
            "\tINNER JOIN tb_colores ON\n" +
            "\ttb_movimiento_rollod.pro_codtic\t=\ttb_colores.pro_codtic AND\n" +
            "\ttb_movimiento_rollod.pro_codcol\t=\ttb_colores.pro_codcol\n" +
            "\tINNER JOIN tb_calidad ON\n" +
            "\ttb_articulo.pro_codtic\t=\ttb_calidad.pro_codtic AND\n" +
            "\ttb_articulo.pro_codcal\t=\ttb_calidad.pro_codcal\n" +
            "\tINNER JOIN tb_diseno ON\n" +
            "\ttb_articulo.pro_codtic\t=\ttb_diseno.pro_codtic AND\n" +
            "\ttb_articulo.pro_coddis\t=\ttb_diseno.pro_coddis\n" +
            "WHERE tb_movimiento_rolloc.pro_codtic = '001' AND\n" +
            "\ttb_movimiento_rolloc.pro_codtid = 'NE' AND tb_movimiento_rolloc.pro_estmov <> 'ANULADO' AND \n" +
            "\ttb_movimiento_rollod.pro_canart > tb_movimiento_rollod.pro_cancom AND tb_movimiento_rollod.pro_codrol=:codigo\n" +
            "ORDER BY (tb_calidad.pro_nomcal) ,\n" +
            "\ttb_movimiento_rollod.pro_codCol,tb_colores.pro_nomcol" ,nativeQuery = true)
    public List<String[]> buscarRolloDisponible(@Param("codigo") String codigo);
}
