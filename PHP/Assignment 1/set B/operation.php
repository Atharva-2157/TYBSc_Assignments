<?php

    include 'que1_functions.php';

    $num1 = $_GET['num1'];
    $num2 = $_GET['num2'];
    $value = $_GET['operator'];

    $ans = 0;

    switch($value)
    {
        case '+':
            $ans = addition($num1, $num2);
        break;

        case '-':
        {
            $ans = substraction($num1, $num2);
        }break;

        case '*':
        {
            $ans = multiplication($num1, $num2);
        }break;

        case '/':
        {
            $ans = division($num1, $num2);
        }break;
    }

    echo "The answer is $ans <br>";

?>