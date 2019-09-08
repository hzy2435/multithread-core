package com.threadCommunication.pipedReaderWriter.test;

import com.threadCommunication.pipedReaderWriter.model.ReaderData;
import com.threadCommunication.pipedReaderWriter.model.WriterData;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Run {
    public static void main(String[] args) throws IOException {
        ReaderData readerData = new ReaderData();
        WriterData writerData = new WriterData();

        PipedWriter writer = new PipedWriter();
        PipedReader reader = new PipedReader();
        writer.connect(reader);

        Thread writerThread = new Thread(() -> writerData.writeMethod(writer));
        Thread readerThread = new Thread(() -> readerData.readMethod(reader));
        writerThread.start();
        readerThread.start();
    }
}
