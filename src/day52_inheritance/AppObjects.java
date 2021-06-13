package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobApp = new MobileApp();
        mobApp.setName(" WhatsUp");
        mobApp.setVersion(0.187);
        mobApp.useTheApp(10);
        mobApp.download();

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.setVersion(2.77);
        instagram.useTheApp(15);
        instagram.download();

   Discord b22discord = new Discord();
   b22discord.setName("Discord");
   b22discord.setVersion(3.77);
   b22discord.useTheApp(30);
    b22discord.download();
    b22discord.printInfo();
    b22discord.chat("Ramil");

    }

}
