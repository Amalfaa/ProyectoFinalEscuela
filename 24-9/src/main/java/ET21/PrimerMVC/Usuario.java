package ET21.PrimerMVC;

import javax.persistence.*;

@Entity
public class Usuario {
  @Id
  @GeneratedValue
  private Integer id;

  private String nombre;

  private Integer dni;

  private String apellido;

  private String rol;

  private String password;
  
  private String username;

  //nombre
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  //dni
  public Integer getDni() {
    return dni;
  }

  public void setDni(Integer dni) {
    this.dni = dni;
  }
  //apellido
  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
  //rol
  public String getRol() {
    return rol;
  }

  public void setRol(String rol) {
    this.rol = rol;
  }
  //id
  public Integer getId() {
    return id;
  } 

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}