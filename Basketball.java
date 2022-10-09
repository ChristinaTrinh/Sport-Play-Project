//Each new create instance represents a Basketball player
public class Basketball extends Player {
    public Basketball(String name, int number, int salary) {
        super(name, number, salary);
    }

    public String movement() {
        return "vertical jump height";
    }
}
