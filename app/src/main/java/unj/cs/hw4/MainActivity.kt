package unj.cs.hw4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val coffeelist = listOf<Coffee>(
            Coffee(
                R.drawable.kopi1,
                "Americano",
                "Americano terdiri dari satu shot espresso yang dituangkan dalam cangkir berukuran 178 mililiter.",
                "Americano terdiri dari satu shot espresso yang dituangkan dalam cangkir berukuran 178 mililiter yang dicampur dengan air panas hingga memenuhi gelas. Jenis lainnya adalah doppio, yakni segelas Americano dengan dua shot espresso. Minuman ini kerap disajikan dalam panas maupun dingin yang disebut iced Americano."
            ),
            Coffee(
                R.drawable.kopi2,
                "Affogato",
                "Affogato terdiri dari es krim vanila yang dituang espresso shot dan perlahan meleleh.",
                "Affogato terdiri dari es krim vanila yang dituang espresso shot dan perlahan meleleh. Paduan pahitnya kopi hitam dan es krim yang manis dan lembut menciptakan sensasi rasa menyenangkan."
            ),
            Coffee(
                R.drawable.kopi3,
                "Cappucino",
                "Cappucino terdiri dari espresso dan steamed milk dengan rasio 1:1.",
                "Cappucino terdiri dari espresso dan steamed milk dengan rasio 1:1. Cappuccino adalah olahan espresso yang paling banyak digemari, terutama bagi penikmat kopi dengan rasa lebih mild. Namun, ada juga yang memakai perbandingan 1/3 espresso, 1/3 steamed milk, dan 1/3 susu foam. Biasanya disajikan dalam cangkir berkapasitas 88 mililiter hingga 177 mililiter."
            ),
            Coffee(
                R.drawable.kopi4,
                "Cortado",
                "Cortado terdiri dari perbandingan espresso dan steamed milk cortado biasanya 1:1.",
                "Cortado terdiri dari perbandingan espresso dan steamed milk cortado biasanya 1:1. Dalam bahasa Spanyol, cotardo artinya memotong. Banyak orang yang menyamakan cortado dengan macchiato karena komposisinya mirip, meski di sejumlah tempat ada yang memakai rasio 1:2. "
            ),
            Coffee(
                R.drawable.kopi5,
                "Espresso",
                "Espresso terdiri dari crema dan liquid, dan lapisan lain yang terlihat dari espresso glass.",
                "Espresso terdiri dari crema dan liquid, dan lapisan lain yang terlihat dari espresso glass. Minuman kopi paling dasar ini biasanya disajikan dalam demitasse alias cangkir khusus espresso berukuran 30 mililiter (satu shot) sampai 118 mililiter. Espresso bertekstur pekat dan pahit, dengan buih putih alias crema di atasnya yang terbentuk dari tekanan minyak dalam bijih kopi."
            ),
            Coffee(
                R.drawable.kopi6,
                "Flat White",
                "Flat white terdiri dari 60 mililiter textured milk alias gelembung yang terbentuk saat susu dipanaskan.",
                "Flat white terdiri dari 60 mililiter textured milk alias gelembung yang terbentuk saat susu dipanaskan. Kemudian dua shot espresso dituang di atasnya dan dicampur menjadi satu. Ada yang menyebut kalau flat white termasuk latte, sebagian beranggapan kalau ini merupakan cappuccino tanpa foam."
            ),
            Coffee(
                R.drawable.kopi7,
                "Latte",
                "Latte terdiri dari perbandingan espresso dan susu 2:1 terdapat latte art di atasnya.",
                "Latte terdiri dari perbandingan espresso dan susu 2:1 terdapat latte art di atasnya. Perlu diingat, latte dan cappuccino adalah dua jenis racikan berbeda. Demikian dengan komposisi dan rasio bahannya. Selain rasanya nikmat, latte biasanya disajikan dalam cangkir dengan motif indah di atasnya."
            ),
            Coffee(
                R.drawable.kopi8,
                "Moccacino",
                "Moccacino terdiri dari Espresso, susu, dan cokelat yang merupakan paduan ideal.",
                "Moccacino terdiri dari Espresso, susu, dan cokelat yang merupakan paduan ideal. Dibanding kopi, lembutnya cokelat dan susu lebih mendominasi. Biasanya minuman ini menggunakan cokelat bubuk untuk campuran dan garnish, tapi ada juga yang memakai sirup cokelat di atasnya."
            ),
            Coffee(
                R.drawable.kopi9,
                "Macchiato",
                "Macchiato terdiri dari rasio steamed milk yang lebih besar dari espresso, ada sentuhan milky dan gurih.",
                "Macchiato terdiri dari rasio steamed milk yang lebih besar dari espresso, ada sentuhan milky dan gurih. Biasanya semua olahan kopi di coffee shop autentik tidak menambahkan pemanis, tapi kamu bisa meminta barista untuk menyertakan gula dalam minumanmu."
            ),
            Coffee(
                R.drawable.kopi10,
                "Ristretto",
                "Ristretto terdiri dari takaran air yang lebih sedikit, waktu pressnya sama dengan espresso.",
                "Ristretto terdiri dari takaran air yang lebih sedikit, waktu pressnya sama dengan espresso. Dalam bahasa Italia, ristretto berarti terbatas atau terlarang. Serupa dengan espresso, hanya saja takaran air dalam minuman ini lebih sedikit. Namun, waktu press dalam pembuatan ristretto sama dengan espresso."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager (this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = CoffeeAdapter(this, coffeelist){
            val intent = Intent (this, CoffeeDetail::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}