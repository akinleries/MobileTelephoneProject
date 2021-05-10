package MobileTelephone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConnectionTest {
    MobilePhone humblePhone;
    MobilePhone frankPhone;
    MobilePhone henryPhone;
    @BeforeEach
    void setUp(){
        humblePhone = new MobilePhone("humbleimei",PhoneManufacturer.APPLE);
        humblePhone.setModel("iphone xs max");
        humblePhone.setStorageSpace(512);
        humblePhone.makeCall(123456789);

        MobilePhone.setSimCardSlots(1);


         henryPhone = new MobilePhone("henryIp", PhoneManufacturer.INFINIX, "infinix hot5");
        henryPhone.makeCall(1456778);


        frankPhone = new MobilePhone("frankIemei", PhoneManufacturer.TECHNO, 90);
        frankPhone.setModel("spark4");
    }
    @Test
    void showSimCardSlots(){
        System.out.println("slot count in humble's phone is  " + humblePhone.getSimCardSlots());
        System.out.println("slot count in frank's phone is  " + frankPhone.getSimCardSlots());
        System.out.println("slot count in henry's phone is  " + henryPhone.getSimCardSlots());
    }

}