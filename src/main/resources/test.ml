Person {
       number age
       string name
       Date birthday
        constraints {
          age nullable:true, blank:true validator:[aMethod,bMethod]

       }
   }
