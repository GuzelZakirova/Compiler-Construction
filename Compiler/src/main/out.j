.class public SumCalculator
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
    .limit stack 10
    .limit locals 4 ; Увеличим количество локальных переменных, добавив место для новой переменной

    ; Загружаем статическое поле System.out
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc 1
    ldc 2
    iadd
    istore_3
    iload_3
    invokestatic java/lang/String/valueOf(I)Ljava/lang/String;
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    return
.end method
