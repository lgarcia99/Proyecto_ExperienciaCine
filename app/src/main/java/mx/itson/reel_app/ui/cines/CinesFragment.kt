package mx.itson.reel_app.ui.cines

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import mx.itson.reel_app.R

class CinesFragment : Fragment() {

    companion object {
        fun newInstance() = CinesFragment()
    }

    private lateinit var viewModel: CinesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cines, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CinesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}