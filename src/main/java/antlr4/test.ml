Person {
    number age
    string name
    Data birthday
    constraints={ 
    	age nullable:true blank:false validator:sfzh
    }
}