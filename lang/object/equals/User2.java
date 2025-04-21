package lang.object.equals;

public class User2 {

    private String id;

    public User2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        User2 user = (User2) obj;
        return id.equals(user.id);
    }
}
