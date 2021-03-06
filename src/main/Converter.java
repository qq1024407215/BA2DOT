package main;

import java.io.IOException;

public class Converter {
	public static void BA2DOT(String inputPath, String outputPath) throws IOException {
		ParserBA  parse= new ParserBA(inputPath);
		MidComponent mid = parse.convertToMid(inputPath);
		MidToDOT.midToDOT(mid, outputPath, "result");
	}
	
	public static void BA2DOTWithName(String inputPath, String outputPath, String name) throws IOException {
		ParserBA  parse= new ParserBA(inputPath);
		MidComponent mid = parse.convertToMid(inputPath);
		MidToDOT.midToDOT(mid, outputPath, name);
	}

}
