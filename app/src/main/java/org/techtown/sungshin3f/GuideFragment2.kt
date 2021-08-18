package org.techtown.sungshin3f
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.techtown.sungshin3f.databinding.Guidefragment2Binding

class GuideFragment2 : Fragment() {
    lateinit var binding: Guidefragment2Binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.guidefragment2, container, false)
    }



}