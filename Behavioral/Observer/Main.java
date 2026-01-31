public class Main {
    public static void main(String[] args) {
        Profile profile = new Profile();
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");

        profile.follow(user1);
        profile.follow(user2);
        profile.follow(user3);

        profile.uploadPost("post1");

        profile.unfollow(user3);

        profile.uploadPost("post2");
    }
}
