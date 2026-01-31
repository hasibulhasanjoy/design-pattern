public class RoleAuthorizationHandler extends Handler {

    @Override
    protected void handle(Request request) {
        if (request.getRole().equalsIgnoreCase("admin")) {
            System.out.println("Role authorized!");
        } else {
            System.out.println("unauthorized role");
            next = null;
        }

        if (next != null) {
            next.handle(request);
        }
    }

}
