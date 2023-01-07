package patterns.structural.adapter;

public class GroupEditor {
    private Post[] posts;

    public GroupEditor(Post[] posts) {
        this.posts = posts;
    }

    void makeNewPosts(){
        for (Post post:posts) {
            post.load();
        }
    }


}
