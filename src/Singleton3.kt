class A {
    init {
        println("Class init method.");
    }


    object SingletonA {
        init {
            println("SingletonA class invoked");
        }

        var name = "Kotlin Objects A";
        fun printName() {
            println(name);
        }

    }

    companion object SingletonB {
        init {
            println("SingletonB class invoked");
        }

        var name = "Kotlin Objects B";
        fun printName() {
            println(name);
        }

    }
}

fun main() {
    var a = A();
    var a  = A.name;
    A.name = "Kotlin Tutorials"
    A.printName();
}