package org.example.basicstrong.oop.DesignPatterns.observer;


public interface SubjectLibrary {

    public void subscribeObserver(Observer ob);


    public void unsubscribeObserver(Observer ob);


    public void notifyObserver();


}
