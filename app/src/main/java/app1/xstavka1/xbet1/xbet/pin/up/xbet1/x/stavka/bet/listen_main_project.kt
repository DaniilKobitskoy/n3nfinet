package app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.adaptersMain.*
import app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.fragmentsAllMain.*
import app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.betcitysportFragments.fragmentsAllMain4
import app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.databinding.ListenMainProjectBinding
import app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.fragmentsAllMain.fragmentsAllMain3


class listen_main_project : AppCompatActivity() {
    lateinit var adaptersMain1: adaptersMain1
    lateinit var adaptersMain2: adaptersMain2
    lateinit var adaptersMain3: adaptersMain3
    lateinit var adaptersMain4: adaptersMain4
    lateinit var adaptersMain5: adaptersMain5
    lateinit var adaptersMain6: adaptersMain6
    lateinit var ListenNfibet3: ListenMainProjectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ListenNfibet3= ListenMainProjectBinding.inflate(layoutInflater)
        setContentView(ListenNfibet3.root)
        val nfibet3listen = intent.getIntExtra("position", 0)
        when (nfibet3listen) {
            1 -> {
                val nfibet3listen = ArrayList<Fragment>()
                nfibet3listen.add(fragmentsAllMain1())
                nfibet3listen.add(fragmentsAllMain2())
                adaptersMain1 = adaptersMain1(nfibet3listen, supportFragmentManager)
                ListenNfibet3.nfibet3Bet02Play.adapter = adaptersMain1
                ListenNfibet3.nfibet302navi.setupWithViewPager(ListenNfibet3.nfibet3Bet02Play)
            }
            2 -> {
                val nfibet3listen = ArrayList<Fragment>()
                nfibet3listen.add(fragmentsAllMain3())
                nfibet3listen.add(fragmentsAllMain4())
                adaptersMain2 = adaptersMain2(nfibet3listen, supportFragmentManager)
                ListenNfibet3.nfibet3Bet02Play.adapter = adaptersMain2
                ListenNfibet3.nfibet302navi.setupWithViewPager(ListenNfibet3.nfibet3Bet02Play)
            }
            3 -> {
                val nfibet3listen = ArrayList<Fragment>()
                nfibet3listen.add(fragmentsAllMain5())
                nfibet3listen.add(fragmentsAllMain6())
                adaptersMain3 = adaptersMain3(nfibet3listen, supportFragmentManager)
                ListenNfibet3.nfibet3Bet02Play.adapter = adaptersMain3
                ListenNfibet3.nfibet302navi.setupWithViewPager(ListenNfibet3.nfibet3Bet02Play)
            }
            4 -> {
                val nfibet3listen = ArrayList<Fragment>()
                nfibet3listen.add(fragmentsAllMain7())
                nfibet3listen.add(fragmentsAllMain8())
                adaptersMain4 = adaptersMain4(nfibet3listen, supportFragmentManager)
                ListenNfibet3.nfibet3Bet02Play.adapter = adaptersMain4
                ListenNfibet3.nfibet302navi.setupWithViewPager(ListenNfibet3.nfibet3Bet02Play)

            }
            5 -> {
                val nfibet3listen = ArrayList<Fragment>()
                nfibet3listen.add(fragmentsAllMain9())
                nfibet3listen.add(fragmentsAllMain10())
                adaptersMain5 = adaptersMain5(nfibet3listen, supportFragmentManager)
                ListenNfibet3.nfibet3Bet02Play.adapter = adaptersMain5
                ListenNfibet3.nfibet302navi.setupWithViewPager(ListenNfibet3.nfibet3Bet02Play)

            }
            6 -> {
                val nfibet3listen = ArrayList<Fragment>()
                nfibet3listen.add(fragmentsAllMain1())
                nfibet3listen.add(fragmentsAllMain12())
                adaptersMain6 = adaptersMain6(nfibet3listen, supportFragmentManager)
                ListenNfibet3.nfibet3Bet02Play.adapter = adaptersMain6
                ListenNfibet3.nfibet302navi.setupWithViewPager(ListenNfibet3.nfibet3Bet02Play)

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