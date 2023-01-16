public class Zelda {

    public static void main(String[] args) {

        ZeldaPlayer player1 = new ZeldaPlayer();
        ZeldaEnemy skeleton1 = new ZeldaEnemy(5,5,2,"Skeleton");
        ZeldaEnemy goblin1 = new ZeldaEnemy(3,3,1,"Goblin");
        ZeldaEnemy rowen = new ZeldaEnemy(15,5,1,"Rowen");
        ZeldaEnemy cass = new ZeldaEnemy(20,3,2,"cass");
        //player max health 9, enemy max health 20


//startup();












    }
    public static void startup(){
        String s= "*----------------------------------------------------------------------------------------------------------------------------------------------*";
        System.out.println(s);

        System.out.println("        \r\n" +
                "                                                                                                                          \r\n" +
                "                         -_____                     ,,                      -_____                                        \r\n" +
                "                           ' | -,        ;          ||                        ' | -,                _                     \r\n" +
                "                          /| |  |`  _-_  \\\\/\\  _-_, ||/\\\\  /'\\\\ -_-_         /| |  |` \\\\ \\\\ \\\\/\\\\  / \\\\  _-_   /'\\\\ \\\\/\\\\ \r\n" +
                "                          || |==|| || \\\\ || | ||_.  || || || || || \\\\        || |==|| || || || || || || || \\\\ || || || || \r\n" +
                "                         ~|| |  |, ||/   || |  ~ || || || || || || ||       ~|| |  |, || || || || || || ||/   || || || || \r\n" +
                "                          ~-____,  \\\\,/  \\\\/  ,-_-  \\\\ |/ \\\\,/  ||-'         ~-____,  \\\\/\\\\ \\\\ \\\\ \\\\_-| \\\\,/  \\\\,/  \\\\ \\\\ \r\n" +
                "                         (                            _/        |/          (                      /  \\                   \r\n" +
                "                                                                '                                 '----`                 ");

        System.out.println("                                                         Turn Based Action Adventure\n\n\n\n\n\n\n\n\n\n");
        System.out.println(s+"                         ");


    }

    private static void screen() {

        String s="*----------------------------------------------------------------------------------------------------------------------------------------------*";
        System.out.println(s);
        int sl=s.length();
        int counter=1;
        do{
            if(counter==3){
                System.out.print("|3         Width: 144  Height: 23\n");
            }else {
                System.out.println("|" + counter);
            }
            counter++;
        }while(counter!=22);
        System.out.println(s);
    }
}
