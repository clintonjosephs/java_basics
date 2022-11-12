public class Payment {
    enum Network {
        MTN, VODAFONE, TIGO, AIRTEL
    }
    
    private String phoneNumber;
    private Network network;
    private String currency;
    private String amount;

    /**
    * initial constructor for the payment class
    * @param phoneNumber phone number for payment
    * @param network network for payment
    * @param currency currency for payment
    * @param amount amount for payment
    */

    public Payment(String phoneNumber, Network network, String currency, String amount) {
        this.network = network;
        this.currency = currency;
        this.amount = amount;
        this.phoneNumber = formatPhoneNumber(phoneNumber);
    }

    /**
    * format the phone number to the correct format
    * @param phoneNumber phone number to be formatted
    * @return formatted phone number
    */

    private String formatPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("0") && phoneNumber.length() == 10) {
            return "+233" + phoneNumber.substring(1, phoneNumber.length());
        } else if (phoneNumber.startsWith("+233") && phoneNumber.length() == 13) {
            return phoneNumber;
        } 
        return null;
    }

    /**
    * @return the phoneNumber
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    private void chooseNetwork(NetworkType networkType) {
        networkType.name();
    }
}