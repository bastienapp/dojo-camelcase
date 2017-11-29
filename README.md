# Convertir vers camelCase

Ecrire une méthode qui convertit une chaine en camelCase : pratique qui consiste à écrire un ensemble de mots en les liant sans espace ni ponctuation, et en mettant en capitale la première lettre de chaque mot, excepté le premier mot qu icommence par une minuscule.

Exemples :

* "a" > "a"
* "a b" > "aB"
* "suite de mots" > "suiteDeMots"
* "tExTE mAl fICHu" > "texteMalFichu"

Rappel des commande junit :

    javac -cp .:junit-4.12.jar CamelCaseTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CamelCaseTest
