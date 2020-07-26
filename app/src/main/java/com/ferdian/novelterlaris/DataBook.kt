package com.ferdian.novelterlaris

object DataBook {
    private val bookPengarang = arrayOf(
        "Tere Liye",
        "Brian Khrisna",
        "Andrea Hirata",
        "Kevin Kwan",
        "Pramoedya Ananta Toer",
        "Haruki Murakami",
        "Triskaidekaman",
        "Rachael Lippincitt, Mikki Daughtry, Tobias Laconis",
        "Alffy Rev",
        "Kelly Barnhill"
    )

    private val bookJudul = arrayOf(
        "Komet Minor",
        "This is Why I Need You",
        "Orang-orang Biasa",
        "Rich People Problem",
        "Bumi Manusia",
        "Norwegian Wood",
        "Cara berbahagia Tanpa Kepala",
        "Satu Setengah Meter(Five Feet Apart)",
        "Senja Dan Pagi",
        "The Girl Who Drank The Moon"
    )

    private val bookTahun = arrayOf(
        "2019",
        "2019",
        "2019",
        "2017",
        "2005",
        "2000",
        "2019",
        "2019",
        "2020",
        "2016"
    )

    private val bookDetail = arrayOf(
        "Tere Liye kembali merilis buku terbarunya pada Maret 2019 lalu. Kali ini berjudul Komet Minor, yang merupakan buku bungsu dari Seri Bumi. Seri yang menceritakan tiga sahabat remaja, Ali, Raib dan Seli yang bertualang ke negeri paralel dan harus menghadapi tokoh antagonis, Si Tanpa Mahkota.\n Buku Komet Minor adalah buku keenam, dan penutup kisah Ali, Raib dan Seli melawan Si Tanpa Mahkota. Lima buku sebelumnya yang juga masih dari Seri Bumi, berjudul Bumi, Bulan, Matahari, Bintang, Ceros dan Batozar dan juga Komet.",
        "Apa jadinya jika seorang mahasiswa, dengan badan atletis tinggi besar, harus tinggal di kos-kosan putri? Belum lagi, profesi sampingannya sebagai bartender di salah satu toko alcohol di bandung, sangat bertolak belakang dengan jabatannya di sebuah organisasi Kekeluargaan Masjid di kampus. Novel ini merupakan novel yang sangat laris dipasaran",
        "Sebatang kapur dan penghapus tergeletak di bawah papan tulis itu. Tampak benar telah sangat lama tak dipakai. Demikian minim angka-angka itu sehingga tak bisa dijadikan diagram batang, diagram kue cucur atau diagram naik-naik ke puncak bukit. Rupanya di kota ini, penduduknya telah lupa cara berbuat jahat.",
        "Kevin Kwan, bestselling author of Crazy Rich Asians and China Rich Girlfriend, is back with an uproarious new novel featuring a family driven by fortune, an ex-wife driven psychotic with jealousy, a battle royal fought through couture-gown sabotage, and the heir to one of Asia's greatest fortunes locked out of his inheritance.",
        "Roman Tetralogi Buru mengambil latar belakang dan cikal bakal nation Indonesia di awal abad ke-20. Dengan membacanya waktu kita dibalikkan sedemikian rupa dan hidup di era membibitnya pergerakan nasional mula-mula, juga pertautan rasa, kegamangan jiwa, percintaan, dan pertarungan kekuatan anonim para srikandi yang mengawal penyemaian bangunan nasional yang kemudian kelak melahirkan Indonesia modern.",
        "Toru, a quiet and preternaturally serious young college student in Tokyo, is devoted to Naoko, a beautiful and introspective young woman, but their mutual passion is marked by the tragic death of their best friend years before. Toru begins to adapt to campus life and the loneliness and isolation he faces there, but Naoko finds the pressures and responsibilities of life unbearable. As she retreats further into her own world, Toru finds himself reaching out to others and drawn to a fiercely independent and sexually liberated young woman.",
        "Uang takkan pernah cukup. Waktu selalu saja lebih sempit daripada celana. Tubuh kita fana. Bagaimana solusinya? Tebang masalahmu, Bebaskan Kepalamu.",
        "Bisakah kau mencintai seseorang yang tidak bisa kausentuh? Stella Grant suka memegang kendali. Hanya satu yang tak bisa dia kendalikan, yaitu penyakit fibrosis kistik yang membuatnya keluar masuk rumah sakit. Pada titik tersebut, yang harus Stella lakukan adalah menjauhkan diri dari siapa pun atau apa pun yang mungkin bisa menularkan infeksi dan menggagalkan transplantasi paru-paru. Terpisah dua meter. Tidak ada perkecualian.",
        "Novel ini diangkat dari kisah nyata penulis yaitu Alffy dan Linka. Novel ini menceritakan tentang perjalanan cinta mereka yang di awali dengan pertemuan  dua pribadi yang berbeda namun memiliki mimpi yang sama.",
        "Every year, the people of the Protectorate leave a baby as an offering to the witch who lives in the forest. They hope this sacrifice will keep her from terrorizing their town. But the witch in the forest, Xan, is kind and gentle. She shares her home with a wise Swamp Monster named Glerk and a Perfectly Tiny Dragon, Fyrian. Xan rescues the abandoned children and deliver them to welcoming families on the other side of the forest, nourishing the babies with starlight on the journey. "
    )

    private val bookImage = intArrayOf(
        R.drawable.komet_minor,
        R.drawable.this_is_why_i_need_you,
        R.drawable.orang_biasa,
        R.drawable.rich_people_problem,
        R.drawable.bumi_manusia,
        R.drawable.norwegian_wood,
        R.drawable.cara_bahagia_tanpa_kepala,
        R.drawable.five_feet_apart,
        R.drawable.senja_dan_pagi,
        R.drawable.the_girl_who_drank
    )

    val listData: ArrayList<Book>
        get() {
            val list = arrayListOf<Book>()
            for(position in bookPengarang.indices) {
                val book = Book()
                book.pengarang = bookPengarang[position]
                book.judul = bookJudul[position]
                book.tahunRilis = bookTahun[position]
                book.detail = bookDetail[position]
                book.image = bookImage[position]

                list.add(book)
            }

            return list
        }
}