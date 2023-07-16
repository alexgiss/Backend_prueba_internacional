package in.bushansirgur.springboot.crudapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "movimiento")
public class Motion {
    @Column
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_tipo_movimiento;
    @Column
    private String descripcion;
    @Column
    private String valor;

    public Integer getId_tipo_movimiento() {
        return id_tipo_movimiento;
    }

    public void setId_tipo_movimiento(Integer id_tipo_movimiento) {
        this.id_tipo_movimiento = id_tipo_movimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Motion{" +
                "id_tipo_movimiento=" + id_tipo_movimiento +
                ", descripcion='" + descripcion + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
