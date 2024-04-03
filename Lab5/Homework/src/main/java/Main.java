import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        Main app = new Main();
        app.testRepo();
//        app.testLoadView();
    }

    private void testRepo() throws IOException {
        var repo = new Repository("C:\\Users\\madal\\OneDrive\\Documents\\Facultate\\Informatica\\Restante\\JAVA_2024\\Lab5\\Homework\\Master");
        var service = new RepositoryService();
        service.print(repo);
        service.export(repo, "c:/repository.json");
        var doc = repo.findDocument("...");
        service.view(doc);
    }
}