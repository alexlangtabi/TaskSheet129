 interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}
 class Gorilla implements Animal {

    @Override
    // put gorilla food into cage
    public boolean feed(boolean timeToEat) {
        return timeToEat;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Gorilla is taking a shower");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Your pet is a Gorilla");
    }

     public static void main(String[] args) {
         Animal gori = new Gorilla();
         System.out.println("Gorilla is hungry :"+gori.feed(true));
         gori.groom();
         gori.pet();
     }

}

