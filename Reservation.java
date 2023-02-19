
import java.io.Serializable;

public class Reservation implements Serializable {
   
       String Name;
       String MobileNumber;
       String Id;
       String  Gender;
       String checkInDate;
       String roomType;
       String roomNumber;
       String price;
       String address;
public Reservation(  String Name, String MobileNumber,String Id,String  Gender, String checkInDate,String roomType,String roomNumber, String price,String address){
       this. Name=Name;
       this.MobileNumber=MobileNumber;
       this.Id=Id;
       this.Gender=Gender;
       this.checkInDate=checkInDate;
       this.roomType=roomType;
       this.roomNumber=roomNumber;
       this.price=price;
       this.address=address;
    }
        public String getName() {
        return Name;
    }
    
    public String getMobileNumber() {
        return MobileNumber;
    }
    
    public String getId() {
        return Id;
    }
    
    public String getGender() {
        return Gender;
    }
    
    public String getCheckInDate() {
        return checkInDate;
    }
    
    public String getRoomType() {
        return roomType;
    }
    
    public String getRoomNumber() {
        return roomNumber;
    }
    
    public String getPrice() {
        return price;
    }
    
    public String getAddress() {
        return address;
    }
    
    @Override
    public String toString() {
        return "Customer details Details  [Name=" + Name + ", MobileNumber=" + MobileNumber+ ", Id=" + Id + ", Gender=" + Gender+ ", checkInDate=" + checkInDate + ", roomType=" + roomType+ ", roomNumber=" + roomNumber + ", price=" + price+ ", address=" + address + "]";
    }  
     
}

