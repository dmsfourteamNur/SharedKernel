package IntegrationEvents.dto;

import java.util.UUID;

public class AsientoDto {
    
    public UUID key;
    public UUID keyAeronave;
    public int numero;
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

    public int getNumero() {
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

    public void setNumero(int numero) {
      this.numero = numero;
    }
}
