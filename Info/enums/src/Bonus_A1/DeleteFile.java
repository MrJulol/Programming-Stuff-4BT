package Bonus_A1;

public class DeleteFile implements FileAction {

    private String path;

    public DeleteFile(String path) {
        this.path = path;
    }

    @Override
    public void execute() {
        System.out.println("Executing DeleteFile :" + this.getPath());
    }

    @Override
    public String getPath() {
        return this.path;
    }
}
