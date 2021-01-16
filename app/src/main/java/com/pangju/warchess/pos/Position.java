package com.pangju.warchess.pos;

import java.util.Objects;

/**
 * 坐标信息
 *
 * @author 胖橘
 * @version 1.0 2020-1-14
 * @since 1.0
 */
public class Position {
    /** X坐标 */
    private final int xPos;
    /** Y坐标 */
    private final int yPos;

    public Position(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Position)) {
            return false;
        }

        Position position = (Position) o;
        if (xPos != position.xPos) {
            return false;
        }
        return yPos == position.yPos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xPos, yPos);
    }
}