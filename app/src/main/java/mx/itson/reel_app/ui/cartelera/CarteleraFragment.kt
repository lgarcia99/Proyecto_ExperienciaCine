package mx.itson.reel_app.ui.cartelera

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import mx.itson.reel_app.R

class CarteleraFragment : Fragment() {

    companion object {
        fun newInstance() = CarteleraFragment()
    }

    private lateinit var viewModel: CarteleraViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cartelera, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CarteleraViewModel::class.java)
        // TODO: Use the ViewModel
    }

}