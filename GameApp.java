public class GameApp{
    public static void main(String [] args){

        Command command = new Command (usingKnight, new DefenseStrategy());
        System.out.println(Command.characterType);
    }
}