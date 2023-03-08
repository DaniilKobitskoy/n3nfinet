package app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.adaptersMain

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.fragmentsAllMain.fragmentsAllMain3
import app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.betcitysportFragments.fragmentsAllMain4


class adaptersMain2 (var adaptinfo: ArrayList<Fragment>, adaptinfo_manager: FragmentManager)
    : FragmentPagerAdapter(adaptinfo_manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getCount(): Int = 2

    override fun getItem(infonum: Int): Fragment {
        return when (infonum) {
            0 -> fragmentsAllMain3()
            1 -> fragmentsAllMain4()
            else -> fragmentsAllMain3()

        }
        numfun1(numfun1 = 0)
        numfun2()
        numfun3()

    }


    private fun numfun3() {
        var  numfun3 = (0..100).random()
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