#========================================================= Patient =======================================================
[when]There is a {patient} with = ${patient} : com.mds.factmodel.FichePatient() 
[when]- First name equals '{firstName}' = hasFirstName == '{firstName}'
[when]- Last name equals '{lastName}' = hasLastName == '{lastName}'
[when]- Email equals '{email}' = hasEmail == '{email}'
[when]- Age over '{year}' year = (hasBirthDate.year - java.util.Calendar.getInstance().get(java.util.Calendar.YEAR)) > Integer.valueOf('{year}')
[when]- Age under '{year}' year = (hasBirthDate.year - java.util.Calendar.getInstance().get(java.util.Calendar.YEAR)) < Integer.valueOf('{year}')
[when]- Birth date after '{date}' = hasBirthDate after '{date}'
[when]- Birth date before '{date}' = hasBirthDate before '{date}'
#=========================================================EMR==========================================================
[when] The EMR of  {patient} contains a medical item  with = com.mds.factmodel.Symptome($quantity : quantity ) from ${patient}.symptomesPatient 
[when]-  type is '{type_of_the_medical_item}' = informationType ==  '{type_of_the_medical_item}'
[when]- name is equal to '{name_of_the_medical_item}' = localName == '{name_of_the_medical_item}'
[when]- the '{nomenclature_name}' code is equal to '{code_value}'=nomenclature=='{nomenclature_name}', code ==  '{code_value}'
#=========================================================Vital signs======================================================
[when] The EMR of  {patient} contains a vital sign "{name}" equals "{value}"  "{unit}" =
				com.mds.factmodel.Symptome(informationType  == "vitalSigns" , $quantity :  quantity) from ${patient}.symptomesPatient  
				com.mds.factmodel.Amount(localName=="{name}",valeur== "{value}", unite== "{unit}" ) from $quantity
[when] The EMR of  {patient} contains a vital sign "{name}" greater than "{value}"  "{unit}" =
				com.mds.factmodel.Symptome(informationType  == "vitalSigns" , $quantity :  quantity) from ${patient}.symptomesPatient  
				com.mds.factmodel.Amount(localName=="{name}",$intVal : Integer.valueOf(valeur), $intVal > Integer.valueOf("{value}") , unite== "{unit}" ) from $quantity
[when] The EMR of  {patient} contains a vital sign "{name}" less than "{value}"  "{unit}" =
				com.mds.factmodel.Symptome(informationType  == "vitalSigns" , $quantity :  quantity) from ${patient}.symptomesPatient  
				com.mds.factmodel.Amount(localName=="{name}",$intVal : Integer.valueOf(valeur), $intVal< Integer.valueOf("{value}") , unite== "{unit}" ) from $quantity

#=========================================================Result =========================================================
[then] return result "{type}" with "{value}" for {patient} = insert( new com.mds.factmodel.Result("{type}", "{value}", ${patient},new java.util.Date()) )
