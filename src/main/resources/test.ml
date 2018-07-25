Person {
       number age
       string name
       Date birthday
       string[] others
        constraints {
          age nullable:true, blank:true validator:[aMethod,bMethod]
          name nullable:true, blank:true validator:[aMethod,bMethod]

       }
   }
