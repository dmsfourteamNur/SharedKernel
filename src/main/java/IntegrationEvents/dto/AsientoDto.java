package IntegrationEvents.dto;

import java.util.UUID;

public class AsientoDto {
    
    public UUID key;
    public UUID keyAeronave;
    public String numero;
    public String clase;
    private int disponibilidad;

    public UUID getKey() {
      return key;
    }

    public UUID getKeyAeronave() {
      return keyAeronave;
    }

    public String getClase() {
      return clase;
    }

    public String getNumero() {
      return numero;
    }

    public void setClase(String clase) {
      this.clase = clase;
    }

    public void setKey(UUID key) {
      this.key = key;
    }

    public void setKeyAeronave(UUID keyAeronave) {
      this.keyAeronave = keyAeronave;
    }

    public void setNumero(String numero) {
      this.numero = numero;
    }


    public int getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

}
