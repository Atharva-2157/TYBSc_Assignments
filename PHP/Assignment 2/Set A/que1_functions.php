<?php

    $my_arr = ["Ten" =>10,"Twenty"=> 20,"Thirty"=> 30,"Forty"=> 40,"Fifty"=> 50];

    $option = $_POST["option"];

    switch($option) 
    {
        case 1:
        {
            foreach ($my_arr as $key => $value) {
                echo "$key = $value <br>";
            }
        }break;

        case 2:
        {
            $length = sizeof($my_arr);
            echo "Size of the array is $length";
        }break;

        case 3:
        {
            $key = $_POST["key"];
            if(array_key_exists($key, $my_arr))
            {
                unset($my_arr[$key]);
                print_r($my_arr);
            }
            else
            {
                echo "Key not found";
            }

        }break;

        case 4:
        {
            $my_arr = array_flip($my_arr);

            foreach ($my_arr as $key => $value) {
                echo "$key = $value <br>";
            }
        }break;

        case 5:
        {
            shuffle($my_arr);
            foreach ($my_arr as $key => $value) {
                echo "$key = $value <br>";
            }
        }break;

    }



?>