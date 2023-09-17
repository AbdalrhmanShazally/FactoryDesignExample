public class JanitorBot extends AbstractRobbot{

    public JanitorBot() {
        setTool("Cleaning machine");
        setPowerLevel(10);
    }

    @Override
    public void recharge() {
        System.out.println("Beep beep beep,  Janitor bot now charging");
        System.out.println("power level " + getPowerLevel());

    }

    @Override
    public void doWork() {
        System.out.println("Janitor bot uses its "+ getTool());
    }
}
