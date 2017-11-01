import java.util.HashMap;
import java.util.List;

public interface IRLPolicy extends IRL{

	public List<TRLStateActionPair> getStateActionPairList();
	
	public double[] getValueFunction();
	public void setValueFunction(double[] aValueFunction);
	public HashMap<IRLState, HashMap<IRLAction, Double>> getQValueHashMap();
	public void setQValueHashMap(HashMap<IRLState, HashMap<IRLAction, Double>> aQValueHashMap);
	
}
