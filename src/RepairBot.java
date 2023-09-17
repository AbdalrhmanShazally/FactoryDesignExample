public class RepairBot extends AbstractRobbot{
    public RepairBot() {
        setTool("Scrow tool");
        setPowerLevel(40);
    }

    @Override
    public void recharge() {
        System.out.println("Beep beep beep,  Repair bot now charging");
        System.out.println("power level " + getPowerLevel());
    }

    @Override
    public void doWork() {
        System.out.println("Repair bot uses its "+ getTool());
    }
}
