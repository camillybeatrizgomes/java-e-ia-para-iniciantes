package br.com.dio.persistence;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public abstract class FilePersistence {

    protected final String currentDir = System.getProperty("user.dir");
    protected final String storeDir;
    protected final String fileName;

    public FilePersistence(String fileName, final String storeDir) {
        this.storeDir = storeDir;
        this.fileName = fileName;
    }

    public abstract String write(final String data);
    public abstract boolean remove(final String sentence);
    public abstract String replace(final String oldContent, final String newContent);
    public abstract String findAll();
    public abstract String findBy(final String sentece);

    protected void clearFile(){
        try {
            OutputStream outputStream = new FileOutputStream(currentDir + storeDir + fileName);
            System.out.printf("Inicializando recursos (%s) \n", currentDir + storeDir + fileName);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    protected List<String> toListString() {
        var content = findAll();
        var contentList = new ArrayList<>(Stream.of(content.split(System.lineSeparator())).toList());
        return contentList;
    }

}
