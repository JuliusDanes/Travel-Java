<-- Pseudocode Java Travel -->

begin 
	begin
	character Asal, Tujuan, Day
	numeric Menu, Num, p, i, h, Hrg, HrgDD,  
	Db[], Dis[], Jad[], Hrg[], Sk[], Id[]

	call procedure Main_Menu
	call procedure Asal
	call procedure Tujuan

	if(cAsal == cTujuan)
	begin
		display 'Tdk bisa memilih tempat Asal & Tujuan yg Sama!'
		call procedure Asal
	end

	Accept dTgl, cDay
	if (dTgl<today()) //function get data type date & day system
	begin
		display 'Tdk bisa memesan tgl yg sdh berlalu!'
		return Accept dTgl, cDay
	end
	else
	begin
		Accept nNum
		call procedure Cek

		display 'Pilih no jadwal yg tersedia!'
		Accept nPil

		nNumP=0, p=0
		for(nNumP=0; nNumP<count(nNum); nNumP=nNumP+1)
		begin
			display 'Nama			:' Accept cNam
			display 'panggilan		:' Accept cPgl
			display 'NIK 			:' Accept nNIK
			display 'Jenis Kelamin	:' Accept cJK
			display 'Umur			:' Accept nUm
			display 'Alamat			:' Accept cAlmt
			display 'No. Telepon	:' Accept nTelp

			if (nNIK>=0 || nUm>=0 || nTelp>=0)
			begin
			display 'Tdk blh negatif!'
			return
			end

			Id[p] = {cNam, cPgl, nNIK, cJK, nUm, cAlmt, nTelp}			
			if (p>0)
			begin							
				if (Id[p][2] == Id[p-1][2])
				begin
					display 'Tdk blh memasukkan NIK yg sama!'
					return Accept nNIK
				end
			end
			p = p + 1
			nNumP = nNumP + 1
		end
			
		call procedure Detail
		call procedure Bayar
	end
	end


//Procedure
	procedure Main_Menu
	begin
		numeric Menu
		Display 'Welcome to Java Travel' + 
							 'Main Menu' +

				'1] Pesan Tiket
				 2] Reset Database
				 3] Exit'
		Accept nMenu
		switch(nMenu)
		begin
			case 1:
				return
				break
			case 2:
				Db[10] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
				call procedure Main_Menu
				break
			case 3:
				stop() //Terminate / close system
				break
			default:
				display 'Mohon pilih no menu yang ada!'
				call procedure Main_Menu
		end
	end
	return

	procedure Asal
	begin
		Display '
		Pilih kota asal Anda!
          1. Jakarta
          2. Bandung
          3. Cirebon
          4. Yogyakarta
          5. Surabaya
          '
		Accept cAsal
  		if (cAsal != 'Jakarta' or 'Bandung' or 'Cirebon' or 'Yogyakarta' or 'Surabaya')
  		begin
  			display 'Kota asal Anda tidak ada di daftar pilihan!'
  			return Accept cAsal
  		end
  		else
  		begin
  			return 
  		end
	end
	return

	procedure Tujuan
	begin
		Display '
		Pilih kota tujuan Anda!
          1. Jakarta
          2. Bandung
          3. Cirebon
          4. Yogyakarta
          5. Surabaya
          '	
		Accept cTujuan
		if (cTujuan != 'Jakarta' or 'Bandung' or 'Cirebon' or 'Yogyakarta' or 'Surabaya')
  		begin  			
  			display 'Kota tujuan Anda tidak ada di daftar pilihan!'
  			return Accept cTujuan
  		end
  		else
  		begin
  			return
  		end
	end
	return

	procedure Cek
	begin
		numeric Counter, i, h, Jrk 
		Dis[], Jad[], Tem[], Hrg[], Sk[]

		call procedure CekJrk
		call procedure CekJadwal
		call procedure CekHrg
		call procedure CekKursi

		i = 0
		while (i<10)
		begin
			if (Jad[i][0]>=10 && Jad[i][0]<=14) 
			begin
				h = 1
			end
			else
			begin
				h = 0
			end

			if (Sk[i]<0)
			begin
				Dis[i] = {'Mohon maaf sisa kursi habis'}
			end
			else
			begin
				Dis[i] = {' Jadwal 		: ' + Jad[i] +
            		 	  ' Harga		: ' + Hrg[h} + 
            			  ' Sisa Kursi 	: ' + Sk[i]}
			end
			display (i+1) + Dis[i]

			i = i + 1
		end
	end
	return

	procedure Detail
	begin
		i = nPil - 1
    	Display ' Detail Pemesanan Anda' +
    			' Travel pejalanan dari ' + cAsal + ' ke ' + cTujuan + 
    			' Keberangkatan pada ' + cDay + ', ' + dTgl +

    			' Info perjalanan ' +
    			Dis[i]

    	for (p=0; p<count(nNum); p=p+1)
    	begin
    		Display  ' Data Penumpang ' +
               		 ' Nama 			: ' + Id[p][0] + 
               		 ' Panggilan  		: ' + Id[p][1] + 
               		 ' NIK 				: ' + Id[p][2] + 
               		 ' Jenis Kelamin 	: ' + Id[p][3] + 
               		 ' Umur 			: ' + Id[p][4] + 
               		 ' Alamat 			: ' + Id[p][5] + 
               		 ' No Telp 			: ' + Id[p][6] 
    	end
	end
	return

	procedure Bayar
	begin
		numeric Byr, Kem, Hrg[]
		display 'Total biaya yang harus dibayar!' + 
				'Rp'+ Hrg[h] + ',-'
		display 'Masukkan uang yg Anda berikan!'
		Accept nByr
		nKem = nByr - Hrg[h]
		if (nKem>=0)
		begin		
			Db[i] = Db[i] + nNum
			display 'Uang kembalian Anda!'
					'Rp'+ nKem + ',-'
			display 'Thanks for Your Order and Thanks for Trust used to Java Travel :)'
			return
		end
		else
		begin
			display 'Mohon maaf pembayaran Anda tidak mencukupi.'
					'Silahkan tambah nominal pembayaran!'
			return Accept nByr
		end		
	end
	return


//Sub Procedure
	procedure CekJrk
	begin
		Tem[20] = {
			Tem[2] = {'Jakarta-Bandung', 150},
			Tem[2] = {'Jakarta-Cirebon', 220},
			Tem[2] = {'Jakarta-Yogyakarta', 525},
			Tem[2] = {'Jakarta-Surabaya', 760},
			Tem[2] = {'Bandung-Jakarta', 150},
			Tem[2] = {'Bandung-Cirebon', 215},
			Tem[2] = {'Bandung-Yogyakarta', 450},
			Tem[2] = {'Bandung-Surabaya', 685},
			Tem[2] = {'Cirebon-Jakarta', 220},
			Tem[2] = {'Cirebon-Bandung', 215},
			Tem[2] = {'Cirebon-Yogyakarta', 315},
			Tem[2] = {'Cirebon-Surabaya', 550},
			Tem[2] = {'Yogyakarta-Jakarta', 525},
			Tem[2] = {'Yogyakarta-Bandung', 450},
			Tem[2] = {'Yogyakarta-Cirebon', 315},
			Tem[2] = {'Yogyakarta-Surabaya', 330},
			Tem[2] = {'Surabaya-Jakarta', 760},
			Tem[2] = {'Surabaya-Bandung', 685},
			Tem[2] = {'Surabaya-Cirebon', 550},
			Tem[2] = {'Surabaya-Yogyakarta', 330}
		}

		switch (cAsal + '-' + cTujuan)
		begin
			case 'Jakarta-Bandung':
				nJrk = Tem[0][1]
				break
			case 'Jakarta-Cirebon':
				nJrk = Tem[1][1]
				break
			case 'Jakarta-Yogyakarta':
				nJrk = Tem[2][1]
				break
			case 'Jakarta-Surabaya':
				nJrk = Tem[3][1]
				break
			case 'Bandung-Surabaya':
				nJrk = Tem[4][1]
				break
			case 'Bandung-Cirebon':
				nJrk = Tem[5][1]
				break
			case 'Bandung-Yogyakarta':
				nJrk = Tem[6][1]
				break
			case 'Bandung-Surabaya':
				nJrk = Tem[7][1]
				break
			case 'Cirebon-Jakarta':
				nJrk = Tem[8][1]
				break
			case 'Cirebon-Bandung':
				nJrk = Tem[9][1]
				break
			case 'Cirebon-Yogyakarta':
				nJrk = Tem[10][1]
				break
			case 'Cirebon-Surabaya':
				nJrk = Tem[11][1]
				break
			case 'Yogyakarta-Jakarta':
				nJrk = Tem[12][1]
				break
			case 'Yogyakarta-Bandung':
				nJrk = Tem[13][1]
				break;
			case 'Yogyakarta-Cirebon':
				nJrk = Tem[14][1]
				break
			case 'Yogyakarta-Surabaya':
				nJrk = Tem[15][1]
				break
			case 'Surabaya-Jakarta':
				nJrk = Tem[16][1]
				break
			case 'Surabaya-Bandung':
				nJrk = Tem[17][1]
				break
			case 'Surabaya-Cirebon':
				nJrk = Tem[18][1]
				break
			case 'Surabaya-Yogyakarta':
				nJrk = Tem[19][1]
				break
			default :
				return call procedure CekJrk
		end
		return
	end
	return

	procedure CekJadwal
	begin
		nCounter=4,
		for (i=0; i<10; i=i+1)
		begin
			if (nCounter>=0 && nCounter<=9) 
			begin
				Jad[i] = {
					Jad[2] = {nCounter, '0' + nCounter + '.00'}
				}
			end
			else
			begin				
				Jad[i] = {
					Jad[2] = {nCounter, nCounter + '.00'}
				}
			end
			nCounter = nCounter + 2
		end
		return
	end
	return

	procedure CekHrg
	begin
		nHrg = 1000, Hrg[]
		nHrg = nHrg*nJrk
		if (cDay == 'Sabtu' || 'Minggu') 
		begin
			//calculate discount 10%
			nHrg = 0.9*nHrg
		end
		//calculate discount 10%
		nHrgDD = 0.9*nHrg
		Hrg[1] = {nHrg, nHrgDD}
		return
		else
		begin
			return call procedure CekHrg
		end
	end
	return

	procedure CekKursi
	begin
		for (i=0; i<10; i=i+1)
		begin
			Sk[i] = (20 - Db[i]) - nNum
		end
		return
	end
	return

end