import org.apache.thrift.TException;

import java.util.*;
import java.lang.String;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StoreServer implements SearchItemService.Iface{
    public static void main(String[] args) {

    }
    @Override
    public List<String> searchitem(String name) throws TException {
        Map<String, List<String>> stringListMap = new HashMap<>();
        stringListMap.put("City", Stream.of("Price: 50$","Effect: x2 speed of building").collect(Collectors.toList()));
        stringListMap.put("Attack", Stream.of("Price: 20$","Effect: +20% attack").collect(Collectors.toList()));
        stringListMap.put("Defence", Stream.of("Price: 30$","Effect: +40% armor").collect(Collectors.toList()));
        Set<String> keys = stringListMap.keySet();
        List<String> list = new ArrayList<String>();;
        list.add("There is no such an item");
        for (String key:keys)
        {
            if(key.equals(name))
            {
                return stringListMap.get(name);
            }
        }
        return list;
        }
    }

