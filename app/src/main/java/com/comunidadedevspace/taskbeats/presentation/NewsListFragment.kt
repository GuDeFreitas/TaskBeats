package com.comunidadedevspace.taskbeats.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.comunidadedevspace.taskbeats.R
import com.comunidadedevspace.taskbeats.data.News

/**
 * A simple [Fragment] subclass.
 * Use the [NewsListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NewsListFragment : Fragment() {

     private val adapter: NewsListAdapter = NewsListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_list, container, false)
    }

     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
         super.onViewCreated(view, savedInstanceState)

         val rvNewsList = view.findViewById<RecyclerView>(R.id.rv_news)
         rvNewsList.adapter = adapter

         //Fake List
         val newsList = listOf<News>(
             News(
                 "Deals: \$549 M2 Mac mini, \$99 Ninja Smart Oven, save \$1,350 on KEF R11 Series floor speakers, more\",\n" +
                         "\"author\": \"news@appleinsider.com (AppleInsider Staff)",
                 "https://media.wired.co.uk/photos/606d9b367aff197af7c72a2f/1:1/w_2002,h_2002,c_limit/wired-uk-android-tips-1.jpg"
             ),
             News(
                 "Pixel Watch: Das sind Googles neue Metall-Armbänder – sollen in Kürze ab 199 Euro verfügbar sein (Galerie)Pixel Watch: Das sind Googles neue Metall-Armbänder – sollen in Kürze ab 199 Euro verfügbar sein (Galerie)",
                 "https://cdn.vox-cdn.com/thumbor/ApWK7B5wwc_3uHfkRqqizdUxtbk=/0x0:2040x1360/1400x788/filters:focal(1020x680:1021x681)/cdn.vox-cdn.com/uploads/chorus_asset/file/24100797/226336_Pixel_Watch_AKrales_0058.jpg"
             ),
             News(
                 "Apple chief Tim Cook was present in Mumbai to inaugurate the first Apple retail store. He was seen waving and taking selfies with the crowd.",
                 "https://www.thebrandingjournal.com/wp-content/uploads/2016/05/apple_new_store_visual_identity_campaign_the_branding_journal_5.jpg"
             ),
             News(
                 "The cheapest single-motor rear-wheel-drive Tesla Model Y now costs from £44,990 – that's around £7,000 less than it previously cost. This makes the popular SUV slightly cheaper than the £45,245 Kia EV6 but a smidge pricier than the £43,150 Hyundai Ioniq 5.",
                 "https://images.cars.com/cldstatic/wp-content/uploads/tesla-model-3-2022-exterior-dynamic-oen.jpg"
             ),
             News(
                 "The benefits of swimming are vast, but chances are it's probably not as regular a part of your workout routine as, say, strength training, reformer Pilates, or weightlifting. As we always say, the workout you enjoy is the one you should do, so if it's not for you then don't force it, but if swimming is something you like but often put off (no swimsuit, CBB to shave - you know the drill), then you should probably read this.",
                 "https://bluebuoy.com/wp-content/uploads/2019/10/BlueBuoy.jpg"
             ),
         )

         adapter.submitList(newsList)

     }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment NewsListFragment.
         */
        @JvmStatic
        fun newInstance() = NewsListFragment()
    }
}