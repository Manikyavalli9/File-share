import lombok.Data;

import java.util.List;

@Data
public class ShareFileDto {
    private String id;
    private String fileName;
    private String fileType;
    private User from;
    private List<User> to;
}