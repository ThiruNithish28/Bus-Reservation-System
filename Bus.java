public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int busNo,boolean ac , int capacity){
        this.busNo = busNo;
        this.ac=ac;
        this.capacity =capacity;
    }

    //getter
    public int getBusNo(){
        return busNo;
    }
    public boolean getAc(){
        return ac;
    }
    public int getCapacity(){
        return capacity;
    }

    // setter

    public void setBusNo(int number){
        busNo = number;
    }
    public void setAc(boolean isAc){
        ac = isAc;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    // display the bus details

    public void displayInfo(){
        System.out.println("Bus No : " + busNo + " AC/Non-Ac : " + ac + " Capacity of bus : " + capacity);
    }
}
