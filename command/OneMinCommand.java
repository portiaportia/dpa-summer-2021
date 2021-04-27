public class OneMinCommand implements Command {
    private StopWatch watch;

    public OneMinCommand(StopWatch watch) {
        this.watch = watch;
    }

    @Override
    public void execute() {
        watch.countDownOneMin();
    }

}
