package MobileTelephone;

public class MobilePhone {
    private String imei;
    private PhoneManufacturer make;
    private String model;
    private int storageSpace;
    private static final String INVALID_IME = "INVALID IME";
    private static int simCardSlots;

    public MobilePhone(){
        super();
    }

    public MobilePhone(String imeNumber) { 
        if (imeNumber == ""){
           this.imei = MobilePhone.INVALID_IME;
        }
    }

    public MobilePhone(String imeNumber, PhoneManufacturer phoneMake){
        this(imeNumber);
        make = phoneMake;
    }

    public MobilePhone(String imeNumber, PhoneManufacturer phoneMake, int phoneStorage){
        this(imeNumber, phoneMake);
        storageSpace = phoneStorage;
    }
    public MobilePhone(String imeNumber, PhoneManufacturer phoneMake, String phoneModel){
        this(imeNumber, phoneMake);
        model = phoneModel;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public PhoneManufacturer getMake() {
        return make;
    }

    public void setMake(PhoneManufacturer make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(int storageSpace) {
        this.storageSpace = storageSpace;
    }

    public int getSimCardSlots() {
        return simCardSlots;
    }

    public static void setSimCardSlots(int simCard) {
        MobilePhone.simCardSlots = simCard;
    }

    public static String getInvalidIme() {
        return INVALID_IME;
    }
    public Connection makeCall(int phoneNumber){
        Connection theCall = new Connection();
        return  theCall;
    }
}
