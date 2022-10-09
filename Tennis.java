//Each new create instance represents a Tennis player
public class Tennis extends Player {
    public Tennis(String name, int number, double salary) {
        super(name, number, salary);
    }

    public String movement() {
        return "running and beating";
    }
}
