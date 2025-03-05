public class q7 {
    public static void main(String[] args) {
        Glockenspiel glockenspiel = new Glockenspiel();
        glockenspiel.play();
        glockenspiel.tune();

        Violin violin = new Violin();
        violin.play();
        violin.tune();
    }
}

abstract class Instrument {
    abstract void play();
    abstract void tune();
}

class Glockenspiel extends Instrument {
    void play() {
        System.out.println("Playing Glockenspiel");
    }

    void tune() {
        System.out.println("Tuning Glockenspiel");
    }
}

class Violin extends Instrument {
    void play() {
        System.out.println("Playing Violin");
    }

    void tune() {
        System.out.println("Tuning Violin");
    }
}