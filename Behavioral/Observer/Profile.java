
import java.util.ArrayList;
import java.util.List;

public class Profile {
    private final List<User> followers;
    private final List<String> posts;

    public Profile() {
        followers = new ArrayList<>();
        posts = new ArrayList<>();
    }

    public void follow(User user) {
        followers.add(user);
    }

    public void unfollow(User user) {
        followers.remove(user);
    }

    public void uploadPost(String text) {
        posts.add(text);
        notifyFollowers();
    }

    public void notifyFollowers() {
        for (User user : followers) {
            user.sendNotification();
        }
    }

}