# language: id

Fitur: Login
	Login

	@Berhasil
	Skenario: Memasukkan PIN
		Dengan PIN yang akan dimasukkan nasabah dan akan dilakukan validasi oleh sistem
		Ketika Memasukan PIN yang valid
		Maka respon "Login sukses"

        @Gagal
        Skenario: Memasukan PIN 
		Dengan PIN yang akan dimasukkan nasabah dan akan dilakukan validasi oleh sistem
		Ketika Memasukan PIN yang tidak valid
		Maka respon gagal dengan pesan "Login gagal"

Fitur : Transfer
        
        @Berhasil
        Skenario: Memasukkan Nomor Rekening Tujuan
                Dengan nomor rekening tujuan yang akan dimasukkan nasabah dan akan dilakukan validasi oleh sistem
                Ketika memasukkan nomor rekening tujuan yang valid
                Maka respon "Transfer sukses"