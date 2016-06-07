package token_parser;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class GPXProcessor {

//tu masz przyklad uzycia
//pliki gpx do wczytania musza byc w folderze "resources"
	
//	public static void main(String[] args) {
//			System.out.println(geCoordinatesList("example.gpx"));
//	}

	public static ArrayList<Double> geCoordinatesList() {
		ArrayList<Double> coordinatesList = new ArrayList<Double>();

		try {
			CharStream input = new ANTLRFileStream("C:\\Users\\Nikodem\\OneDrive\\workspace\\OSM_draw_from_gpx\\src\\main\\resources\\gpx_files\\krakow2.gpx");
			GPXLexer lex = new GPXLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lex);
			GPXParser parser = new GPXParser(tokens);
			GPXParser.document_return root = parser.document();
//			System.out.println("tree=" + ((Tree) root.tree).toStringTree());
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(
					(Tree) root.tree);
			GPXTreeParser walker = new GPXTreeParser(nodes);
			walker.document();
			Scanner s = new Scanner(((Tree) root.tree).toStringTree());
			while (s.hasNext()) {
				if (s.hasNextDouble()) {
					Double pierwszy = s.nextDouble();

					System.err.println("pierwszy = " + pierwszy);
					//coordinatesList.add(s.nextDouble());
					coordinatesList.add(pierwszy);
					if (s.hasNextDouble()) {
						Double drugi = s.nextDouble();
						//coordinatesList.add(s.nextDouble());
						System.err.println(" # drugi = " + drugi);
						coordinatesList.add(drugi);
					}
				}
				String str = s.next();
				if (str.charAt(0) == ('\"')) {
					coordinatesList.add(Double.parseDouble(str.substring(1,
							str.length() - 2)));
				}
			}
			coordinatesList.remove(0);
			s.close();
		} catch (Throwable t) {
			System.out.println("exception: " + t);
			t.printStackTrace();
		}


		return coordinatesList;

	}

}
