package IntegrationEvents;

import java.util.List;
import java.util.UUID;

import IntegrationEvents.dto.TripulanteDto;
import core.IntegrationEvent;

public class TripulacionChange extends IntegrationEvent {

  public UUID keyTripulacion;
  public String descripcion;
  public String estado;

  public List<TripulanteDto> tripulantes;

  public TripulacionChange() {
  }

  public TripulacionChange(UUID keyTripulacion, String descripcion, String estado, List<TripulanteDto> tripulantes) {
    this.keyTripulacion = keyTripulacion;
    this.descripcion = descripcion;
    this.estado = estado;
    this.tripulantes = tripulantes;
  }

  public UUID getKeyTripulacion() {
    return this.keyTripulacion;
  }

  public void setKeyTripulacion(UUID keyTripulacion) {
    this.keyTripulacion = keyTripulacion;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public List<TripulanteDto> getTripulantes() {
    return this.tripulantes;
  }

  public void setTripulantes(List<TripulanteDto> tripulantes) {
    this.tripulantes = tripulantes;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }
}