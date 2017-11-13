# language: id

Fitur: Login
	Login

	@Normal
	Skenario: Memasukkan PIN
		Dengan PIN yang akan dimasukkan nasabah dan akan dilakukan validasi oleh sistem
		Ketika Memasukan PIN yang valid
		Maka respon "Login sukses"

        @Duplikat
        Skenario: Memasukan PIN 
		Dengan PIN yang akan dimasukkan nasabah dan akan dilakukan validasi oleh sistem
		Ketika Memasukan PIN yang tidak valid
		Maka respon gagal dengan pesan "Login gagal"
