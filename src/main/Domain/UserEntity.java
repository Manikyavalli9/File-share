import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(generator = "uid")
    @GenericGenerator(name = "uid1", strategy = "uid2")
    private String id;
    private String email;
    private String password;

}