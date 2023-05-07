package exercises

fun main(){
    //Header
    var job:String = "Mobile Developer"
    var salary:Double = 40000.00
    var dateAvailable:String = "Full Time"

    //Personal Information
    var lastName:String = "Capili"
    var firstName:String = "Mary Claire"
    var middleName:String = "Osongco"
    var address:String = "Mabini St. Brgy. Tambak (POB6)"
    var city:String = "Pagbilao"
    var state:String = "Quezon"
    var zip:Int = 4302
    var homePhone:Long = 7191792
    var cellPhone:Long = 9928310994
    var email:String = "maryclaireosongco@gmail.com"
    var sss:Long = 123456789
    var usCitizen:String = "No"
    var convicted:String = "No"
    var preDrugTest:String = "Yes"

    //Education
    var school:String = "Manuel S. Enverga University Foundation"
    var location:String = "Lucena City"
    var yearAttended:String = "Year 2005-2009"
    var degree:String = "Bachelor of Science"
    var major:String = "Hotel and Restaurant Management"
    var otherCerti:String = "N/A"

    //Employment
    var lastJob:String = "Pizzeria Pokriva"
    var datesEmployed:String = "July 2019"
    var workPhone:Long = 987654321
    var payRate:String = "5000,00 kn"
    var locationLastJob:String = "Obala 46A"
    var cityLastJob:String = "Punat"
    var stateLastJob:String = "Croatia"
    var zipCode:Int = 51521
    var jobTitle:String = "Cashier/Waitress"
    var dutiesPerformed:String = "Smile and Greet, Take their orders, Serve their orders, Thank them when they leave."
    var supervisorsName:String = "Nives Morizin/Owner"
    var reasonForLeaving:String = "Due to Pandemic"
    var contactEmployer:String = "Yes"

    //Reference
    var refName:String = "Mrs. Loida Batusin"
    var refTitle:String = "Logistics Supervisor"
    var companyName:String = "Quantum Global Food Concepts Inc."
    var refContact:Int = 427974402
    var nameOfApplicant:String = "Mary Claire O. Capili"
    var dateSigned:String = "April 12, 2023"

    println("")
    println("                               Application For Employment")
    println("")
    println("Position You Are Applying For: $job              Desired Salary : $salary")
    println("Date Available for Work : $dateAvailable")
    println("")
    println("PERSONAL INFORMATION")
    println("")
    println(" $lastName                                     $firstName                              $middleName ")
    println("Last Name                                    First Name                             Middle Name")
    println("$address     $city                  $state                        $zip")
    println("       Address                        City                   State                         Zip")
    println("Home Phone : $homePhone        Cell Phone : $cellPhone          Email Address : $email")
    println("Social Security Number : $sss")
    println("Are you a U.S. Citizen? $usCitizen")
    println("Have you ever convicted of a felony? $convicted")
    println("If selected for employment are you willing to submit to a pre-employment drug screening test? $preDrugTest")
    println("")
    println("EDUCATION")
    println("")
    println("      School Name                          location        Years Attended          Degree Received             Major")
    println("$school   $location     $yearAttended        $degree       $major")
    println("")
    println("Other training, certifications or licenses held: $otherCerti")
    println("")
    println("EMPLOYMENT")
    println("")
    println("Employer: $lastJob                             Dates Employed: $datesEmployed")
    println("Work Phone: $workPhone                         Pay Rate: $payRate   to  March 2020")
    println("Address: $locationLastJob")
    println("City: $cityLastJob                          State: $stateLastJob               Zip Code: $zipCode")
    println("Position: $jobTitle")
    println("Duties Performed: $dutiesPerformed")
    println("Supervisors Name and Title: $supervisorsName")
    println("Reason for leaving: $reasonForLeaving")
    println("May We Contact Them? $contactEmployer")
    println("")
    println("REFERENCES")
    println("")
    println("         Name                    Title                            Company                       Phone")
    println("$refName       $refTitle          $companyName       $refContact   ")
    println("")
    println("Acknowledgement and Authorization")
    println("")
    println("I certify that all answers given are true and complete to the best of my knowledge.")
    println("I authorize investigation of all statements contained in this application for employments as may be necessary in arriving at an employment decision.")
    println("In the event of employment, I understand that false or misleading information given in my application or interview(s) may results in discharge.")
    println("")
    println("$nameOfApplicant                                       $dateSigned")
    println("Signature of Applicant                                       Date")
}