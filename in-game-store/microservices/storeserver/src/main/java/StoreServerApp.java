import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class StoreServerApp {
    public static void main(String[] args) {
        try
        {
            StoreServer hwServer = new StoreServer();
            SearchItemService.Processor processor = new SearchItemService.Processor(hwServer);
            TServerTransport serverTransport = new TServerSocket(9093);
            TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));
            System.out.println("Starting the server");
            server.serve();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
