package com.pangju.warchess.base;

import com.pangju.warchess.pos.Position;

import java.util.LinkedList;
import java.util.List;

/**
 * 棋子
 *
 * @author 胖橘
 * @version 1.0 2020-1-14
 * @since 1.0
 */
public abstract class BaseChess {
    /** 历史坐标 */
    protected List<Position> historyPositions;
    /** 当前坐标 */
    protected Position currentPosition;
    /** 伙伴棋 */
    protected BaseChess partnerChess;
    /** 棋子颜色 */
    protected Color color;

    /**
     * 棋子类型
     */
    public enum Color {
        /** 红方 */
        RED,
        /** 黑方 */
        BLACK
    }

    public BaseChess(Position position, Color color) {
        this.currentPosition = position;
        this.color = color;
        this.historyPositions = new LinkedList<>();
        this.partnerChess = null;
    }

    /**
     * 移动棋子
     * @param position
     */
    public abstract void move(Position position);

    /**
     * 进攻别的棋子
     *
     * @param chess
     */
    protected abstract void attack(BaseChess chess);

    /**
     * 组合棋子
     * @param chess
     */
    protected void combine(BaseChess chess) {

    }

    /**
     * 取消组合
     */
    protected void unCombine(BaseChess chess) {

    }

    /**
     * 悔棋
     */
    public void regret() {

    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    /**
     * 是否为友方棋
     * @param chess
     * @return
     */
    protected boolean isTeam(BaseChess chess) {
        return chess.color == this.color;
    }
}
