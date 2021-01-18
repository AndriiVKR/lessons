package hw9;

public class Fog {

    private String name;
    private int weight;
    private String size;
    private int jump;

    public Fog(String name, int weight, String size, int jump) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.jump = jump;
    }

    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public String getSize() {
        return size;
    }
    public int getJump() {
        return jump;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setJump(int jump) {
        this.jump = jump;
    }
}
