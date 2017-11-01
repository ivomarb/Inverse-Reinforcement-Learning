import java.util.HashMap;


public interface IRLRewardFunction extends IRL{

	public HashMap<IRLState, Double> getStateRewardHashMap();
	public double[] toArray();

}
