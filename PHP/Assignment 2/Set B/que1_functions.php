<?php 

    $option = $_POST["option"];
    
    $my_arr = [
        [1, 2, 3, 4],
        [5, 6, 7, 8],
        [9, 10, 11, 12]
    ];

    switch($option) 
    {
        case 1:
        {
            $flag = false;
            $val = $_POST["num1"];
            for ($i=0; $i < sizeof($my_arr); $i++) { 
                for ($j=0; $j < sizeof($my_arr[$i]); $j++) { 
                    if($my_arr[$i][$j] == $val)
                    {
                        $flag = true;
                        break;
                    }
                }
                if($flag)
                {
                    break;
                }
            }
            if($flag)
            {
                echo "Element found at ( $i , $j )<br>";
            }
            else 
            {
                echo "Element not found<br>";
            }
            print_r($my_arr);

        }break;
        case 2:
        {
            $flag = false;
            $val = $_POST["num2"];
            for ($i=0; $i < sizeof($my_arr); $i++) { 
                for ($j=0; $j < sizeof($my_arr[$i]); $j++) { 
                    if($my_arr[$i][$j] == $val)
                    {
                        $flag = true;
                        unset($my_arr[$i][$j]);
                        break;
                    }
                }
                if($flag)
                {
                    break;
                }
            }

            if($flag)
            {
                echo "Element deleted<br>";
                
            }
            else
            {
                echo "Element not found<br>";
            }

            print_r($my_arr);

        }break;
    }

?>