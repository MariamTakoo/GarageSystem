package com.company;



public interface TouchScreen {

    default void touch() {

    }


}
// touch the button park in
class ParkingIn implements TouchScreen{
    @Override
    public void touch (){
        System.out.println("Please Waite To Park In :)");
    }
}
// touch the button park out
class ParkingOut implements TouchScreen{
    @Override
    public void touch()
    {
        System.out.println("Please Waite To Park Out :)");
    }
}



