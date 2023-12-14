package Bonus_A1;

import java.io.File;

public class ReadFile implements FileAction {

    private String path;

    public ReadFile(String path) {
        this.path = path;
    }

    @Override
    public void execute() {
        System.out.println("Executing ReadFile :" + this.getPath());
    }

    @Override
    public String getPath() {
        return this.path;
    }
}
