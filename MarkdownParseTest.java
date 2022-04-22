import static org.junit.Assert.*;

import java.util.ArrayList;
    import java.util.Arrays;

    import org.junit.*;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {

    // @Test
    // public void addition() {
    //     assertEquals(2, 1 + 1);
    // }

    @Test
    public void testFile1() throws IOException {

        String content = Files.readString(Path.of("test-file.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> result = new ArrayList<>(Arrays.asList("https://something.com", "some-thing.html"));

        assertArrayEquals(result.toArray(), links.toArray());
    }
}