<?php

    $str1 = $_POST["str"];

    $str = strtolower($str1);

    $arr = [];

    $flag = true;

    for ($i=0; $i < strlen($str); $i++) { 
        array_push($arr, $str[$i]);
    }

    for ($i=0; $i < strlen($str); $i++) { 
        if(array_pop($arr) != $str[$i])
        {
            $flag = false;
            break;
        }
    }
    if($flag)
    {
        echo "$str1 is palindrome";
    }
    else
    {
        echo "$str1 is not palindrome";
    }
    

?>