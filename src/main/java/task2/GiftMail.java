package task2;

public class GiftMail implements MailCode{
    private static String TEMPLATE = "GOOD NEWS! YOU, %name, receive discount!!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replace("%name", client.getName());
    }
}