package shape;

import java.lang.reflect.Constructor;

import App.Tetris;
//import App.Tetris;
import block.Cell;
import block.Tetromino;


public class J extends Tetromino {
    //反射，初始化特定的方块
    public J(Class<? extends Cell> cellClass, Tetris tetris) {
        try {
            //Cell cellInstance = cellClass.getDeclaredConstructor(int.class, int.class).newInstance(x, y);
            Constructor<? extends Cell> constructor = cellClass.getDeclaredConstructor(int.class, int.class, Tetris.class);
            cells[0] = constructor.newInstance(0, 4, tetris);
            cells[1] = constructor.newInstance(0, 3, tetris);
            cells[2] = constructor.newInstance(0, 5, tetris);
            cells[3] = constructor.newInstance(1, 5, tetris);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //cells[0] = new Cell(0,4, Tetris.J);
        //cells[1] = new Cell(0,3, Tetris.J);
        //cells[2] = new Cell(0,5, Tetris.J);
        //cells[3] = new Cell(1,5, Tetris.J);

        states=new State[4];
        states[0]=new State(0,0,0,-1,0,1,1,1);
        states[1]=new State(0,0,-1,0,1,0,1,-1);
        states[2]=new State(0,0,0,1,0,-1,-1,-1);
        states[3]=new State(0,0,1,0,-1,0,-1,1);
    }
}
