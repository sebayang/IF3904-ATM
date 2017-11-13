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

Fitur : Pengecekan Saldo
        PengecekanSaldo

        @Berhasil
	Skenario: Memasukkan pilihan menu pengecekan saldo
		Dengan pilihan menu Pengecekan Saldo maka sistem akan mengecek tabungan nasabah
		Ketika memilih menu pengecekan saldo
		Maka respon "Menampilkan informasi Saldo"