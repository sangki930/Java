package sealedexample;

public sealed interface Food permits Noodle{

    public String getFoodName(Noodle noodle);
}
