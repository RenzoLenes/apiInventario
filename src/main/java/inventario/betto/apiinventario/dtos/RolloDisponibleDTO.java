package inventario.betto.apiinventario.dtos;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;

public class RolloDisponibleDTO {
    private String codigo_articulo;
    private String nombre_articulo;
    private String codigo_ingreso;
    private String codigo_color;
    private String nombre_color;
    private String fecha_ingreso;
    private String anexo;
    private Double cantidad;
    private Double saldo;
    private String calidad;

    public String getCodigo_articulo() {
        return codigo_articulo;
    }

    public void setCodigo_articulo(String codigo_articulo) {
        this.codigo_articulo = codigo_articulo;
    }

    public String getNombre_articulo() {
        return nombre_articulo;
    }

    public void setNombre_articulo(String nombre_articulo) {
        this.nombre_articulo = nombre_articulo;
    }

    public String getCodigo_ingreso() {
        return codigo_ingreso;
    }

    public void setCodigo_ingreso(String codigo_ingreso) {
        this.codigo_ingreso = codigo_ingreso;
    }

    public String getCodigo_color() {
        return codigo_color;
    }

    public void setCodigo_color(String codigo_color) {
        this.codigo_color = codigo_color;
    }

    public String getNombre_color() {
        return nombre_color;
    }

    public void setNombre_color(String nombre_color) {
        this.nombre_color = nombre_color;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }
}
