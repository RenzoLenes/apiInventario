package inventario.betto.apiinventario.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_movimiento_rollod")
public class tb_movimiento_rollod {

    @EmbeddedId
    private rollodID id;

    @Column(name = "pro_codart")
    private String pro_codart;

    @Column(name = "pro_nomart")
    private String pro_nomart;

    @Column(name = "pro_canart")
    private Double pro_canart;

    @Column(name = "pro_codrol")
    private String pro_codrol;

    @Column(name = "pro_codcol")
    private String pro_codcol;

    @Column(name = "pro_preart")
    private Double pro_preart;

    @Column(name = "pro_gasart")
    private Double pro_gasart;

    @Column(name = "pro_pretot")
    private Double pro_pretot;

    @Column(name = "pro_totart")
    private Double pro_totart;

    @Column(name = "pro_codcof")
    private String pro_codcof;

    @Column(name = "pro_numref")
    private String pro_numref;

    @Column(name = "pro_cancom")
    private Double pro_cancom;

    @Column(name = "pro_ubiart")
    private String pro_ubiart;

    @Column(name = "pro_nrolot")
    private String pro_nrolot;

    @Column(name = "pro_revmts")
    private Double pro_revmts;

    @Column(name = "pro_peart")
    private Double pro_peart;

    public tb_movimiento_rollod() {
    }

    public tb_movimiento_rollod(rollodID id, String pro_codart, String pro_nomart, Double pro_canart, String pro_codrol, String pro_codcol, Double pro_preart, Double pro_gasart, Double pro_pretot, Double pro_totart, String pro_codcof, String pro_numref, Double pro_cancom, String pro_ubiart, String pro_nrolot, Double pro_revmts, Double pro_peart) {
        this.id = id;
        this.pro_codart = pro_codart;
        this.pro_nomart = pro_nomart;
        this.pro_canart = pro_canart;
        this.pro_codrol = pro_codrol;
        this.pro_codcol = pro_codcol;
        this.pro_preart = pro_preart;
        this.pro_gasart = pro_gasart;
        this.pro_pretot = pro_pretot;
        this.pro_totart = pro_totart;
        this.pro_codcof = pro_codcof;
        this.pro_numref = pro_numref;
        this.pro_cancom = pro_cancom;
        this.pro_ubiart = pro_ubiart;
        this.pro_nrolot = pro_nrolot;
        this.pro_revmts = pro_revmts;
        this.pro_peart = pro_peart;
    }

    public rollodID getId() {
        return id;
    }

    public void setId(rollodID id) {
        this.id = id;
    }

    public String getPro_codart() {
        return pro_codart;
    }

    public void setPro_codart(String pro_codart) {
        this.pro_codart = pro_codart;
    }

    public String getPro_nomart() {
        return pro_nomart;
    }

    public void setPro_nomart(String pro_nomart) {
        this.pro_nomart = pro_nomart;
    }

    public Double getPro_canart() {
        return pro_canart;
    }

    public void setPro_canart(Double pro_canart) {
        this.pro_canart = pro_canart;
    }

    public String getPro_codrol() {
        return pro_codrol;
    }

    public void setPro_codrol(String pro_codrol) {
        this.pro_codrol = pro_codrol;
    }

    public String getPro_codcol() {
        return pro_codcol;
    }

    public void setPro_codcol(String pro_codcol) {
        this.pro_codcol = pro_codcol;
    }

    public Double getPro_preart() {
        return pro_preart;
    }

    public void setPro_preart(Double pro_preart) {
        this.pro_preart = pro_preart;
    }

    public Double getPro_gasart() {
        return pro_gasart;
    }

    public void setPro_gasart(Double pro_gasart) {
        this.pro_gasart = pro_gasart;
    }

    public Double getPro_pretot() {
        return pro_pretot;
    }

    public void setPro_pretot(Double pro_pretot) {
        this.pro_pretot = pro_pretot;
    }

    public Double getPro_totart() {
        return pro_totart;
    }

    public void setPro_totart(Double pro_totart) {
        this.pro_totart = pro_totart;
    }

    public String getPro_codcof() {
        return pro_codcof;
    }

    public void setPro_codcof(String pro_codcof) {
        this.pro_codcof = pro_codcof;
    }

    public String getPro_numref() {
        return pro_numref;
    }

    public void setPro_numref(String pro_numref) {
        this.pro_numref = pro_numref;
    }

    public Double getPro_cancom() {
        return pro_cancom;
    }

    public void setPro_cancom(Double pro_cancom) {
        this.pro_cancom = pro_cancom;
    }

    public String getPro_ubiart() {
        return pro_ubiart;
    }

    public void setPro_ubiart(String pro_ubiart) {
        this.pro_ubiart = pro_ubiart;
    }

    public String getPro_nrolot() {
        return pro_nrolot;
    }

    public void setPro_nrolot(String pro_nrolot) {
        this.pro_nrolot = pro_nrolot;
    }

    public Double getPro_revmts() {
        return pro_revmts;
    }

    public void setPro_revmts(Double pro_revmts) {
        this.pro_revmts = pro_revmts;
    }

    public Double getPro_peart() {
        return pro_peart;
    }

    public void setPro_peart(Double pro_peart) {
        this.pro_peart = pro_peart;
    }
}
