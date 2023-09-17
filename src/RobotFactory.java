public class RobotFactory {
    public AbstractRobbot buildRobot(String robotType){
        AbstractRobbot bot = null;

        switch (robotType){
            case "f":
                return new FireFighterBot();
            case "r":
                return new RepairBot();
            case "j":
                return new JanitorBot();
            default: return bot;
        }
    }
}
