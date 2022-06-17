import org.springframework.beans.factory.annotation.Value;

public class Cat {
    @Value("George")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
