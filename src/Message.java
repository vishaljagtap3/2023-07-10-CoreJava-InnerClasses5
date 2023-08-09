public class Message {
    private String body;
    private int srNo;
    private static String provider = "AirTel";

    public Message(String body, int srNo) {
        this.body = body;
        this.srNo = srNo;
    }

    @Override
    public String toString() {
        return "Message{" +
                "body='" + body + '\'' +
                ", srNo=" + srNo +
                '}';
    }

    public boolean send(String destAddress, int appType) {

        //method local inner class
        class Destination {
            private String destAddress;
            private int appType;

            public Destination(String destAddress, int appType) {
                this.destAddress = destAddress;
                this.appType = appType;
            }

            public void display() {
                System.out.println(destAddress + " " + appType);
                System.out.println(body + " " + srNo);
                System.out.println("provider = " + provider );
                System.out.println("------------------------------");
            }

            @Override
            public String toString() {
                return "Destination{" +
                        "destAddress='" + destAddress + '\'' +
                        ", appType=" + appType +
                        '}';
            }
        }

        Destination destination = new Destination(destAddress, appType);
        destination.display();
        //code which used destination object to send message
        System.out.println(body + " sent to " + destination);

        return true;
    }

    public void test() {

    }


}
