import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RobotFactory robotFactory = new RobotFactory();
        AbstractRobbot bot = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome please Enter Roobot Type :" + " \nf " + "for Fire Fighter robot, \nr for repaire bot,  "+"\n" + "j  for janitor robot");
        String botType = in.nextLine();
        bot = robotFactory.buildRobot(botType);
        doStuff(bot);
    }

    public static void doStuff(AbstractRobbot bot) {
        bot.doWork();
        bot.recharge();
    }
}