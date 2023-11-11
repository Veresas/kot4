fun main(args: Array<String>) {

    var flug = 1;
    var actionNumber:Int;
    while (flug == 1)
    {
        print("Введите число (1 - это камень, 2 - ножницы, 3 - бумага): ")
        actionNumber = readln()!!.toInt();
        flug = action(actionNumber);
    }
}
fun action(actNum: Int) : Int
{
    var ret = 0;
    val computerAction =  (1..3).random();
    println("Ход компьютера: ${computerAction}")
    if(actNum == computerAction)
    {

        println("Ничья");
        ret = 1;
    }else if((actNum == 1 && computerAction == 2)||(actNum == 2 && computerAction == 3)
       ||(actNum == 3 && computerAction == 1))
    {
     println("Победа игрока!");
    }else println("Победа компьютера..");
    return ret;
}