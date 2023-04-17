class vozilotest {
    public static void main(String[] args) {
        Vozilo mercedesA = new Vozilo();
        mercedesA.barva = "Crna";
        mercedesA.naziv = "Mercedes A320";
        mercedesA.maxHitrost = 230;
        mercedesA.stKoles = 4;

        mercedesA.izpisBarve();
        mercedesA.izpisNaziv();
        mercedesA.izpismaxHitrost();
        mercedesA.izpisstKoles();

    }
}
