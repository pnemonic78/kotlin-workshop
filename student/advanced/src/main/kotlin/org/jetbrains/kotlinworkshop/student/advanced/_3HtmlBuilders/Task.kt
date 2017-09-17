package org.jetbrains.kotlinworkshop.student.advanced._3HtmlBuilders

fun getTitleColor() = "#b9c9fe"
fun getCellColor(row: Int, column: Int) = if ((row + column) % 2 == 0) "#dce4ff" else "#eff2ff"

/*
1) Fill the table with the proper values from products.
2) Color the table like a chess board (using getTitleColor() and getCellColor() functions above).
Pass a color as an argument to functions 'tr', 'td'.
You can run the 'Html Demo' configuration in IntelliJ IDEA to see the rendered table.
*/

fun renderProductTable(): String {
    return html {
        table {
            tr {
                attributes.add(Attribute("bgcolor", getTitleColor()))
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            products.mapIndexed { index, product ->
                tr {
                    td {
                        attributes.add(Attribute("bgcolor", getCellColor(index, 0)))
                        text(product.description)
                    }
                    td {
                        attributes.add(Attribute("bgcolor", getCellColor(index, 1)))
                        text(product.price)
                    }
                    td {
                        attributes.add(Attribute("bgcolor", getCellColor(index, 2)))
                        text(product.popularity)
                    }
                }
            }
        }
    }.toString()
}