package org.example.basicstrong.oop.DesignPatterns.strategydesign;


 class Context {
    Strategy compressionStrategy;
    public void setCompressionStrategy(Strategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }
    public void generateFile(String file)
    {
        compressionStrategy.compressFile(file);
    }
}
 interface Strategy {

    public void compressFile(String Filename);
}
 class CompressedToRar implements Strategy {
    @Override
    public void compressFile(String Filename) {
        System.out.println(Filename+ " has been successfully converted to .rar file.");
    }
}
 class CompressedToZip implements Strategy {
    @Override
    public void compressFile(String Filename) {
        System.out.println(Filename+ " has been successfully converted to .zip file.");
    }
}
public class StrategyDesignPattern {
    public static void main(String[] args) {

        Context con = new Context();
        con.setCompressionStrategy(new CompressedToRar());
        con.generateFile("Abc.text");

    }

}
