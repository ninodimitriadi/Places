package com.example.places

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val placeList = ArrayList<Places>()
        placeList.add(Places(1, "https://www.pandotrip.com/wp-content/uploads/2016/02/Rio3-1-980x699.jpg"))
        placeList.add(Places(2, "https://www.georgianjournal.ge/media/images/georgianews/2017/December/Discover/juta.jpg"))
        placeList.add(Places(3, "https://globalgrasshopper.com/wp-content/uploads/2020/03/most-beautiful-places-to-visit-in-Japan-1000x667.jpg"))
        placeList.add(Places(4, "https://www.planetware.com/wpimages/2020/03/poland-best-places-to-visit-krakow.jpg"))
        placeList.add(Places(5, "https://www.travelanddestinations.com/wp-content/uploads/2019/08/Turkey-beautiful-places-to-see-and-visit.jpg"))
        placeList.add(Places(6, "https://www.swedishnomad.com/wp-content/images/2017/02/Places-to-visit-in-Japan.jpg"))
        placeList.add(Places(7, "https://s3-eu-west-1.amazonaws.com/uploads.playbaamboozle.com/uploads/images/80989/1595914486_101680"))
        placeList.add(Places(8, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS08-Pc2FHf-iQ0RSU_uRW3X_vliKdQT4X_Dw&usqp=CAU"))
        placeList.add(Places(9, "https://wander-lush.org/wp-content/uploads/2020/06/Emily-Lush-Montenegro-CanvaPro-River-Tara.jpg"))
        placeList.add(Places(10, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQVlTIzRgveMJp1-croLzu3XUquyrByVA3aKg&usqp=CAU"))
        placeList.add(Places(11, "https://i.hurimg.com/i/hdn/75/650x650/5b850fb30f25431df015f905"))
        placeList.add(Places(12, "https://www.planetware.com/wpimages/2020/03/poland-best-places-to-visit-warsaw.jpg"))
        placeList.add(Places(1, "https://www.pandotrip.com/wp-content/uploads/2016/02/Rio3-1-980x699.jpg"))
        placeList.add(Places(2, "https://www.georgianjournal.ge/media/images/georgianews/2017/December/Discover/juta.jpg"))
        placeList.add(Places(3, "https://globalgrasshopper.com/wp-content/uploads/2020/03/most-beautiful-places-to-visit-in-Japan-1000x667.jpg"))
        placeList.add(Places(4, "https://www.planetware.com/wpimages/2020/03/poland-best-places-to-visit-krakow.jpg"))
        placeList.add(Places(5, "https://www.travelanddestinations.com/wp-content/uploads/2019/08/Turkey-beautiful-places-to-see-and-visit.jpg"))
        placeList.add(Places(6, "https://www.swedishnomad.com/wp-content/images/2017/02/Places-to-visit-in-Japan.jpg"))
        placeList.add(Places(7, "https://s3-eu-west-1.amazonaws.com/uploads.playbaamboozle.com/uploads/images/80989/1595914486_101680"))
        placeList.add(Places(8, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS08-Pc2FHf-iQ0RSU_uRW3X_vliKdQT4X_Dw&usqp=CAU"))
        placeList.add(Places(9, "https://wander-lush.org/wp-content/uploads/2020/06/Emily-Lush-Montenegro-CanvaPro-River-Tara.jpg"))
        placeList.add(Places(10, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQVlTIzRgveMJp1-croLzu3XUquyrByVA3aKg&usqp=CAU"))
        placeList.add(Places(11, "https://i.hurimg.com/i/hdn/75/650x650/5b850fb30f25431df015f905"))
        placeList.add(Places(12, "https://www.planetware.com/wpimages/2020/03/poland-best-places-to-visit-warsaw.jpg"))
        placeList.add(Places(1, "https://www.pandotrip.com/wp-content/uploads/2016/02/Rio3-1-980x699.jpg"))
        placeList.add(Places(2, "https://www.georgianjournal.ge/media/images/georgianews/2017/December/Discover/juta.jpg"))
        placeList.add(Places(3, "https://globalgrasshopper.com/wp-content/uploads/2020/03/most-beautiful-places-to-visit-in-Japan-1000x667.jpg"))
        placeList.add(Places(4, "https://www.planetware.com/wpimages/2020/03/poland-best-places-to-visit-krakow.jpg"))
        placeList.add(Places(5, "https://www.travelanddestinations.com/wp-content/uploads/2019/08/Turkey-beautiful-places-to-see-and-visit.jpg"))
        placeList.add(Places(6, "https://www.swedishnomad.com/wp-content/images/2017/02/Places-to-visit-in-Japan.jpg"))
        placeList.add(Places(7, "https://s3-eu-west-1.amazonaws.com/uploads.playbaamboozle.com/uploads/images/80989/1595914486_101680"))
        placeList.add(Places(8, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS08-Pc2FHf-iQ0RSU_uRW3X_vliKdQT4X_Dw&usqp=CAU"))
        placeList.add(Places(9, "https://wander-lush.org/wp-content/uploads/2020/06/Emily-Lush-Montenegro-CanvaPro-River-Tara.jpg"))
        placeList.add(Places(10, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQVlTIzRgveMJp1-croLzu3XUquyrByVA3aKg&usqp=CAU"))
        placeList.add(Places(11, "https://i.hurimg.com/i/hdn/75/650x650/5b850fb30f25431df015f905"))
        placeList.add(Places(12, "https://www.planetware.com/wpimages/2020/03/poland-best-places-to-visit-warsaw.jpg"))

        val placesAdapter = PlacesAdapter(placeList)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = placesAdapter

    }
}