package com.threadCommunication.pipedReaderWriter.model;

import java.io.IOException;
import java.io.PipedWriter;

public class WriterData {
    public void writeMethod(PipedWriter writer) {
        try {
            System.out.println("write: ");
            for (int i = 0; i < 300; i++) {
                String writeData = "" + i;
                writer.write(writeData);
                System.out.print(writeData);
            }
            System.out.println();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
