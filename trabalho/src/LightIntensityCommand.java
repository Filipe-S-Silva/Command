
// COMMAND CONCRETOS
public class LightIntensityCommand implements SmartHouseCommand {
    private SmartHouseLight light;

    public LightIntensityCommand(SmartHouseLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        int intensity = light.increaseIntensity();
        System.out.println("Intensidade de " + light.getName() + " é " + intensity);
    }

    @Override
    public void undo() {
        int intensity = light.decreaseIntensity();
        System.out.println("Intensidade de " + light.getName() + " é " + intensity);
    }
}


