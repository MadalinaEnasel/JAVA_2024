import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Repository {
    @JsonProperty("directory")
    private String directory;
    @JsonProperty("documents")
    private Map<Person, List<Document>> documents = new HashMap<>();

    public Repository(String directory) {
        this.directory = directory;
        loadDocuments();
    }

    private void loadDocuments() {
        File file = new File(directory);
        String[] directories = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File current, String name) {
                return new File(current, name).isDirectory();
            }
        });

        if (directories != null) {
            for (String subDir : directories) {
                String subDirPath = directory + File.separator + subDir;
                System.out.print("\n" + subDir + ": ");
                File subDirFile = new File(subDirPath);
                File[] files = subDirFile.listFiles();
                if (files != null) {
                    for (File subFile : files) {
                        System.out.print(subFile.getName() + ",");
                    }
                }

            }
        } else {
            System.out.println("No subdirectories found.");
        }
    }

    public Object findDocument(String s) {

        return null;
    }
}