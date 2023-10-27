public class Week {
    private float dayNum;
    private int vehId;
    private int trip;
    private float timestamp;
    private float latitude;
    private float longitude;
    private float vehicleSpeed;
    private float maf;
    private int engineRPM;
    private float absoluteLoad;
    private float oat;
    private int fuelRate;
    private int acPowerKW;
    private int acPowerWatts;
    private int heaterPowerWatts;
    private float hvBatteryCurrent;
    private float hvBatterySOC;
    private float hvBatteryVoltage;
    private float shortTermFuelTrimBank1;
    private float shortTermFuelTrimBank2;
    private float longTermFuelTrimBank1;
    private float longTermFuelTrimBank2;

    public Week(float dayNum, int vehId, int trip, float timestamp, float latitude, float longitude, float vehicleSpeed, float maf, int engineRPM, float absoluteLoad, float oat, int fuelRate, int acPowerKW, int acPowerWatts, int heaterPowerWatts, float hvBatteryCurrent, float hvBatterySOC, float hvBatteryVoltage, float shortTermFuelTrimBank1, float shortTermFuelTrimBank2, float longTermFuelTrimBank1, float longTermFuelTrimBank2) {
        this.dayNum = dayNum;
        this.vehId = vehId;
        this.trip = trip;
        this.timestamp = timestamp;
        this.latitude = latitude;
        this.longitude = longitude;
        this.vehicleSpeed = vehicleSpeed;
        this.maf = maf;
        this.engineRPM = engineRPM;
        this.absoluteLoad = absoluteLoad;
        this.oat = oat;
        this.fuelRate = fuelRate;
        this.acPowerKW = acPowerKW;
        this.acPowerWatts = acPowerWatts;
        this.heaterPowerWatts = heaterPowerWatts;
        this.hvBatteryCurrent = hvBatteryCurrent;
        this.hvBatterySOC = hvBatterySOC;
        this.hvBatteryVoltage = hvBatteryVoltage;
        this.shortTermFuelTrimBank1 = shortTermFuelTrimBank1;
        this.shortTermFuelTrimBank2 = shortTermFuelTrimBank2;
        this.longTermFuelTrimBank1 = longTermFuelTrimBank1;
        this.longTermFuelTrimBank2 = longTermFuelTrimBank2;
    }
    public float getDayNum() {
        return dayNum;
    }

    public void setDayNum(float dayNum) {
        this.dayNum = dayNum;
    }

    public int getVehId() {
        return vehId;
    }

    public void setVehId(int vehId) {
        this.vehId = vehId;
    }

    public int getTrip() {
        return trip;
    }

    public void setTrip(int trip) {
        this.trip = trip;
    }

    public float getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(float timestamp) {
        this.timestamp = timestamp;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getVehicleSpeed() {
        return vehicleSpeed;
    }

    public void setVehicleSpeed(float vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

    public float getMaf() {
        return maf;
    }

    public void setMaf(float maf) {
        this.maf = maf;
    }

    public int getEngineRPM() {
        return engineRPM;
    }

    public void setEngineRPM(int engineRPM) {
        this.engineRPM = engineRPM;
    }

    public float getAbsoluteLoad() {
        return absoluteLoad;
    }

    public void setAbsoluteLoad(float absoluteLoad) {
        this.absoluteLoad = absoluteLoad;
    }

    public float getOat() {
        return oat;
    }

    public void setOat(float oat) {
        this.oat = oat;
    }

    public int getFuelRate() {
        return fuelRate;
    }

    public void setFuelRate(int fuelRate) {
        this.fuelRate = fuelRate;
    }

    public int getAcPowerKW() {
        return acPowerKW;
    }

    public void setAcPowerKW(int acPowerKW) {
        this.acPowerKW = acPowerKW;
    }

    public int getAcPowerWatts() {
        return acPowerWatts;
    }

    public void setAcPowerWatts(int acPowerWatts) {
        this.acPowerWatts = acPowerWatts;
    }

    public int getHeaterPowerWatts() {
        return heaterPowerWatts;
    }

    public void setHeaterPowerWatts(int heaterPowerWatts) {
        this.heaterPowerWatts = heaterPowerWatts;
    }

    public float getHvBatteryCurrent() {
        return hvBatteryCurrent;
    }

    public void setHvBatteryCurrent(float hvBatteryCurrent) {
        this.hvBatteryCurrent = hvBatteryCurrent;
    }

    public float getHvBatterySOC() {
        return hvBatterySOC;
    }

    public void setHvBatterySOC(float hvBatterySOC) {
        this.hvBatterySOC = hvBatterySOC;
    }

    public float getHvBatteryVoltage() {
        return hvBatteryVoltage;
    }

    public void setHvBatteryVoltage(float hvBatteryVoltage) {
        this.hvBatteryVoltage = hvBatteryVoltage;
    }

    public float getShortTermFuelTrimBank1() {
        return shortTermFuelTrimBank1;
    }

    public void setShortTermFuelTrimBank1(float shortTermFuelTrimBank1) {
        this.shortTermFuelTrimBank1 = shortTermFuelTrimBank1;
    }

    public float getShortTermFuelTrimBank2() {
        return shortTermFuelTrimBank2;
    }

    public void setShortTermFuelTrimBank2(float shortTermFuelTrimBank2) {
        this.shortTermFuelTrimBank2 = shortTermFuelTrimBank2;
    }

    public float getLongTermFuelTrimBank1() {
        return longTermFuelTrimBank1;
    }

    public void setLongTermFuelTrimBank1(float longTermFuelTrimBank1) {
        this.longTermFuelTrimBank1 = longTermFuelTrimBank1;
    }

    public float getLongTermFuelTrimBank2() {
        return longTermFuelTrimBank2;
    }

    public void setLongTermFuelTrimBank2(float longTermFuelTrimBank2) {
        this.longTermFuelTrimBank2 = longTermFuelTrimBank2;
    }

}