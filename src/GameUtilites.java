import java.awt.Dimension;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Common superclass for all game model classes.
 *
 * Constructors of subclasses should initiate matrix elements and additional,
 * game-dependent fields.
 */
public abstract class GameUtilites implements IGameModel {
   /* @Override
    public void addObserver(PropertyChangeListener observer) {
        new PropertyChangeSupport(this).addPropertyChangeListener(observer);
    }

    @Override
    public void removeObserver(PropertyChangeListener observer) {
        new PropertyChangeSupport(this).removePropertyChangeListener(observer);


}
*/
    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param pos
     *            The position in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    protected void setGameboardState(GameTile[][] gameboardState, final Position pos, final GameTile tile) {
        setGameboardState(gameboardState, pos.getX(), pos.getY(), tile);
    }

    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param x
     *            Coordinate in the gameboard matrix.
     * @param y
     *            Coordinate in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    protected void setGameboardState(GameTile[][] gameboardState, final int x, final int y,
                                     final GameTile tile) {
        gameboardState[x][y] = tile;



    }

}
