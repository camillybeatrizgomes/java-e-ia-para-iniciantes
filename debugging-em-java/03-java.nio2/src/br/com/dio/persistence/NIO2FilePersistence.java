package br.com.dio.persistence;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NIO2FilePersistence extends FilePersistence {

    public NIO2FilePersistence(final String fileName) throws IOException {
        super(fileName, "/managedFiles/NIO2/");
        var path = Paths.get(currentDir + storeDir);
        if (!Files.exists(path)){
            Files.createDirectories(path);
        }
        clearFile();
    }

    @Override
    public String write(String data) {
        var path = Paths.get(currentDir + storeDir + fileName);
        try {
            Files.write(path, data.getBytes(), StandardOpenOption.APPEND);
            Files.write(path, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    
    @Override
    public boolean remove(String sentence) {
        var contentList = toListString();
        if (contentList.stream().noneMatch(c -> c.contains(sentence))){
            return false;
        }
        clearFile();
        contentList.stream().filter(c -> !c.contains(sentence)).forEach(this::write);
        return true;
    }

    @Override
    public String replace(String oldContent, String newContent) {
        var contentList = toListString();
        if(contentList.stream().noneMatch(c -> c.contains(oldContent))){
            return "";
        }
        clearFile();
        contentList.stream().map(c -> c.contains(oldContent) ? newContent : c).forEach(this::write);
        return newContent;
    }

    @Override
    public String findAll() {
        var path = Paths.get(currentDir + storeDir + fileName);
        var content = "";
        try (var lines = Files.lines(path)){
            content = lines.collect(Collectors.joining(System.lineSeparator()));
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return content;
    }

    @Override
    public String findBy(String sentece) {
        var content = findAll();
        return Stream.of(content.split(System.lineSeparator())).filter(c -> c.contains(sentece)).findFirst().orElse("");
    
    }
    
}
