public class Main {
    public static void main(String[] args) {

        // Receiver
        SmartHouseLight bedroomLight = new SmartHouseLight("Luz Quarto");
        SmartHouseLight bathroomLight = new SmartHouseLight("Luz Banheiro");

        // Command
        SmartHouseCommand bedroomLightPowerCommand = new LightPowerCommand(bedroomLight);
        SmartHouseCommand bathroomLightPowerCommand = new LightPowerCommand(bathroomLight);
        SmartHouseCommand bedroomIntensityCommand = new LightIntensityCommand(bedroomLight);

        // Invoker
        SmartHouseApp smartHouseApp = new SmartHouseApp();
        smartHouseApp.addCommand("btn-1", bedroomLightPowerCommand);
        smartHouseApp.addCommand("btn-2", bathroomLightPowerCommand);
        smartHouseApp.addCommand("btn-3", bedroomIntensityCommand);

        smartHouseApp.executeCommand("btn-1");
        smartHouseApp.undoCommand("btn-1");

        smartHouseApp.executeCommand("btn-2");
        smartHouseApp.undoCommand("btn-2");

        for (int i = 0; i < 5; i++) {
            smartHouseApp.executeCommand("btn-3");
        }

        for (int i = 0; i < 3; i++) {
            smartHouseApp.undoCommand("btn-3");
        }
    }
}
