abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    protected abstract void handle(Request request);

}
