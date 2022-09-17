package core;

import Fourteam.mediator.Notification;

public class ConfirmedDomainEvent<T> extends DomainEvent implements Notification {

  public T DomainEvent;

  public ConfirmedDomainEvent(T domainEvent) {
    this.DomainEvent = domainEvent;
  }
}
