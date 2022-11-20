import java.util.HashMap;
import java.util.Map;

public class Task1396_Design_Underground_System {


}

class UndergroundSystem {
    private final Map<Integer, Client> clientMap;
    private final Map<String, Map<String, Route>> routeMap;

    public UndergroundSystem() {
        clientMap = new HashMap<>();
        routeMap = new HashMap<>();

    }

    public void checkIn(int id, String stationName, int t) {
        Client client = new Client(stationName, t);
        clientMap.put(id, client);

    }

    public void checkOut(int id, String stationName, int t) {
        Client client = clientMap.get(id);
        routeMap.putIfAbsent(client.inStation, new HashMap<>());
        routeMap.get(client.inStation).putIfAbsent(stationName, new Route(0, 0));

        int travelTime = t - client.getTimeStart();
        Route route = getRout(client.inStation, stationName);
        route.addTime(travelTime);
    }

    public double getAverageTime(String startStation, String endStation) {
        Route route = getRout(startStation, endStation);
        return route.getAverageTime();
    }

    private Route getRout(String startStation, String endStation) {
        return routeMap.get(startStation).get(endStation);
    }

    public static void main(String[] args) {
        System.out.println("Решение задачи: ");
        UndergroundSystem system = new UndergroundSystem();
        system.checkIn(33, "aa", 8);
        system.checkOut(33, "b", 22);
        system.getAverageTime("aa", "b");
        System.out.println(system.getAverageTime("aa", "b"));
    }


    static class Client {
        private final String inStation;
        private final int timeStart;

        public Client(String inStation, int time) {
            this.inStation = inStation;
            this.timeStart = time;

        }

        public String getInStation() {
            return this.inStation;
        }

        public int getTimeStart() {
            return this.timeStart;
        }
    }

    static class Route {
        private int time;
        private int tripCounter;

        public Route(int time, int tripCounter) {
            this.time = time;
            this.tripCounter = tripCounter;
        }

        public void addTime(int time) {
            this.time += time;
            this.tripCounter++;
        }

        public double getAverageTime() {
            return 1.0d * time / tripCounter;
        }
    }
}
