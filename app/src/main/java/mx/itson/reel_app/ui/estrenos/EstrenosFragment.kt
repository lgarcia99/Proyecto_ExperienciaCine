package mx.itson.reel_app.ui.estrenos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import mx.itson.reel_app.R

class EstrenosFragment : Fragment() {

    companion object {
        fun newInstance() = EstrenosFragment()
    }

    private lateinit var viewModel: EstrenosViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_estrenos, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EstrenosViewModel::class.java)
        // TODO: Use the ViewModel
    }

}