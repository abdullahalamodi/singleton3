class A {
    init {
        println("Class init method. Singleton name property");
    }


    object Singleton {
        init {
            println("Singleton class invoked");
        }

        var name = "Kotlin Objects";
        fun printName() {
            println(name);
        }

    }
}

fun main() {
    var a = A();
}