import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class FileEntity {
    @Id
    @GeneratedValue(generator = "uid")
    @GenericGenerator(name = "uid1", strategy = "uid2")
    private String id;
    private String fileName;
    private String fileType;
    @ManyToOne
    private User from;
    @ManyToMany
    private List<User> to;
}