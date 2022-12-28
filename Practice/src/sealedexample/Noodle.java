package sealedexample;

public sealed class Noodle implements Food permits Ramyeon, Kalguksu, Makguksu{


    @Override
    public String getFoodName(Noodle noodle) {
        if(noodle instanceof Ramyeon){
            return "Ramyeon";
        }else if(noodle instanceof Kalguksu){
            return "Kalguksu";
        }else if(noodle instanceof Makguksu){
            return "Makguksu";
        }
        return "error";
    }
}
