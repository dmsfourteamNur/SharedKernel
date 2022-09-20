package IntegrationEvents.dto;

import java.util.UUID;

public class TripulanteDto {

  public UUID key;
  public UUID keyTripulacion;
  public String nombre;
  public String apellido;
  public String tipo;
  public String estado;
  private String emailAddress;
  private String cargo;

  public TripulanteDto() {
  }

  public TripulanteDto(UUID key, UUID keyTripulacion, String nombre, String apellido, String tipo, String estado,
      String emailAddress, String cargo) {
    this.key = key;
    this.keyTripulacion = keyTripulacion;
    this.nombre = nombre;
    this.apellido = apellido;
    this.tipo = tipo;
    this.estado = estado;
    this.emailAddress = emailAddress;
    this.cargo = cargo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public UUID getKey() {
    return this.key;
  }

  public void setKey(UUID key) {
    this.key = key;
  }

  public UUID getKeyTripulacion() {
    return this.keyTripulacion;
  }

  public void setKeyTripulacion(UUID keyTripulacion) {
    this.keyTripulacion = keyTripulacion;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getEstado() {
    return this.estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getCargo() {
    return this.cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

}
