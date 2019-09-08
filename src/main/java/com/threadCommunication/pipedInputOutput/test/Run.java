package com.threadCommunication.pipedInputOutput.test;

import com.threadCommunication.pipedInputOutput.model.ReadData;
import com.threadCommunication.pipedInputOutput.model.WriteData;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            // create pip and connect the input and output
            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();
            inputStream.connect(outputStream);

            Thread outputThread = new Thread(() -> writeData.writeMethod(outputStream));
            Thread inputThread = new Thread(() -> readData.readMethod(inputStream));
            outputThread.start();
            inputThread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
