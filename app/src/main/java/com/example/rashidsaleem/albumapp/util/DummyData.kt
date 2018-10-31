package com.example.rashidsaleem.albumapp.util

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

        studentArrayList.add(Student(1, "Baqar", "", "+923473738298", "Raiwind City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(2, "Usman", "", "+923472343298", "Raiwind City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(3, "Ali", "", "+9234737234298", "Raiwind City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(4, "Zahid", "", "+9234125398", "Raiwind City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(5, "Abubakar", "", "+92534328298", "Lahore City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(6, "Waleed", "", "+923473738298", "Okara City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(7, "Naveed", "", "+923473738298", "Behira City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(8, "Rashid", "", "+923473738298", "West City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(9, "Sajid", "", "+923473738298", "Berlin City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(10, "Chand", "", "+923473738298", "New York City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(11, "Inaam", "", "+923473738298", "Ireland City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))
        studentArrayList.add(Student(12, "Akraam", "", "+923473738298", "Raiwind City", socialMediaHashMap, "Nothing in this world can take the place of persistence." ))


        return studentArrayList;
    }
}