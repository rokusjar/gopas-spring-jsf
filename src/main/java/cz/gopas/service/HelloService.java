package cz.gopas.service;

import java.io.*;
import org.apache.commons.io.*;
import org.springframework.stereotype.*;

@Service
public class HelloService {

    public byte[] getFile(String fileName) throws IOException {
        File file = new File(".", fileName);
        return FileUtils.readFileToByteArray(file);
    }
}
