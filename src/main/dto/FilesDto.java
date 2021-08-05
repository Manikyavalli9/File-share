import lombok.Data;

import java.util.List;

@Data
public class FilesDto {
    private List<UploadFileDto> ownedFiles;
    private List<ShareFileDto> sharedFiles;
}