public class FireFighterBot extends AbstractRobbot {

    public FireFighterBot() {
        setTool("fire hose");
        setPowerLevel(20);
    }

    @Override
    public void recharge() {
        System.out.println("Beep beep beep,  firefighter bot now charging");
        System.out.println("power level " + getPowerLevel());

    }

    @Override
    public void doWork() {
        System.out.println("Firefighter bot uses its "+ getTool());

    }
}
