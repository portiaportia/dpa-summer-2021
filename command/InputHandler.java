import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands;

    public InputHandler(StopWatch stopWatch) {
        commands = new HashMap<>();
        commands.put("1", new OneMinCommand(stopWatch));
        commands.put("5", new FiveMinCommand(stopWatch));
        commands.put("30", new ThirtySecCommand(stopWatch));
    }

    public boolean inputEntered(String data) {
        String input = data.trim();

        if (commands.containsKey(input)) {
            commands.get(input).execute();
            return true;
        }

        return false;
    }
}
