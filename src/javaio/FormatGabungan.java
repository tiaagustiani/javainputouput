package javaio;

import java.util.Date;
class FormatGabungan{
	public static void main(String args[])
	{
		String teks = "Jumlah Mahasiswa :";
		int jml = 20;
		Date tgl = new Date();
		System.out.printf("Tampilkan %S %d per %td %<tB %<tY %<tH:%<tm:%<tS WIB", teks,jml,tgl);
	} // teks,jml,tgl urutan harus sama jg susunannya
}