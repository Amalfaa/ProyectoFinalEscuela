package ET21.PrimerMVC;

import javax.persistence.*;
import java.time.*;

@Entity
public class Clase {
  @Id
  @GeneratedValue
  private Integer id;

  private LocalTime hora;

  private String ubicacion;

  private LocalDate fecha;

  private Boolean estado;
  
  //hora
  public LocalTime getHora() {
    return hora;
  }

  public void setHora(LocalTime hora) {
    this.hora = hora;
  }
  //ubicacion
  public String getUbicacion() {
    return ubicacion;
  }

  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }
  //fecha
  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }
  //idClase
   public Integer getId() {
    return id;
  }

  public Boolean getEstado() {
    return estado;
  }

  public void setEstado(Boolean estado) {
    this.estado = estado;
  }
}