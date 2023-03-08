package app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.databinding.CalcMainProjectBinding

class calc_main_project : AppCompatActivity() {
    lateinit var calc_main_project_bind: CalcMainProjectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        calc_main_project_bind= CalcMainProjectBinding.inflate(layoutInflater)
        setContentView(calc_main_project_bind.root)
        calc_main_project_bind.calcMainProject01sumRezults.setOnClickListener {
            var calcproject = calc_main_project_bind.calcMainProject01edittext1.text.toString()
            var calcproject2 = calc_main_project_bind.calcMainProject01KoifWinner.text.toString()
            if(calcproject.length == 0 && calcproject2.length == 0){

                Toast.makeText(this, "Check number", Toast.LENGTH_SHORT).show()
            }
            else{

                var calcprojectres = (calcproject.toInt()*calcproject2.toInt())
                calc_main_project_bind.calcMainProject01winTXTsum.text = calcprojectres.toString()

            }

        }
        numfun1(numfun1 = 0)
        numfun2()
        numfun3()

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


