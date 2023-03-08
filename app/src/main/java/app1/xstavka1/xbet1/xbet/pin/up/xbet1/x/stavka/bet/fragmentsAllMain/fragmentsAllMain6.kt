package app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.fragmentsAllMain

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.databinding.Fragmentsallmain6Binding


class fragmentsAllMain6 : Fragment() {

    private var fragmentsAllMain6: Fragmentsallmain6Binding? = null
    private val fragmentsAllMain get() = fragmentsAllMain6!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentsAllMain6 = Fragmentsallmain6Binding.inflate(inflater,container,false)
        return fragmentsAllMain?.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        numfun5()
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

    private fun numfun5() {
        fragmentsAllMain.onewinsbk1TXT.setOnClickListener {
            Toast.makeText(context, "Читай text", Toast.LENGTH_SHORT).show()
        }
    }

}
