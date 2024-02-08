public class AttackStrategy implements Character {
    
    String usingKnight (){
        String output = new String(); 
        output += "Knight attacks with a sword!";
        return output;
    }
    

    String usingWizard (){
        String output = new String(); 
        output += "Wizard casts a spell!";
        return output;
    }


    String usingArcher (){
        String output = new String(); 
        output += "Archer shoots an arrow!";
        return output;
    }

}