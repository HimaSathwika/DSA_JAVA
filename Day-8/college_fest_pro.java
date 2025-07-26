//Encapsulation
package java_projects;
class Student{
    private int partcipantId;
    private String name;
    private double baseRegistrationFee;
    private int numberOfEvents;
    private double eventChargePerEvent;
    public void setPartcipantId(int pId){
        partcipantId = pId;
    }
    public void setName(String n){
        name = n;
    }
    public void setBaseRegistrationFee(double br_fee){
        baseRegistrationFee = br_fee;
    }
    public void setNumberOfEvents(int no_of_eve){
        numberOfEvents = no_of_eve;
    }
    public void setEventChargePerEvent(int ch_per_eve){
        eventChargePerEvent = ch_per_eve;
    }
    public int getPartcipantId(){
        return partcipantId;
    }
    public String getName(){
        return name;
    }
    public double getBaseRegistrationFee(){
        return baseRegistrationFee;
    }
    public int getNumberOfEvents(){
        return numberOfEvents;
    }
    public double getEventChargePerEvent(){
        return eventChargePerEvent;
    }
    public double getCalculateTotalFee(){
        return baseRegistrationFee + (numberOfEvents * eventChargePerEvent);
    }
}
public class college_fest_pro {
    public static void main(String[] args){
        Student s = new Student();
        s.setPartcipantId(531);
        System.out.println("ID: "+s.getPartcipantId());
        s.setName("Sathwika");
        System.out.println("Name: " + s.getName());
        s.setBaseRegistrationFee(200.0);
        System.out.println("Base Registration Fee: "+s.getBaseRegistrationFee());
        s.setNumberOfEvents(3);
        s.setEventChargePerEvent(100);
        System.out.println("Event charges: " + s.getNumberOfEvents()+" Events @ " + s.getEventChargePerEvent() + "/event");
        System.out.println("Total Fee: " + s.getCalculateTotalFee());
    }
}
