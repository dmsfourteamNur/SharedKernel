package IntegrationEvents;

import java.util.UUID;

import core.IntegrationEvent;

public class VentaCreado extends IntegrationEvent {

  private UUID keyVuelo;
  private String dni;
  private String nombre;
  private String apellido;

  public VentaCreado() {
  }

  public VentaCreado(UUID keyVuelo, String dni, String nombre, String apellido) {
    this.keyVuelo = keyVuelo;
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public UUID getKeyVuelo() {
    return this.keyVuelo;
  }

  public void setKeyVuelo(UUID keyVuelo) {
    this.keyVuelo = keyVuelo;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getDni() {
    return dni;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return this.apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
}
