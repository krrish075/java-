public class Member {

    private int id;
    private String name;

    // Constructor
    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Display member details
    public void displayMember() {
        System.out.println(id + " | " + name);
    }
}