package com.example.a5_nnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.a5_nnavigationcomponent.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding:FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btnSend.setOnClickListener {
                //findNavController().navigate(R.id.action_homeFragment_to_detailFragment) // فقط برای رفتن به صفحه دیگر
                /*
                1-در nav_main به فرگمنت "مقصد" بروید
                2-در Arguments نوع داده را که میخاهید به این فرگمنت ارسال شود مشخص کنید به همراه یک نام.که در اینجا نام sendInfo و محتوا string است
                3-با این کار یک کلاس Directions برای فرگمنت مبدا یا ارسال کننده ویک کلاس args برای فرگمنت دریافت کننده ساخته میشود.
                4-از کلاس Directions برای ارسال داده در اینجا (مبدا) و از args برای دریافت داده در DetailFragment (مقصد) استفاده میکنیم
               */
                val directions = HomeFragmentDirections.actionHomeFragmentToDetailFragment(edtText.text.toString())
                findNavController().navigate(directions)
            }
        }
    }


}