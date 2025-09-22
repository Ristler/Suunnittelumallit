package proxy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AccessControlService {

    private static final AccessControlService instance = new AccessControlService();

    HashMap<String, List<String>> accessMap;

    private AccessControlService() {
        accessMap = new HashMap<>();

        accessMap.put("doc1", Arrays.asList("daniel", "bob"));

    }
    public static AccessControlService getInstance() {
        return instance;
    }
    public boolean isAllowed(String identifier, String username) {
        List<String> allowedUsers = accessMap.get(identifier);
        if (allowedUsers == null) {
            return false;
        }
        if(allowedUsers.contains(username)) {
            return true;
        }
        return false;
    }
}
