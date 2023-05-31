class UndergroundSystem {
    class Pair{
        String Start;
        String end;
        int t;
        Pair(String Start,String end,int t){
           this.Start = Start;
           this.end = end;
           this.t = t;     
        }
    }
     
    public UndergroundSystem() {
        hm = new HashMap<>();
        stationsMap = new HashMap<>();

    }
    HashMap<Integer,Pair> hm;
    public void checkIn(int id, String stationName, int t) {
         hm.put(id,new Pair(stationName,"",t));
    }
    class avrgPair{
        int count;
        int totalT;
        avrgPair(int count,int totalT){
            this.count = count;
            this.totalT =totalT;
        }
    }

    HashMap<Integer,avrgPair> stationsMap;
    public void checkOut(int id, String stationName, int t) {
        Pair  p =  hm.remove(id);
        String st = p.Start;
        int startTime = p.t;
        int total = t-startTime;
        if(stationsMap.containsKey(getHash(st,stationName))){
            
            avrgPair np = stationsMap.get(getHash(st,stationName));
            int co = np.count+1;
            int time = np.totalT+total;
            stationsMap.put(getHash(st,stationName),new avrgPair(co,time));
        }else {
            stationsMap.put(getHash(st,stationName),new avrgPair(1,total));
        }
        
    }
    
    public double getAverageTime(String startStation, String endStation) {
        avrgPair p = stationsMap.get(getHash(startStation,endStation));
        int co = p.count;
        int time = p.totalT;
        double ans = (time*1.0) /(co*1.0);
        return ans;
    }
    public int getHash(String startStation, String endStation) {
        return (int) (startStation + "#" + endStation).hashCode();
    }

}
/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */