package jabair.project.consultants.consultant;


import javax.persistence.*;

@Entity
@Table
public class Consultant {
    @Id
    @SequenceGenerator(
            name = "consultant_sequence",
            sequenceName = "consultant_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "consultant_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private String location;

    public Consultant(Long id,
                      String name,
                      String email,
                      String location) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.location = location;
    }

    public Consultant(String name,
                      String email,
                      String location) {
        this.name = name;
        this.email = email;
        this.location = location;
    }

    public Consultant() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "consultant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
