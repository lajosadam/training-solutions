package staticInterface;

import java.time.LocalDateTime;

public class Employee implements Audited{

    private String name;
    private LocalDateTime createDate;

    public String getName() {
        return name;
    }

    public Employee(String name, LocalDateTime createDate) {
        this.name = name;
        this.createDate = createDate;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return createDate;
    }
}
