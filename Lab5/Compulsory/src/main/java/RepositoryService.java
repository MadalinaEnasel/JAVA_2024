import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class RepositoryService {
    public void export(Repository repo, String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(path), repo);
    }

    public Repository read(String path)
            throws InvalidRepositoryException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Repository repo = objectMapper.readValue(new File(path), Repository.class);
        return repo;
    }

    public void print(Repository repo) {
    }

    public void view(Object doc) {
    }
}