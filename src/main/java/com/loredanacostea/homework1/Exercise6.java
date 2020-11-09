package com.loredanacostea.homework1;

import java.util.HashMap;
import java.util.Map;

/*
Write a method called generateViewTemplate.
The view takes a Map<String, String> as input.
The method first defines a simple HTML template. It should return a page containing the text:
Hello ${name}. ${greeting}. Replace ${name} and ${greeting} with the values corresponding
to the keys with the same names from the input map. Return the result.
Print it in the calling function.
Hint: use text blocks and text block specific methods
 */
public class Exercise6 {

    public String generateViewTemplate(Map<String, String> stringMap) {
        return """
                <html>
                    <body>
                        <p>Hello ${name}. ${greeting}</p>
                    </body>
                </html>
                """.replace("${name}", "%s")
                .replace("${greeting}", "%s")
                .formatted(stringMap.get("name"), stringMap.get("greeting"));
    }

    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("name", "Loredana");
        stringMap.put("greeting", "Good job!");
        var exercise6 = new Exercise6();
        System.out.println(exercise6.generateViewTemplate(stringMap));
    }
}
