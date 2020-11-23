<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>bgcolor</title>
</head>
<body bgcolor="

<?php 

if(strcmp("Sat", date("D") == 0))
    echo "red";
else if(strcmp("Sun", date("D") == 0))
    echo "green";
else if(strcmp("Mon", date("D") == 0))
    echo "yellow";
else if(strcmp("Tue", date("D") == 0))
    echo "cyan";
else if(strcmp("Wed", date("D") == 0))
    echo "blue";
else if(strcmp("Thu", date("D") == 0))
    echo "black";
else if(strcmp("Fri", date("D") == 0))
    echo "gold";

?>">
    
</body>
</html>