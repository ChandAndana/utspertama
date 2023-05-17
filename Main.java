import pengguna.Mhs;

class Main {
    public static void main(String[] args) {

        Mhs mhs = new Mhs("Ini_Username", "Ini_Password", "Chandra Adhikara Andana", "G.111.19.0008", 8);

        // mhs.setNama("Mohamad Sigit Riyanto");
        // mhs.setNim("G.111.19.0011");
        // mhs.setSmt(8);

        System.out.println("Nama Mhs : " + mhs.getNama());
        System.out.println("Nim Mhs : " + mhs.getNim());
        System.out.println("Smt Mhs : " + mhs.getSmt());
        System.out.println("Username : " + mhs.getUsername());
        System.out.println("Password : " + mhs.getPassword());

    }
}