package bsu.revolution.thrift;

import bsu.revolution.thrift.thrift.v1.impl.ProfileHandler;
import bsu.revolution.thrift.thrift.v1.services.ProfileService;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class Server {

    private static final int PORT = 9090;

    public static ProfileHandler handler;
    public static ProfileService.Processor processor;

    public static void main(String[] args) {
        try {
            handler = new ProfileHandler();
            processor = new ProfileService.Processor(handler);

            Runnable simple = () -> perform(processor);

            new Thread(simple).start();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public static void perform(ProfileService.Processor processor) {
        try {
            TServerTransport serverTransport = new TServerSocket(PORT);
            TServer server = new TSimpleServer(
                    new TServer.Args(serverTransport).processor(processor)
            );

            System.out.println("Starting the simple server on port " + PORT + "...");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
