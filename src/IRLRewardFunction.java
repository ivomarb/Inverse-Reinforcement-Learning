import java.util.HashMap;

/**
 * 
 * @author Ivomar Brito Soares
 *
 */
public interface IRLRewardFunction extends IRL{

	public HashMap<IRLState, Double> getStateRewardHashMap();
	public double[] toArray();

}
