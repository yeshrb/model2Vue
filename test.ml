Person {
    number age
    string name
    Data birthday
    constraints {
        age nullable:false
        birthday nullable: true
    }
}