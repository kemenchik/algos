package patterns.structural.adapter;

public class MusicAdapter implements Post {

    private Music track;

    public MusicAdapter(Music track) {
        this.track = track;
    }

    @Override
    public void load() {
        System.out.print("New track already on the wall: ");
        this.track.musicPlay();
    }

}
