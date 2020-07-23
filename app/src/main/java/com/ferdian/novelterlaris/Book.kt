package com.ferdian.novelterlaris

object Book {
    private var data = arrayOf(
            arrayOf(
                    "Tere Liye",
                    "Komet Minor",
                    "2019",
                    "https://www.gramedia.com/blog/content/images/2019/06/komet-minor-tere-liye-1.jpg"
            ),
            arrayOf(
                    "Kevin Kwan",
                    "Rich People Problem",
                    "2017",
                    "https://www.gramedia.com/blog/content/images/2019/06/rich_people_problem.jpg"
            )
    )

    val listData: ArrayList<DataBook>
        get() {
            val list = ArrayList<DataBook>()
            for (x in data) {
                val dataBook = DataBook()
                dataBook.pengarang = x[0]
                dataBook.judul = x[1]
                dataBook.tahunRilis = x[2]
                dataBook.image = x[3]

                list.add(dataBook)
            }
            return list
        }
}

