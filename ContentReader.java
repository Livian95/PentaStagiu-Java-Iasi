import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ContentReader {
	public static  String filePath;

	public static void read() {
		try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
		
			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();		
		}  catch (Exception apacalda) {
			apacalda.printStackTrace();
		}
	}

}
