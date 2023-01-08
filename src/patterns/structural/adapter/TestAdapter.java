package patterns.structural.adapter;

public class TestAdapter {

    public static void main(String[] args) {

        Post photoPost= new Photo();
        Post photoPost2= new Photo();
        MusicAdapter musicAdapter = new MusicAdapter(new Music());

        GroupEditor john = new GroupEditor(new Post[]{photoPost,photoPost2,musicAdapter});
        john.makeNewPosts();
    }
}
