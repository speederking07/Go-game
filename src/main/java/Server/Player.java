package Server;

import Server.Exceprions.ConnectionTroubleException;
import Server.Exceprions.IllegalMoveException;
import Server.Moves.Move;

/**
 * Standard interface of player
 */
public interface Player {
    /**
     * Get move form player instance
     * @param prevMove - move of opponent
     * @param map - map of current game state
     * @return - move to preform
     * @throws ConnectionTroubleException - connection problems
     */
    Move getMove(final Move prevMove, final Map map) throws ConnectionTroubleException;

    /**
     * Call in case of invalid move was get form getMove
     * @param ex - type of illegal move
     * @return - new move to preform
     * @throws ConnectionTroubleException - connection problems
     */
    Move wrongMove(IllegalMoveException ex) throws ConnectionTroubleException;

    /**
     * Call at the end of game
     * @param reason - reason of ended game
     * @param yoursPoints - yours points
     * @param otherPoints - points of opponent
     */
    void endGame(String reason, int yoursPoints, int otherPoints);

    /**
     * Initialization of game
     * @param c - color assigned to this player
     * @throws ConnectionTroubleException - connection problems
     */
    void startGame(Color c) throws ConnectionTroubleException;
}
