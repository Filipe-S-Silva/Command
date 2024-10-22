import java.util.HashMap;
import java.util.Map;

//INVOKER
public class SmartHouseApp {
    private Map<String, SmartHouseCommand> commands = new HashMap<>();

    public void addCommand(String key, SmartHouseCommand command) {
        commands.put(key, command);
    }

    public void executeCommand(String key) {
        SmartHouseCommand command = commands.get(key);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Comando não encontrado para a chave: " + key);
        }
    }

    public void undoCommand(String key) {
        SmartHouseCommand command = commands.get(key);
        if (command != null) {
            command.undo();
        } else {
            System.out.println("Comando não encontrado para a chave: " + key);
        }
    }
}
