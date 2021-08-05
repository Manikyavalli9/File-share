import lombok.Data;

@Data
public class UploadFileDto {
    private String id;
    private User from;
    private String fileName;
    private String fileType;
}