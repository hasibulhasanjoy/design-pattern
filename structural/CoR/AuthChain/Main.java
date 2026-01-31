public class Main {
    private static Handler getHandlerChain() {
        Handler userHandler = new UserExistHandler();
        Handler passHandler = new PasswordValidationHandler();
        Handler roleHandler = new RoleAuthorizationHandler();
        Handler successHandler = new SuccessHandler();

        userHandler.setNext(passHandler);
        passHandler.setNext(roleHandler);
        roleHandler.setNext(successHandler);

        return userHandler;
    }

    public static void main(String[] args) {
        Handler handlerChain = getHandlerChain();

        Request request = new Request("hasib", "123", "admin");

        handlerChain.handle(request);

    }
}
