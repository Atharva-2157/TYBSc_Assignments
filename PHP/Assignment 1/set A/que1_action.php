<?php

    $str1 = $_POST["str1"];
    $str2 = $_POST["str2"];
    $str3 = $_POST["str3"];

    // echo "$str1<br>";
    // echo "$str2<br>";
    // echo "$str3<br>";

    $first_occurance = strpos($str1, $str2);
    $last_occurance = strrpos($str1, $str2);

    echo "First occurance is : $first_occurance<br>";
    echo "Last occurance is : $last_occurance<br>";

    $count = substr_count($str1, $str2);

    echo "Count is : $count<br>";

    $str1 = str_replace($str2, $str3, $str1);

    echo "String 1 after replacement $str1<br>";
    // echo "$str2<br>";
    // echo "$str3<br>";

    // php programming php -> str1
    // php -> str2
    // java -> str3







?>