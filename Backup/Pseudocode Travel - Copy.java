<-- Pseudocode Travel -->

begin
numeric booking, a=0, b=1 nNum
Dis[], Jad[], Sk[], Id[]

	begin
		call procedure Asal
	end
	begin
		call procedure Tujuan
	end

accept dTgl, cDay
if (cDay>today)
	begin
		display ‘Tdk bisa memesan tgl yg sdh berlalu’
	end
else
	begin
		accept nNum
		call procedure Cek
		accept nPil
		nNumP=0, p=0
		for(nNumP=0; nNumP<=count(nNum); nNumP=nNumP+1)
			begin
				display 'Nama			:' accept cNam
				display 'panggilan		:' accept cPgl
				display 'NIK 			:' accept nNIK
				display 'Jenis Kelamin	:' accept cJK
				display 'Umur			:' accept nUm
				display 'Alamat			:' accept cAlmt
				display 'No. Telepon	:' accept nTelp
				if (nNIK>=0 || nUm>=0 || nTelp>=0)
				begin
					?????? display 'Tdk blh negatif!'
				end
				Id[p] = {cNam, cPgl, nNIK, cJK, nUm, cAlmt, nTelp}
				p = p + 1
				nNumP = nNumP + 1
			end

		begin
		call procedure Detail
		call procedure Bayar
		call procedure Booking
	end

//Procedure
	function Asal
	begin
		display '
		1. Serang	      |	 6. Cirebon
     	2. Jakarta	      |	 7. Yogyakarta
     	3. Depok	      |	 8. Solo
     	4. Bogor	      |	 9. Surabaya
     	5. Bandung        | 10. Malang '
		accept cAsal
		switch(cAsal)
		begin
			case 'Serang':
				a = 0
			break
			case 'Jakarta':
				a = 1
			break
			case 'Depok':
				a = 2
			break
			case 'Bogor':
				a = 3
			break
			case 'Bandung':
				a = 4
			break
			case 'Cirebon':
				a = 5
			break
			case 'Yogyakarta':
				a = 6
			break
			case 'Solo':
				a = 7
			break
			case 'Surabaya':
				a = 8
			break
			case 'Malang':
				a = 9
			break
			default ???? display 'Kota asal Anda tidak ada di daftar pilihan!'
		end
	end
	return

	function Tujuan
	begin	
		accept cTujuan
		switch(cTujuan)
		begin
			case 'Serang':
				b = 0
			break
			case 'Jakarta':
				b = 1
			break
			case 'Depok':
				b = 2
			break
			case 'Bogor':
				b = 3
			break
			case 'Bandung':
				b = 4
			break
			case 'Cirebon':
				b = 5
			break
			case 'Yogyakarta':
				b = 6
			break
			case 'Solo':
				b = 7
			break
			case 'Surabaya':
				b = 8
			break
			case 'Malang':
				b = 9
			break
			default ????? display 'Kota asal Anda tidak ada di daftar pilihan!'
		end	
	end
	return

	function Cek
	begin
		numeric Counter, i, h, nNum
		Dis[]. Jad[], Hrg[], Sk[]
		call procedure CekJrk
		call procedure CekHrg
		call procedure CekJadwal
		call procedure CekKursi
		i = 0
		while (i<10)
		begin
			if (Sk[i]<=0)
			begin
				display Dis[i] = 'Mohon maaf sisa kursi habis'
			end
			else
			begin
				display Dis[i] = ' Jadwal 		: ' + Jad[j] +
				              	 ' Harga 		: ' + Hrg[h} + 
              					 ' Sisa Kursi 	: ' + Sk[i]
			end
			i = i + 1
		end
	end
	return

	function Detail
	begin
		i = nPil-1
    	Display ' Detail Pemesanan Anda' +
    			' Travel pejalanan dari ' + cAsal + ' ke ' + cTujuan +    
    			' Info perjalanan ' +
    			 Dis[i]
    	for (p=0; p<count(nNum); p=p+1)
    	begin
    		Display  ' Data Penumpang ' +
               		 ' Nama 			: ' + Id[p][0] + 
               		 ' Panggilan  		: ' + Id[p]1] + 
               		 ' NIK 				: ' + Id[p][2] + 
               		 ' Jenis Kelamin 	: ' + Id[p][3] + 
               		 ' Umur 			: ' + Id[p][4] + 
               		 ' Alamat 			: ' + Id[p][5] + 
               		 ' No Telp 			: ' + Id[p][6] 
    		p = p+1
    	end
    	Display ' Mohon konfirmasinya, Apakah data pemesanan tersebut sudah benar? 
				  Dengan mengetik Yes / No!'
		accept cKonfir
		switch(cKonfir) ?????/ ---> Kalau No kemana?
		begin
			case 'y':
				b = 0
			break
			case 'Y':
				b = 1
			break
			case 'yes':
				b = 2
			break
			case 'Yes':
				b = 3
			break
			case 'YES':
				b = 4
			break
			case 'n':
				b = 5
			break
			case 'N':
				b = 6
			break
			case 'no':
				b = 7
			break
			case 'No':
				b = 8
			break
			case 'No':
				b = 9
			break
			default: ????
		end	
	end
	return

	function Bayar
	begin
	
	end
	return

	function Booking
	begin
	
	end
	return

	Julius Danes Nugroho

//Sub Procedure
	function CekJrk
	begin
		Tem[10]={
			Tem[5] = {'Serang', 6, 8, 106, 9},
  			Tem[5] = {'Jakarta', 6, 10,106,49},
  			Tem[5] = {'Depok', 6, 26, 106, 48},
  			Tem[5] = {'Bogor', 6, 37, 106, 48},
  			Tem[5] = {'Bandung', 6, 57, 107, 37},
		}
		Lin
	end
	return

	function CekJrk
	begin
		
	end
	return

	function CekJrk
	begin
		
	end
	return

	function CekJrk
	begin
		
	end
	return

end