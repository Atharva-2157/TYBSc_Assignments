<?php

    $str1 = $_POST["str1"];
    $str2 = $_POST["str2"];
    $str3 = $_POST["str3"];

    if(preg_match("/^$str2/", $str1))
    {
        echo "Small string is occur at start of large string<br>";
    }
    else 
    {
        echo "Small string does not occur at start of large string<br>";
    }

    $str1 = preg_replace("/$str2/", "/$str3/", "$str1");
    echo "$str1<br>";

    


    // echo "<h1>Executed</h1>";

?>