package bsu.revolution.thrift;

import bsu.revolution.thrift.thrift.v1.models.Profile;
import bsu.revolution.thrift.thrift.v1.services.ProfileService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ThriftClient {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            TTransport transport = new TSocket("localhost", 9090);


            TProtocol protocol = new TBinaryProtocol(transport);
            ProfileService.Client client = new ProfileService.Client(protocol);

            menu();
            while (true) {
                transport.open();
                switch (scanner.nextInt()) {
                    case 1:
                        getProfile(client);
                        break;
                    case 2:
                        exit();
                        break;
                    default:
                        menu();
                        break;

                }
                transport.close();
            }
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    private static void getProfile(ProfileService.Client client) throws TException {
        Profile profile = client.getById(2L);

        Instant instant = Instant.ofEpochSecond(profile.getBirthDate());
        LocalDateTime birthDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        System.out.println(
                String.format("%s родился %s. Статус: %s.",
                        profile.getFirstName(),
                        DateTimeFormatter.ISO_DATE.format(birthDate),
                        profile.getState())
        );
    }

    private static void exit() {
        System.exit(0);
    }

    private static void menu() {
        System.out.println("1: profile");
        System.out.println("2: exit");
    }
}
