Algorithm to get ticket travel
//Start
1 Start the Algorithm
// var book, var sk, var shf, var pil, var trf
2 Inp Asal
3 Inp Tujuan
4 Inp Tgl (Cek Tgl>=Hari ini)
5 Desc Tgl1(Senin-Jumat), Tgl2(Sabtu-Minggu)
6 Inp Num
7 Proc Cek
	Proc CekJarak
		#Jrk = Tujuan - Asal
	Proc CekHarga
		//Hrg awal*per kilo
		#Hrg = Jrk*Hrg ==> Wkt[]
	Proc CekShift
		22, 20, 18, 16, [14, 12, 10], 8, 6, 4 <=== 10shf@hari
		for (j=4, j<24, j=j+2){
		10xshf * 20kursi
		}
	Proc CekKouta
		sk = (20-booking)-Num
			 (20-15)-3 = 2 True
		if(sk>0){
			Dis Shift[i] = block;
		}else{
			Dis Shift[i] = none;
		}
8 Inp Pil
7 While Num (i<count(Num))
8 Start While Num
9 Inp Data (NamaLkp, NamaPgl, NIK, JK, Umur, Alamat, Telp)
10 End While Num
11 Proc Byr
		Pros TByr = Jrk*Hrg*Num
		//Hrg total
		Proc CByr
12 Dis Hit
13 Proc Detail
14 Inp Submit
15 Proc Byr
		Trf>Hrg
		//selama wkt tenggang
16 Proc Tiket
		Dis Berhasil
			Book ++
		Dis Tiket
17 End the Algorithm
//End



// DFTR KOTA
1 Serang 06º 08’ LS 106º 09’ BT
2 Jakarta 06º 10’ LS 106º 49’ BT
3 Depok 06º 26’ LS 106º 48’ BT
4 Bogor 06º 37’ LS 106º 48’ BT
5 Bandung 06º 57’ LS 107º 37’ BT
6 Cirebon 06º 45’ LS 108º 33’ BT
7 Yogya 07º 48’ LS 110º 21’ BT
8 Solo 07º 35’ LS 110º 48’ BT
9 Surabaya 07º 15’ LS 112º 45’ BT
10 Malang 07º 59’ LS 112º 36’ BT

//KETENTUAN
1 derajat bujur/lintang = 111,322 km (diambil garis terpanjang yaitu equator)
1 derajat bujur/lintang = 60' (menit) = 3600" (detik)
1 menit bujur/lintang = 60" (detik)
1 menit bujut/lintang = 1.885,37 meter
1 detik bujut/lintang = 30, 9227 meter


Jakarta, Yogya, Bandung, Cirebon, Sby


Jika A (Jakarta) + B (Cirebon) == Jakarta-Cirebon --> Maka Jrk = Tem[0][3]