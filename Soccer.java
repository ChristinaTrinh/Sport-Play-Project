//Each new create instance represents a Soccer player
public class Soccer extends Player {
    public Soccer(String name, int number, double salary) {
        super(name, number, salary);
    }

    public String movement() {
        return "kicking";
    }
}