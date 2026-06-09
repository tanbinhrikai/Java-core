package day7.bai2;

public class Main {
    public static void main(String[] args) {
        String oldJson = "{" +
                "  \"name\": \"Java\"," +
                "  \"age\": 21" +
                "}";


        String newJson = """
                {
                    "name": "Java",
                    "age" : 21,
                }
                """;

        System.out.println(oldJson);
        System.out.println(newJson);

        String oldHtml = "<html>\n" +
                "    <body>\n" +
                "        <h1>Xin chào!</h1>\n" +
                "    </body>\n" +
                "</html>";


        String newHtml = """
                <html>
                    <body>
                        <h1>Xin chào!</h1>
                    </body>
                </html>
                """;
        System.out.println(oldHtml);
        System.out.println(newHtml);

        String oldSql = "SELECT id, name, email \n" +
                "FROM users \n" +
                "WHERE status = 'ACTIVE' \n" +
                "ORDER BY created_at DESC;";

        String newSql = """
                SELECT id, name, email
                FROM users
                WHERE status = 'ACTIVE'
                ORDER BY created_at DESC;
                """;
        System.out.println(oldSql);
        System.out.println(newSql);

        // Cách cũ
        String oldWay = String.format("Tên tôi là %s, %d tuổi.", "Java", 21);

// Cách mới với Text Block
        String textBlockFormat = """
                {
                  "name": "%s",
                  "age": %d
                }
                """.formatted("Java", 21);

        System.out.println(oldWay);
        System.out.println(textBlockFormat);

        String a = """
            Dòng 1
            Dòng 2
            """;

        String b = """ 
                Dong 1
                Dong 2
                
         """;

        System.out.println(a);
        System.out.println(b);
    }
}
