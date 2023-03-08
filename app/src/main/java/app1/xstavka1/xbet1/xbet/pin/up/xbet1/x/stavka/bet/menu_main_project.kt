package app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet;

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.databinding.MenuMainProjectBinding

class menu_main_project : AppCompatActivity() {

    lateinit var menu_main_project: MenuMainProjectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        numfun1(numfun1 = 0)
        numfun2()
        numfun3()

        menu_main_project= MenuMainProjectBinding.inflate(layoutInflater)
        setContentView(menu_main_project.root)
        menu_main_project.nfibet304menupodrazdel1.setOnClickListener{
            (menu_main_project.nfibet304menucardrazdel1.layoutParams as LinearLayout.LayoutParams).weight=2f
            (menu_main_project.nfibet304menucardrazdel2.layoutParams as LinearLayout.LayoutParams).weight=1f
            menu_main_project.nfibet304menusocritie1.visibility= View.VISIBLE
            menu_main_project.nfibet304menusocritie2.visibility= View.GONE
            menu_main_project.nfibet304menubuttonOpen1.visibility= View.VISIBLE
            menu_main_project.nfibet304menubuttonOpen2.visibility= View.GONE
            make()
        }
        menu_main_project.nfibet304menucardrazdel2.setOnClickListener{
            (menu_main_project.nfibet304menucardrazdel2.layoutParams as LinearLayout.LayoutParams).weight=2f
            (menu_main_project.nfibet304menucardrazdel1.layoutParams as LinearLayout.LayoutParams).weight=1f
            menu_main_project.nfibet304menusocritie1.visibility= View.GONE
            menu_main_project.nfibet304menusocritie2.visibility= View.VISIBLE
            menu_main_project.nfibet304menubuttonOpen1.visibility= View.GONE
            menu_main_project.nfibet304menubuttonOpen2.visibility= View.VISIBLE
            make()
        }
        menu_main_project.nfibet304menucardrazdel3.setOnClickListener{
            (menu_main_project.nfibet304menucardrazdel3.layoutParams as LinearLayout.LayoutParams).weight=2f
            (menu_main_project.nfibet304menucardrazdel4.layoutParams as LinearLayout.LayoutParams).weight=1f
            menu_main_project.nfibet304menusocritie3.visibility= View.VISIBLE
            menu_main_project.nfibet304menusocritie4.visibility= View.GONE
            menu_main_project.nfibet304menubuttonOpen3.visibility= View.VISIBLE
            menu_main_project.nfibet304menubuttonOpen4.visibility= View.GONE
            make()
        }
        menu_main_project.nfibet304menucardrazdel4.setOnClickListener{
            (menu_main_project.nfibet304menucardrazdel4.layoutParams as LinearLayout.LayoutParams).weight=2f
            (menu_main_project.nfibet304menucardrazdel3.layoutParams as LinearLayout.LayoutParams).weight=1f
            menu_main_project.nfibet304menusocritie3.visibility= View.GONE
            menu_main_project.nfibet304menusocritie4.visibility= View.VISIBLE
            menu_main_project.nfibet304menubuttonOpen3.visibility= View.GONE
            menu_main_project.nfibet304menubuttonOpen4.visibility= View.VISIBLE
            make()
        }
        menu_main_project.nfibet304menucardrazdel5.setOnClickListener{
            (menu_main_project.nfibet304menucardrazdel5.layoutParams as LinearLayout.LayoutParams).weight=2f
            (menu_main_project.nfibet304menucardrazdel6.layoutParams as LinearLayout.LayoutParams).weight=1f
            menu_main_project.nfibet304menusocritie5.visibility= View.VISIBLE
            menu_main_project.nfibet304menusocritie6.visibility= View.GONE
            menu_main_project.nfibet304menubuttonOpen5.visibility= View.VISIBLE
            menu_main_project.nfibet304menubuttonOpen6.visibility= View.GONE
            make()
        }
        menu_main_project.nfibet304menucardrazdel6.setOnClickListener{
            (menu_main_project.nfibet304menucardrazdel6.layoutParams as LinearLayout.LayoutParams).weight=2f
            (menu_main_project.nfibet304menucardrazdel5.layoutParams as LinearLayout.LayoutParams).weight=1f
            menu_main_project.nfibet304menusocritie5.visibility= View.GONE
            menu_main_project.nfibet304menusocritie6.visibility= View.VISIBLE
            menu_main_project.nfibet304menubuttonOpen5.visibility= View.GONE
            menu_main_project.nfibet304menubuttonOpen6.visibility= View.VISIBLE
            make()
        }
        menu_main_project.nfibet304menubuttonOpen1.setOnClickListener {
            val intentnfibet3 = Intent(this@menu_main_project, calc_main_project::class.java)
            intentnfibet3.putExtra("position", 1)
            startActivity(intentnfibet3)
            make()
        }
        menu_main_project.nfibet304menubuttonOpen2.setOnClickListener {
            val intentnfibet3 = Intent(this@menu_main_project,listen_main_project::class.java)
            intentnfibet3.putExtra("position", 2)
            startActivity(intentnfibet3)
            make()
        }
        menu_main_project.nfibet304menubuttonOpen3.setOnClickListener {
            val intentnfibet3 = Intent(this@menu_main_project,listen_main_project::class.java)
            intentnfibet3.putExtra("position", 3)
            startActivity(intentnfibet3)
            make()
        }
        menu_main_project.nfibet304menubuttonOpen4.setOnClickListener {
            val intentnfibet3 = Intent(this@menu_main_project,listen_main_project::class.java)
            intentnfibet3.putExtra("position", 4)
            startActivity(intentnfibet3)
            make()
        }
        menu_main_project.nfibet304menubuttonOpen5.setOnClickListener {
            val intentnfibet3 = Intent(this@menu_main_project,listen_main_project::class.java)
            intentnfibet3.putExtra("position", 5)
            startActivity(intentnfibet3)
            make()
        }
        menu_main_project.nfibet304menubuttonOpen6.setOnClickListener {
            val intentnfibet3 = Intent(this@menu_main_project,listen_main_project::class.java)
            intentnfibet3.putExtra("position", 6)
            startActivity(intentnfibet3)
            make()
        }

    }

    private fun make() {
        Toast.makeText(this, "Press button", Toast.LENGTH_SHORT)
    }


private fun numfun3() {
    var numfun3 = (0..100).random()
    print(numfun3)
}

private fun numfun2() {
    var numfun1  = "приветгулигули"
    var numfun2 = "приветгулигули"
    var numfun3 = numfun1.length / numfun2.length
    print(numfun3.toDouble())
}

private fun numfun1(numfun1: Int) {
    var numfun1  = "приветгулигуливыфвыфвыфыфыфвыфыфввыфыфввыффывыыфвфы"
    var numfun2 = "приветгулигуливвфвыыфвввыфвыфвыфыф"
    val numfun3= numfun1.length * numfun2.length / 2
    print(numfun3)
}
}






