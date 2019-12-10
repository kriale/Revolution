import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import java.util.List;

public class StoreClient {
    public static void main(String[] args) throws TException {
        TTransport transport = new TSocket("localhost",9093);
        transport.open();
        TProtocol protocol = new TBinaryProtocol(transport);
        SearchItemService.Client client = new SearchItemService.Client(protocol);
        List<String> answer = client.searchitem("City");
        System.out.println("City");
        for (String item: answer) {
            System.out.println(item);
        }
    }
}
