package lv.javaguru.tests5;

public class ClientTest {
    public static void main(String[] args) {

        ContactInformation contactInformation1 = new ContactInformation();
        contactInformation1.setAddress("AAAA");
        contactInformation1.setCity("AAAA");
        contactInformation1.setCountry("AAAA");
        contactInformation1.setEmail("AAAA");
        contactInformation1.setPhoneNumber("AAAA");

        ContactInformation contactInformation2 = new ContactInformation();
        contactInformation2.setAddress("BBB");
        contactInformation2.setCity("BBB");
        contactInformation2.setCountry("BBB");
        contactInformation2.setEmail("BBB");
        contactInformation2.setPhoneNumber("BBB");

        Client client1 = new Client();
        client1.setFirstName("111");
        client1.setLastName("111");
        client1.setPersonalCode("111");
        client1.setContactInformation(contactInformation1);

        Client client2 = new Client();
        client2.setFirstName("222");
        client2.setLastName("222");
        client2.setPersonalCode("222");
        client2.setContactInformation(contactInformation2);

        System.out.println(client1);
        System.out.println("");
        System.out.println(client2);

    }
}
