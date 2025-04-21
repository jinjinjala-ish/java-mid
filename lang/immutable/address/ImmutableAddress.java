package lang.immutable.address;

public class ImmutableAddress {
    private final String name;

    public ImmutableAddress(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "name='" + name + '\'' +
                '}';
    }
}
