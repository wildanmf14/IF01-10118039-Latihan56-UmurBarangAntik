
public class Main {

	public static void main(String[] args) {
        BarangAntik rd;

        rd = new Radio(234);
        ((Radio) rd).setName("Radio AM");

        System.out.printf("Nama barang Antik\t\t: %s%n", ((Radio) rd).getName());
        ((Radio) rd).tampilUmur();
	}

}
