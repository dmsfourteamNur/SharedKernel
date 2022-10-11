package IntegrationEvents;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import IntegrationEvents.dto.AsientoDto;
import core.IntegrationEvent;

public class VueloCreado extends IntegrationEvent {

  public UUID key;
  public String nroVuelo;
  public UUID keyAeronave;
  public String origen;
  public String destino;
  public Date fechaSalida;
  public Date fechaArribe;
  public String observacion;
	public String estado;
  public UUID keyTripulacion;
  public List<AsientoDto> listaAsientos;

  public VueloCreado() {
  }

  public VueloCreado(UUID key, String nroVuelo, UUID keyAeronave, String origen, String destino,
      Date fechaSalida, Date fechaArribe,String observacion, String estado,
      List<AsientoDto> listaAsientos) {
    this.key = key;
    this.nroVuelo = nroVuelo;
    this.keyAeronave = keyAeronave;
    this.origen = origen;
    this.destino = destino;
    this.fechaSalida = fechaSalida;
    this.fechaArribe = fechaArribe;
    this.listaAsientos = listaAsientos;
    this.observacion = observacion;
		this.estado = estado;
  }

  public UUID getKey() {
    return this.key;
  }

  public void setKey(UUID key) {
    this.key = key;
  }

  public String getNroVuelo() {
    return this.nroVuelo;
  }

  public void setNroVuelo(String nroVuelo) {
    this.nroVuelo = nroVuelo;
  }

  public UUID getKeyAeronave() {
    return this.keyAeronave;
  }

  public void setKeyAeronave(UUID keyAeronave) {
    this.keyAeronave = keyAeronave;
  }

  public String getOrigen() {
    return origen;
  }

  public void setOrigen(String origen) {
    this.origen = origen;
  }

  public String getDestino() {
    return destino;
  }

  public void setDestino(String destino) {
    this.destino = destino;
  }

  public Date getFechaSalida() {
    return this.fechaSalida;
  }

  public void setFechaSalida(Date fechaSalida) {
    this.fechaSalida = fechaSalida;
  }

  public Date getFechaArribe() {
    return this.fechaArribe;
  }

  public void setFechaArribe(Date fechaArribe) {
    this.fechaArribe = fechaArribe;
  }

  public UUID getKeyTripulacion() {
    return this.keyTripulacion;
  }

  public void setKeyTripulacion(UUID keyTripulacion) {
    this.keyTripulacion = keyTripulacion;
  }

  public List<AsientoDto> getListaAsientos() {
    return this.listaAsientos;
  }

  public void setListaAsientos(List<AsientoDto> listaAsientos) {
    this.listaAsientos = listaAsientos;
  }
  	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
