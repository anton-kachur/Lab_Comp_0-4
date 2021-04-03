package l2.patternObserver;

public interface Notifier {
    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObserver();
}
