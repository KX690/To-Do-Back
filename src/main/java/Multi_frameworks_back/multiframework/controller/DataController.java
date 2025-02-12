package Multi_frameworks_back.multiframework.controller;

import Multi_frameworks_back.multiframework.model.Comment;
import Multi_frameworks_back.multiframework.persistence.CommentService;
import Multi_frameworks_back.multiframework.persistence.PublicacionService;
import org.springframework.http.HttpStatus;
import Multi_frameworks_back.multiframework.model.Publication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/api/data")
@CrossOrigin(origins = "*")
public class DataController {

    @GetMapping("/getAllPublication")
    public ResponseEntity<?> getPublication() {
        try {
            PublicacionService publicationService = new PublicacionService();
            List<Publication> publication = publicationService.getAllPublications();
            return ResponseEntity.ok(publication);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error retrieving publication: " + e.getMessage());
        }
    }

    @GetMapping("/getAllCommentsByIdPublication")
    public ResponseEntity<?> getComments(@RequestParam Integer idPublication) {
        try {
            CommentService publicationService = new CommentService();
            List<Comment> comments = publicationService.getAllCommentByIdPublication(idPublication);
            return ResponseEntity.ok(comments);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error retrieving publication: " + e.getMessage());
        }
    }

    @PostMapping("/addComment")
    public ResponseEntity<?> addComment(@RequestBody Comment comment) {
        try {
            CommentService commentService = new CommentService();
            commentService.addComment(comment);
            Map<String, String> response = new HashMap<>();
            response.put("message", "Comentario added");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error adding comment: " + e.getMessage());
        }
    }

    @PostMapping("/addPublication")
    public ResponseEntity<?> addPublication(@RequestBody Publication publication) {
        try {
            PublicacionService publicationService = new PublicacionService();
            publicationService.addPublication(publication);
            Map<String, String> response = new HashMap<>();
            response.put("message", "Publication added");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error adding publication: " + e.getMessage());
        }
    }

    @PutMapping("/updatePublication/{id}")
    public ResponseEntity<?> updatePublication(@PathVariable Integer id, @RequestBody Publication publication) {
        try {
            PublicacionService publicationService = new PublicacionService();
            publication.setId(id);
            publicationService.updatePublication(publication);
            return ResponseEntity.ok(publication);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error updating publication: " + e.getMessage());
        }
    }


    @GetMapping("/publication/{id}")
    public ResponseEntity<?> getPublicationById(@PathVariable Integer id) {
        try {
            PublicacionService publicationService = new PublicacionService();
            Publication publication = publicationService.getPublicationById(id);
            return ResponseEntity.ok(publication);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error retrieving publication: " + e.getMessage());
        }
    }

    @GetMapping("/getPublicationByTags")
    public ResponseEntity<?> getPublicationByTags(@RequestParam String tags) {
        try {
            PublicacionService publicationService = new PublicacionService();
            List<Publication> publication = publicationService.getPublicationByTags(tags);
            return ResponseEntity.ok(publication);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error retrieving publication: " + e.getMessage());
        }
    }
}
