public class SuccessHandler extends Handler {

    @Override
    protected void handle(Request request) {
        System.out.println("All validation passed");
    }

}
