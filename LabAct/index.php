<?php
require_once 'database.php';

function get_category_name($category_id)
{
    global $db;
    $query = "SELECT * FROM categories WHERE categoryID = :category_id";
    $statement = $db->prepare($query);
    $statement->bindValue(":category_id", $category_id);
    try {
        $statement->execute();
    } catch (PDOException $ex) {
        echo "Error accessing database: " . $ex->getMessage();
    }
    $category = $statement->fetch();
    $category_name = $category['categoryName'];
    $statement->closeCursor();

    return $category_name;
}

function get_products_by_category($category_id)
{
    global $db;

    $query = "SELECT * FROM products WHERE categoryID = :category_id ORDER BY productID";
    $statement = $db->prepare($query);
    $statement->bindValue("category_id", $category_id);
    try {
        $statement->execute();
    } catch (Exception $ex) {
        header("Location:../view/error.php?msg-" . $ex->getMessage());
        exit();
    }
    $products = $statement->fetchAll();
    $statement->closecursor();

    return $products;
}

$category_id = filter_input(INPUT_GET, "cat_id");
if ($category_id == Null) {
    $category_id = 1;
}

$cagoryName = get_category_name($category_id);
// $categories = get_categories();

?>

<html>

<head>
    <meta charset="UTF-8">
    <title></title>
</head>

<body>

    <div id="wrapper">
        <article>
            <section>
                <?php
                echo "<h2>Category Name is " . $categoryName . "</h2>";
                ?>
            </section>

        </article>
    </div>
</body>

</html>