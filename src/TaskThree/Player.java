package TaskThree;

public class Player implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("Start playing");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void record() {
        System.out.println("Start recording");
    }

    public static void main(String[] args) {
        Player walkman = new Player();

        walkman.play();
        walkman.pause();
        walkman.stop();
        walkman.record();
    }
}
