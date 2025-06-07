package com.yeswanth.yurei

import com.github.javiersantos.piracychecker.PiracyChecker
import dev.jahir.kuper.ui.activities.KuperActivity

class MainActivity : KuperActivity() {

    override val billingEnabled = false

    override fun amazonInstallsEnabled(): Boolean = false
    override fun checkLPF(): Boolean = false
    override fun checkStores(): Boolean = false

    override fun getLicKey(): String? = null

    override fun getLicenseChecker(): PiracyChecker? {
        destroyChecker() // Important
        return null
    }

    override fun defaultTheme(): Int = R.style.MyApp_Default
    override fun amoledTheme(): Int = R.style.MyApp_Default_Amoled

    override fun defaultMaterialYouTheme(): Int = R.style.MyApp_Default_MaterialYou
    override fun amoledMaterialYouTheme(): Int = R.style.MyApp_Default_Amoled_MaterialYou
}
