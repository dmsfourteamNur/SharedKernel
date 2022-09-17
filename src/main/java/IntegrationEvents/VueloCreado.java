package IntegrationEvents;

import core.IntegrationEvent;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import IntegrationEvents.dto.AsientoDto;
import IntegrationEvents.dto.TripulanteDto;

public class VueloCreado extends IntegrationEvent {

  public String nroVuelo;
  public String keyAeronave;
  public String keyAeropuertoOrigen;
  public String keyAeropuertoDestino;
  public Date fechaSalida;
  public Date fechaArribe;
  public String keyTripulacion;

  public List<TripulanteDto> listaTripulantes;
  public List<AsientoDto> listaAsientos;


  public VueloCreado() {
  }


  public VueloCreado(String nroVuelo, String keyAeronave, String keyAeropuertoOrigen, String keyAeropuertoDestino, Date fechaSalida, Date fechaArribe, String keyTripulacion, List<TripulanteDto> listaTripulantes, List<AsientoDto> listaAsientos) {
    this.nroVuelo = nroVuelo;
    this.keyAeronave = keyAeronave;
    this.keyAeropuertoOrigen = keyAeropuertoOrigen;
    this.keyAeropuertoDestino = keyAeropuertoDestino;
    this.fechaSalida = fechaSalida;
    this.fechaArribe = fechaArribe;
    this.keyTripulacion = keyTripulacion;
    this.listaTripulantes = listaTripulantes;
    this.listaAsientos = listaAsientos;
  }

  public String getNroVuelo() {
    return nroVuelo;
  }

  public void setNroVuelo(String nroVuelo) {
    this.nroVuelo = nroVuelo;
  }

  public String getKeyAeronave() {
    return keyAeronave;
  }

  public void setKeyAeronave(String keyAeronave) {
    this.keyAeronave = keyAeronave;
  }

  public String getKeyAeropuertoOrigen() {
    return keyAeropuertoOrigen;
  }

  public void setKeyAeropuertoOrigen(String keyAeropuertoOrigen) {
    this.keyAeropuertoOrigen = keyAeropuertoOrigen;
  }

  public String getKeyAeropuertoDestino() {
    return keyAeropuertoDestino;
  }

  public void setKeyAeropuertoDestino(String keyAeropuertoDestino) {
    this.keyAeropuertoDestino = keyAeropuertoDestino;
  }

  public Date getFechaSalida() {
    return fechaSalida;
  }

  public void setFechaSalida(Date fechaSalida) {
    this.fechaSalida = fechaSalida;
  }

  public Date getFechaArribe() {
    return fechaArribe;
  }

  public void setFechaArribe(Date fechaArribe) {
    this.fechaArribe = fechaArribe;
  }

  public String getKeyTripulacion() {
    return keyTripulacion;
  }

  public void setKeyTripulacion(String keyTripulacion) {
    this.keyTripulacion = keyTripulacion;
  }

  public List<TripulanteDto> getListaTripulantes() {
    return listaTripulantes;
  }

  public void setListaTripulantes(List<TripulanteDto> listaTripulantes) {
    this.listaTripulantes = listaTripulantes;
  }

  public List<AsientoDto> getListaAsientos() {
    return listaAsientos;
  }

  public void setListaAsientos(List<AsientoDto> listaAsientos) {
    this.listaAsientos = listaAsientos;
  }

}
