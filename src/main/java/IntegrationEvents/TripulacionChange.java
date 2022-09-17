package IntegrationEvents;

import core.IntegrationEvent;
import java.util.List;
import java.util.UUID;

import IntegrationEvents.dto.TripulanteDto;


public class TripulacionChange extends IntegrationEvent {

  public UUID keyTripulacion;
  public String descripcion;
  public List<TripulanteDto> tripulantes;


  public TripulacionChange() {
  }

  public TripulacionChange(UUID keyTripulacion, String descripcion, List<TripulanteDto> tripulantes) {
    this.keyTripulacion = keyTripulacion;
    this.descripcion = descripcion;
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


}
