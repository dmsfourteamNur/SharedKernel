package IntegrationEvents;

import core.IntegrationEvent;
import java.util.List;
import java.util.UUID;

import IntegrationEvents.dto.AsientoDto;


public class AeronaveChange extends IntegrationEvent {

  public UUID keyAeronave;
  public String matricula;
  public String keyModelo;
  public List<AsientoDto> asientos;

  public AeronaveChange(){

  }

  public AeronaveChange(UUID keyAeronave, String matricula, String keyModelo, List<AsientoDto> asientos) {
    this.keyAeronave = keyAeronave;
    this.matricula = matricula;
    this.keyModelo = keyModelo;
    this.asientos = asientos;
  }

  public UUID getKeyAeronave() {
    return keyAeronave;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setKeyAeronave(UUID keyAeronave) {
    this.keyAeronave = keyAeronave;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public List<AsientoDto> getAsientos() {
    return this.asientos;
  }

  public void setAsientos(List<AsientoDto> asientos) {
    this.asientos = asientos;
  }


}
