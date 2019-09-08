package com.threadCommunication.pipedInputOutput.model;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {
    public void readMethod(PipedInputStream inputStream) {
        try {
            System.out.println("read: ");
            byte[] readBytes = new byte[20];
            int readLength = inputStream.read(readBytes);
            while (readLength != -1) {
                String readData = new String(readBytes, 0, readLength);
                System.out.print(readData);
                readLength = inputStream.read(readBytes);
            }
            System.out.println();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
