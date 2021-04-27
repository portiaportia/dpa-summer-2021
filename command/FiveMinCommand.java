public class FiveMinCommand implements Command {
    private StopWatch watch;

    public FiveMinCommand(StopWatch watch) {
        this.watch = watch;
    }

    @Override
    public void execute() {
        watch.countDownFiveMin();
    }

}