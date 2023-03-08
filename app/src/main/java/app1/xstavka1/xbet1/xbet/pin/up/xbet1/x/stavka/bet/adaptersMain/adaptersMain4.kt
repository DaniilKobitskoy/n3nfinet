package app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.adaptersMain

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.fragmentsAllMain.fragmentsAllMain7
import app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.fragmentsAllMain.fragmentsAllMain8



class adaptersMain4 (var adaptersMain4: ArrayList<Fragment>, adaptersMain4_manager: FragmentManager)
    : FragmentPagerAdapter(adaptersMain4_manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getCount(): Int = 2

    override fun getItem(adaptersMain4: Int): Fragment {
        return when (adaptersMain4) {
            0 -> fragmentsAllMain7()
            1 -> fragmentsAllMain8()
            else -> fragmentsAllMain7()

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