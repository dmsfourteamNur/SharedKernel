package IntegrationEvents;

import core.IntegrationEvent;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import IntegrationEvents.dto.AsientoDto;
import IntegrationEvents.dto.TripulanteDto;

public class VueloCreado extends IntegrationEvent {

  public UUID key;
  public String nroVuelo;
  public UUID keyAeronave;
  public UUID keyAeropuertoOrigen;
  public UUID keyAeropuertoDestino;
  public Date fechaSalida;
  public Date fechaArribe;
  public UUID keyTripulacion;
  public List<AsientoDto> listaAsientos;

  public VueloCreado() {
  }

  public VueloCreado(UUID Key, String nroVuelo, UUID keyAeronave, UUID keyAeropuertoOrigen, UUID keyAeropuertoDestino,
      Date fechaSalida, Date fechaArribe,
      List<AsientoDto> listaAsientos) {
    this.nroVuelo = nroVuelo;
    this.keyAeronave = keyAeronave;
    this.keyAeropuertoOrigen = keyAeropuertoOrigen;
    this.keyAeropuertoDestino = keyAeropuertoDestino;
    this.fechaSalida = fechaSalida;
    this.fechaArribe = fechaArribe;
    this.listaAsientos = listaAsientos;
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

  public UUID getKeyAeropuertoOrigen() {
    return this.keyAeropuertoOrigen;
  }

  public void setKeyAeropuertoOrigen(UUID keyAeropuertoOrigen) {
    this.keyAeropuertoOrigen = keyAeropuertoOrigen;
  }

  public UUID getKeyAeropuertoDestino() {
    return this.keyAeropuertoDestino;
  }

  public void setKeyAeropuertoDestino(UUID keyAeropuertoDestino) {
    this.keyAeropuertoDestino = keyAeropuertoDestino;
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

}
