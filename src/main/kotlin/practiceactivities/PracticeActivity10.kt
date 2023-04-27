fun main(){
    //Price range
    //0-10,000.00 - 0% discount
    //10,001.00 - 20,000.00 - 5% discount
    //20,001.00 - 50,000.00 - 10% discount
    //50,001.00 - 100,000.00 - 15% discount
    //Greater than 100,000.00 - 20% discount

    var productName:String = "Modem Router"
    var price:Double = 0.00
    var netPrice:Double = 0.00
    var discount:Double = 0.00

    //Input
    productName = "Modem Router"
    price = 0.00
    discount = 0.00
    netPrice = 0.00

    println("Enter Product Name: ")
    productName = readln()
    println("Enter the Price: ")
    price = readln().toDouble()

    if(price >= 100001.00) {
        discount = price * 0.20
        netPrice = price - (price * 0.20)
        println("Price of $productName : ${String.format("%,.2f", price)}")
        println("20% Discount : ${String.format("%,.2f", discount)}")
        println("Net Price : ${String.format("%,.2f", netPrice)}")
    }
    else if(price >= 50001.00) {
        discount = price * 0.15
        netPrice = price - (price * 0.15)
        println("Price of $productName : ${String.format("%,.2f", price)}")
        println("15% Discount : ${String.format("%,.2f", discount)}")
        println("Net Price : ${String.format("%,.2f", netPrice)}")
    }
    else if(price >= 20001.00) {
        discount = price * 0.10
        netPrice = price - (price * 0.10)
        println("Price of $productName : ${String.format("%,.2f", price)}")
        println("10% Discount : ${String.format("%,.2f", discount)}")
        println("Net Price : ${String.format("%,.2f", netPrice)}")
    }
    else if(price >= 10001.00) {
        discount = price * 0.05
        netPrice = price - (price * 0.05)
        println("Price of $productName : ${String.format("%,.2f", price)}")
        println("5% Discount : ${String.format("%,.2f", discount)}")
        println("Net Price : ${String.format("%,.2f", netPrice)}")
    }
    else if(price <= 10000.00) {
        discount = price * 0.00
        netPrice = price
        println("Price of $productName : ${String.format("%,.2f", price)}")
        println("Discount : ${String.format("%,.2f", discount)}")
        println("Net Price : ${String.format("%,.2f", netPrice)}")
    }
}