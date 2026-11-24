In Java, String[] args in the main() method is used to receive command-line arguments when you run a Java program.

public static void main(String[] args) {
    System.out.println(args[0]);
}

String[] – Array of strings.
args – Variable name (you can choose another name).
args[0] – First command-line argument.

Compile & run
    javac Main.java
    java Main Shiv 25