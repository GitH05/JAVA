public class S {

public static String splitMethod(String str) {
String words[] = str.replaceAll("[^a-zA-Z ]", "").split(" ");
int count = 0;
String find="java";
for(String word: words) { if(word.equalsIgnoreCase(find)) { count++; } } //ignore the written case.
return find +": "+ count;
}

public static void main(String[] args)
{
String s = "java is ppowerful, JAVA is secure, java object oriented programming language, Java have a large community support.";
System.out.print(splitMethod(s));
}

}