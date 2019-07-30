package assignment.platform.demo.fileupload;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.util.UUID;

@CrossOrigin("*")
@RestController
public class AssignmentController {
    @PostMapping("/assignment/upload")
    public String upload(MultipartFile file) throws IOException {
        String filename = UUID.randomUUID().toString();
        Path filepath = Path.of("D:", filename);
        file.transferTo(filepath);
        return filepath.toString();
    }

    @PostMapping("/assignment")
    public String submit(@RequestBody Assignment assignment) {
        System.out.println(assignment);
        return UUID.randomUUID().toString();
    }
}
