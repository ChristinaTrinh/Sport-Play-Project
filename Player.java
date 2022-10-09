//Each new create instance represents a Player
public abstract class Player {
    private String name;
    private int number;
    private double salary;

    public Player(String name, int number, double salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }

    public double getSalary() {
        return this.salary;
    }
}
