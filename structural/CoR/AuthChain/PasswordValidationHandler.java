public class PasswordValidationHandler extends Handler {

    @Override
    protected void handle(Request request) {
        if (!request.getPassword().isEmpty()) {
            System.out.println("password matched!");
        } else {
            System.out.println("password didn't matched");
            next = null;
        }

        if (next != null) {
            next.handle(request);
        }
    }

}
