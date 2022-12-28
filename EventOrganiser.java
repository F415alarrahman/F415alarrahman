package tugas;

import java.util.ArrayList;

public class EventOrganiser {
    private int CustId;
    private int CustPhone;

    public int getCustId() {
        return CustId;
    }

    public void setCustId(int custId) {
        CustId = custId;
    }

    public int getCustPhone() {
        return CustPhone;
    }

    public void setCustPhone(int custPhone) {
        CustPhone = custPhone;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public String getCustAddr() {
        return CustAddr;
    }

    public void setCustAddr(String custAddr) {
        CustAddr = custAddr;
    }

    public String getCustEmail() {
        return CustEmail;
    }

    public void setCustEmail(String custEmail) {
        CustEmail = custEmail;
    }

    private String CustName;
    private String CustAddr;
    private String CustEmail;


    public static void PrintGuest(ArrayList<EventOrganiser> daftarTamu){
        System.out.println("daftar tamu : ");
        for (EventOrganiser tamu :daftarTamu){
            System.out.println(" ID : "+tamu.getCustId());
            System.out.println(" NAME : "+tamu.getCustName());
            System.out.println(" ADDRESS : "+tamu.getCustAddr());
            System.out.println(" EMAIL : "+tamu.getCustEmail());
            System.out.println(" PHONE : "+tamu.getCustPhone());
        }
    }
    public  EventOrganiser(){}
    public EventOrganiser(String custAddr, String custEmail, String custName, int custId, int custPhone){
        this.CustAddr= custAddr;
        this.CustEmail= custEmail;
        this.CustName= custName;
        this.CustId= custId;
        this.CustPhone= custPhone;
    }
}
