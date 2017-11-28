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

Fitur : Pengecekan Saldo
        PengecekanSaldo

        @Berhasil
	Skenario: Memasukkan pilihan menu pengecekan saldo
		Dengan pilihan menu Pengecekan Saldo maka sistem akan mengecek tabungan nasabah
		Ketika memilih menu pengecekan saldo
		Maka respon "Menampilkan informasi Saldo"

Fitur : Penarikan Tunai
        PenarikanTunai

        @Berhasil
	Skenario: Memasukkan Nominal
		Dengan Nominal yang dimasukkan nasabah dan akan dilakukan validasi oleh sistem
		Ketika Nominal yang dimasukkan lebih kecil sama dengan dari saldo nasabah
		Maka respon "Penarikan berhasil"

        @Gagal
        Skenario: Memasukan Nominal
		Dengan Nominal yang dimasukkan nasabah dan akan dilakukan validasi oleh sistem
		Ketika Nominal yang dimasukkan lebih besar dari saldo nasabah
		Maka respon gagal dengan pesan "Saldo tidak mencukupi"
