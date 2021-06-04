package ReplPractice.loop;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class EqualsJavaPython {
    public static void main(String[] args) {
        String sentence = "java not python ";

        int numberOfJava = 0;
        int numberOfPython = 0;
        for (int i = 0; i <= sentence.length() - 4; i++) {
            if (sentence.substring(i, i + 4).equals("java")) {
                numberOfJava++;
            }
        }
        for (int i = 0; i <= sentence.length() - 6; i++) {
            if (sentence.substring(i, i + 6).equals("python")) {
                numberOfPython++;
            }
        }
        System.out.println(numberOfJava == numberOfPython);

        }
    }












