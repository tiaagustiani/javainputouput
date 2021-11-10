package javaio;

import java.util.Date;
class FormatTanggal{
	public static void main(String args[])
	{
		Date tanggal = new Date();
		System.out.println(tanggal);
		System.out.printf("Cetak Tanggal : %td %<tB %<tY %<tH:%<tm:%<tS WIB", tanggal);
	} // tanggal=d  bulan=B  year=Y 
    	// (tanda < harus ada, untuk menampilkan waktu ini)
}
