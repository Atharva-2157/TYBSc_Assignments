<?php

    $option = $_POST["option"];

    $my_arr = [10, 20, 30, 40, 50];

    switch($option) 
    {
        case 1:
        {
            $num1 = $_POST["num1"];
            array_push($my_arr, $num1);
            print_r($my_arr);
        }break;
        case 2:
        {
            array_pop($my_arr);
            print_r($my_arr);
        }break;

        case 3:
        {
            print_r($my_arr);
        }break;
        case 4:
        {
            $num2 = $_POST["num2"];
            array_push($my_arr, $num2);
            print_r($my_arr);
        }break;
        case 5:
        {
            array_shift($my_arr);
            print_r($my_arr);
        }break;
        case 6:
        {
            print_r($my_arr);
        }break;


    }

?>