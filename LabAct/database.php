<?php

$dsn = "mysql:localhost;dbname=my_guitar_shop1";
$username = "root";
$password= "";

try{
    $db = new PDO($dsn,$username,$password);
    $db->setAttribute(PDO::ATTR_EMULATE_PREPARES, FALSE);
    error_reporting(E_ALL);
}catch (PDOException $ex) {
    
    header("Location:../view/error.php?msg-" . $ex->getMessage());
}