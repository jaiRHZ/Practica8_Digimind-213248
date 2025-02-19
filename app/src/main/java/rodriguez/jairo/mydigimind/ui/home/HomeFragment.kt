package rodriguez.jairo.mydigimind.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import rodriguez.jairo.mydigimind.R
import rodriguez.jairo.mydigimind.databinding.FragmentHomeBinding
import rodriguez.jairo.mydigimind.ui.dashboard.DashboardViewModel

class HomeFragment : Fragment() {
    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel = defaultViewModelProvider(this).get(DashboardViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_home,container, false)
        homeViewModel.text.observe(viewLifecycleOwner,{})

        return root
    }
}