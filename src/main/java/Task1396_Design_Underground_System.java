import java.util.HashMap;
import java.util.Map;

public class Task1396_Design_Underground_System {


}

class UndergroundSystem {
    private Map<Integer, Client> clientMap;
    private Map<String, Route> routeMap;

    public UndergroundSystem() {
        clientMap = new HashMap<>();
        routeMap = new HashMap<>();

    }

    public void checkIn(int id, String stationName, int t) {
        Client client = new Client(id, stationName, t);
        clientMap.put(id, client);

    }

    public void checkOut(int id, String stationName, int t) {
        Client client = clientMap.get(id);
        String rout = getRoutKey(client.getStationName(), stationName);
        routeMap.putIfAbsent(rout, new Route(0, 0));
        routeMap.get(rout).addTime(t - client.getTimeStart());

    }

    public double getAverageTime(String startStation, String endStation) {
        String rout = getRoutKey(startStation, endStation);
        return routeMap.get(rout).getAverageTime();
    }

    private String getRoutKey(String startStation, String endStation) {
        return startStation + "->" + endStation;
    }

    public static void main(String[] args) {
        System.out.println("Решение задачи: ");
        UndergroundSystem system = new UndergroundSystem();
        system.checkIn(33, "aa", 8);
        system.checkOut(33, "b", 22);
        system.getAverageTime("aa", "b");
        System.out.println(system.getAverageTime("aa", "b"));
    }


    class Client {
        private int id;
        private String stationName;
        private int timeStart;

        public Client(int id, String stationName, int time) {
            this.id = id;
            this.stationName = stationName;
            this.timeStart = time;

        }

        public String getStationName() {
            return this.stationName;
        }

        public int getTimeStart() {
            return this.timeStart;
        }
    }

    class Route {
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
