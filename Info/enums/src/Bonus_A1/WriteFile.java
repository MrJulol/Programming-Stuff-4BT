package Bonus_A1;

public class WriteFile implements FileAction{

    private String path;

    public WriteFile(String path) {
        this.path = path;
    }

    @Override
    public void execute() {
        System.out.println("Executing WriteFile :" + this.getPath());
    }

    @Override
    public String getPath() {
        return this.path;
    }
}
