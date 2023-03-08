package app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.adaptersMain

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.fragmentsAllMain.fragmentsAllMain1
import app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.fragmentsAllMain.fragmentsAllMain2


class adaptersMain1 (adaptersMain1: ArrayList<Fragment>, adaptersMain1_managers: FragmentManager)
    : FragmentPagerAdapter(adaptersMain1_managers, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getCount(): Int = 2

    override fun getItem(newnumber: Int): Fragment {
        return when (newnumber) {
            0 -> fragmentsAllMain1()
            1 -> fragmentsAllMain2()
            else -> fragmentsAllMain1()

        }
        numfun1(numfun1 = 0)
        numfun2()
        numfun3()

    }


    private fun numfun3() {
        var numfun3 = (0..100).random()
        print( numfun3)
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