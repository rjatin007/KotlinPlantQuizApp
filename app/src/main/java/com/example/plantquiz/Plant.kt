package com.example.plantquiz

class Plant (genus:String, species:String, common:String, cultivar:String,
             picture_name:String, description:String, difficulty:Int , id:Int=0) {

    private var _plantName : String?=null
    // why one more declaration required?
    // because _plantname is private.
    // we are actually getting and setting the private variable via a public variable
    var plantName:String?
        get()=_plantName;
        set(value){
            _plantName = value;
        }
}