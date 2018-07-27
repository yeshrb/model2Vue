Person {
       number age
       pageTemplateFilePath name
       Date birthday
       pageTemplateFilePath[] others
        constraints {
          age nullable:true, blank:true validator:aMethod,bMethod
          name nullable:true, blank:true validator:aMethod,bMethod

       }
   }
