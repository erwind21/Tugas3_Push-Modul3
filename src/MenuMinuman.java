public class MenuMinuman {
    private String minuman;
    private int harga;
    private String deskripsiMinuman;
    private boolean isAvailable;
    private int stokMinuman;

    /**
     *
     * @param Minuman
     * @param harga
     * @param deskripsiMinuman
     * @param isAvailable
     * @param stokMinuman
     */
    public MenuMinuman(String Minuman, int harga, String deskripsiMinuman, boolean isAvailable, int stokMinuman) {
        this.minuman = Minuman;
        this.harga = harga;

        this.deskripsiMinuman = deskripsiMinuman;
        this.isAvailable = isAvailable;
        this.stokMinuman = stokMinuman;
    }

    public void tampilkanMenu() {
        System.out.println("Nama Minuman: " + minuman);
        System.out.println("Harga Minuman: " + harga);
        System.out.println("Deskripsi Minuman: " + deskripsiMinuman);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
        System.out.println("Stok Minuman: " + stokMinuman);
    }

    public void updateStok(int jumlahStok) {
        stokMinuman += jumlahStok;
    }

    public void setAvailability(boolean availability) {
        isAvailable = availability;
    }

    public static void main(String[] args) {
        MenuMinuman minuman1 = new MenuMinuman("Es Teh", 5000, "Es teh yang segar dan nikmat", true, 10);
        MenuMinuman minuman2 = new MenuMinuman("Kopi", 3000, "Kopi yang kuat dan nikmat", false, 5);

        minuman1.tampilkanMenu();
        minuman2.tampilkanMenu();

        minuman1.updateStok(5);
        minuman2.setAvailability(true);

        minuman1.tampilkanMenu();
        minuman2.tampilkanMenu();
    }
}