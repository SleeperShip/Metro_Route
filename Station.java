Class Station {
    private String lineName;
    private String stationName;
    
    public Station(String line, String station) {
        this.lineName = line;
        this.stationName = station;
    }
    
    @Override
    public String toString() {
        System.out.println(this.stationName);
    }
}
