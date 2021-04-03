package l2.patternObserver;

public class Board implements Observer{
    private Notifier notifier;
    private double real;
    private double imaginary;

    public Board(Notifier notifier){
        this.notifier = notifier;
        notifier.addObserver(this);
    }

    @Override
    public void update(double real, double imaginary) {
        this.imaginary = imaginary;
        this.real = real;
        show();
    }

    public void show(){
        System.out.println("Real = " + real + ", Imaginary = " + imaginary);
    }
}
