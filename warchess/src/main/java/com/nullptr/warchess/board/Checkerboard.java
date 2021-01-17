package com.nullptr.warchess.board;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.pangju.warchess.base.BaseChess;
import com.pangju.warchess.pos.Position;

import java.util.HashMap;
import java.util.Map;

/**
 * 棋盘
 *
 * @author 胖橘
 */
public class Checkerboard {
    private Map<Position, BaseChess> chessMap;
    private int height;
    private int width;

    public void init(int height, int width, Map<Position, BaseChess> chessMap) {
        this.height = height;
        this.width = width;
        this.chessMap = new HashMap<>(height * width);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Position position = new Position(i, j);
                chessMap.put(position, null);
            }
        }
    }

    public BaseChess getChess(Position position) {
        return chessMap.get(position);
    }

    public void clearChess(Position position) {
        chessMap.replace(position, null);
    }

    public void moveChess(Position position, BaseChess chess) {
        chessMap.replace(chess.getCurrentPosition(), null);
        chessMap.replace(position, chess);
        chess.move(position);
    }

    public boolean hasChess(Position position) {
        return chessMap.get(position) != null;
    }
}
