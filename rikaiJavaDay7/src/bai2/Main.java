package bai2;

public class Main {
    public static void main(String[] args) {


        String json = """
                {
                  "name": "%s",
                  "age": %d
                }
                """.formatted("Java", 21);


        System.out.println(json);


        String html = """
                <html>
                  <body>
                    <h1>Hello Java</h1>
                    <p>This is text block demo</p>
                  </body>
                </html>
                """;


        System.out.println(html);


        String name = "Cong";

        String sql = """
                SELECT *
                FROM users
                WHERE name = '%s'
                """.formatted(name);


        System.out.println(sql);


        String oldWay = String.format("Hello %s, age %d", "Java", 21);

        String newWay = """
                Hello %s, age %d
                """.formatted("Java", 21);

        System.out.println("\n Compare:");
        System.out.println(oldWay);
        System.out.println(newWay);
    }
}
