package unj.cs.hw4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class CoffeeDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_coffee)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Detail Coffee"

        val coffee = intent.getParcelableExtra<Coffee>(MainActivity.INTENT_PARCELABLE)

        val imgCoffee = findViewById<ImageView>(R.id.img_item_photo)
        val nameCoffee = findViewById<TextView>(R.id.tv_item_name)
        val detCoffee = findViewById<TextView>(R.id.tv_item_detail)

        imgCoffee.setImageResource(coffee?.imgCoffee!!)
        nameCoffee.text = coffee.nameCoffee
        detCoffee.text = coffee.detCoffee
    }
}