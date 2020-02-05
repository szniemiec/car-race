package com.javaCarRace.classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reader {

    List<String> names;

    public Reader() {

    }

    public List<String> reading (String fileName) {
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            names = lines.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
//        names = new ArrayList<>();
//        String line = "";
//        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
//            while ((line = br.readLine()) != null) {
//                names.add(line);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return names;
    }
}
