package com.example.rashidsaleem.albumapp.util

import com.example.rashidsaleem.albumapp.R
import com.example.rashidsaleem.albumapp.model.Student
import com.example.rashidsaleem.albumapp.util.AppContants.*

class  DummyData {



      public fun GenerateStudentsData() : ArrayList<Student> {

        var studentArrayList: ArrayList<Student> = ArrayList<Student>()

        var socialMediaHashMap: HashMap<String, String> = HashMap<String, String>()

        socialMediaHashMap.put(SOCIAL_FACEBOOK, "baqar@gmail.com")
        socialMediaHashMap.put(SOCIAL_WHATS_APP, "+923473738298")
        socialMediaHashMap.put(SOCIAL_IMO, "+923473738298")
        socialMediaHashMap.put(SOCIAL_TWITTER, "baqar@gmail.com")

        studentArrayList.add(Student(1, "Baqar", R.mipmap.hamaad, "+923473738298", "Raiwind City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(2, "Usman", R.mipmap.bilal, "+923472343298", "Raiwind City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(3, "Ali", R.mipmap.hamaad, "+9234737234298", "Raiwind City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(4, "Zahid", R.mipmap.bilal, "+9234125398", "Raiwind City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(5, "Abubakar", R.mipmap.hamaad, "+92534328298", "Lahore City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(6, "Waleed", R.mipmap.hamaad, "+923473738298", "Okara City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(7, "Naveed", R.mipmap.usman, "+923473738298", "Behira City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(8, "Rashid", R.mipmap.hamaad, "+923473738298", "West City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(9, "Sajid", R.mipmap.bilal, "+923473738298", "Berlin City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(10, "Chand", R.mipmap.hamaad, "+923473738298", "New York City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(11, "Inaam", R.mipmap.usman, "+923473738298", "Ireland City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(12, "Akraam", R.mipmap.hamaad, "+923473738298", "Raiwind City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))


        return studentArrayList;
    }
}