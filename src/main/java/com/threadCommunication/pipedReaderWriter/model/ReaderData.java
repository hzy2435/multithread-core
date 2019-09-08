package com.threadCommunication.pipedReaderWriter.model;

import java.io.IOException;
import java.io.PipedReader;

public class ReaderData {
    public void readMethod(PipedReader reader) {
        try {
            System.out.println("read: ");
            char[] readChar = new char[20];
            int readLength = reader.read(readChar);
            while (readLength != -1) {
                String newData = new String(readChar, 0, readLength);
                System.out.print(newData);
                readLength = reader.read(readChar);
            }
            System.out.println();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
