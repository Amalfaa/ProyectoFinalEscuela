package ET21.PrimerMVC;

import javax.persistence.*;

@Entity
public class Inscripcion {
  @Id
  @GeneratedValue
  private Integer id;

  private Integer clase;

  private Integer usuario; 

  private Boolean estado;

    //idClase
   public Integer getClase() {
    return clase;
  } 
   public void setClase(Integer clase) {
    this.clase = clase;
  }
  //Id
  public Integer getUsuario() {
    return usuario;
  } 
   public void setUsuario(Integer usuario) {
    this.usuario = usuario;
  }
     public Boolean getEstado() {
    return estado;
  } 
   public void setEstado(Boolean estado) {
    this.estado = estado;
  }
     public Integer getId() {
    return id;
  } 
}