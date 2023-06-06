public class Robot extends AbstractRobot implements Attackable, Defensable {

    //private static int hitCount;
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public BodyPart attack() {
        return super.attack();
    }

    public BodyPart defense() {
        return super.defense();
    }
}
