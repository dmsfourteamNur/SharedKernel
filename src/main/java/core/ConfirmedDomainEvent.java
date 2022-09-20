package core;

import Fourteam.mediator.Notification;

public class ConfirmedDomainEvent<T> extends DomainEvent{

  public T DomainEvent;

  public ConfirmedDomainEvent(T domainEvent) {
    this.DomainEvent = (T) domainEvent;
  }
}
