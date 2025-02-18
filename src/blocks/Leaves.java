package blocks;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import App.Tetris;

import java.awt.image.BufferedImage;

//import App.Tetris;
import block.Cell;
//import block.Tetromino;

//树叶
public class Leaves extends Cell{
    //图像
    public static BufferedImage image;
    static {
        try {
            image = ImageIO.read(new File("images/leaves_oak.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Leaves(int row, int col, Tetris tetris)
    {
        super(row, col, image, tetris);
    }

}
