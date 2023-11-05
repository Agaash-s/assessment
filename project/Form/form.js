function submit_by_tag() {
    var name = document.getElementById("FNAME").value;
    var email = document.getElementById("MAIL").value;
    var dob=document.getElementById("DOB").value;
    var country=document.getElementById("country").value;
    var gender=document.getElementById("gender").value;
    var profession=document.getElementById("PRO").value;
    var gmail=document.getElementById("MAIL").value;
    var phno=document.getElementById("PHNO").value;


    var x = document.getElementsByTagName("form");
     //form submission
    alert(" Name : " + name + 
    "\n  Email : " + email + 
    "\n dob:"+ dob +
    '\n Country:'+country+
    '\n gender:'+gender+
    '\n profession:'+profession+
    '\n gmail:'+gmail+
    '\n phno:'+phno+
    "\n Form Submitted Successfully......");
    }
    // }

    function clear(){
        document.getElementById("").value=''
    }