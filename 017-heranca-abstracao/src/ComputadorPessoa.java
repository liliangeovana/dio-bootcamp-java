public class ComputadorPessoa {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        Facebook facebook = new Facebook();
        Telegram telegram = new Telegram();

        //MSN
        System.out.println("--------MSN-------");
        msn.enviarMensagem();
        msn.receberMensagem();

        
        System.out.println("----------FACEBOOK---------");
        //FACEBOOK
        facebook.enviarMensagem();
        facebook.receberMensagem();

        System.out.println("---------TELEGRAM----------");
        //TELEGRAM
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
