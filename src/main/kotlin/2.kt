fun main() {

    var i = 0;
    var j = 0;
    var indexInAlph = 0;

    print("Использовать типовую кодировку(1) или случайную(2): ")
    val numAction:Int = readln()!!.toInt();
    print("Введите текст: ")
    val ishoTxt = readln();
    print("Введите ключ: ")
    val key = readln();

    var alph = ('А'..'Я').toMutableList();
    alph.add(6,'Ё');
    var alphCopy = alph;

    if(numAction == 2)
    {
        alphCopy.shuffle()
    };

    var enterTxt = "";
    var fullKey = fullKey(ishoTxt,key);
    val keyIndex = mutableMapOf<Char,Int>();
    i = 0;

    //Создание map для ключа
    for(it1 in key)
    {
        for(it2 in alphCopy)
        {
            if(it1 == it2) keyIndex.put(it1,i);
            i++
        }
        i = 0;
    }

    i=0;

    for(it in ishoTxt)
    {
        for(it2 in alph)
        {
            if(it == it2)break;
            i++;
        }
        indexInAlph = i + keyIndex.get(fullKey[j])!!;
        j++;
        if(indexInAlph > 33) indexInAlph -= 33;
        enterTxt += alph[indexInAlph].toString();
        i=0;
    }
    println("Полный ключ: ${fullKey}");
    println("Зашифорованный текст: ${enterTxt}");

}
fun fullKey(Txt: String, key: String):String
{
    var i = 0;
    val ishoTxt = Txt;
    val key = key;
    var fullKey = "";
    for (it in ishoTxt)
    {
        if(i == key.length) i=0;
        fullKey += key[i++];
    }
    return fullKey;
}

//ШИФРВИЖЕНЕР
//КОДКОДКОДКО
//ГЧШЫРМСУСПЯ