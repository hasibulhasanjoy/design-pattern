public class UserExistHandler extends Handler {

    @Override
    protected void handle(Request request) {
        if (!request.getUsername().isEmpty()) {
            System.out.println("Found user: " + request.getUsername());
        } else {
            System.out.println("user not found");
            next = null;
        }

        if (next != null) {
            next.handle(request);
        }
    }

}
