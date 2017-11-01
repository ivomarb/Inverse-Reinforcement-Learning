import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TRLPolicy implements IRLPolicy {

	private List<TRLStateActionPair> fStateActionPairList = new ArrayList<TRLStateActionPair>();
	private double[] fValueFunction;	
	private HashMap<IRLState, HashMap<IRLAction, Double>> fQValueHashMap;
	

	public HashMap<IRLState, HashMap<IRLAction, Double>> getQValueHashMap() {
		return fQValueHashMap;
	}


	public void setQValueHashMap(
			HashMap<IRLState, HashMap<IRLAction, Double>> aQValueHashMap) {
		fQValueHashMap = aQValueHashMap;
	}


	public double[] getValueFunction() {
		return fValueFunction;
	}


	public void setValueFunction(double[] aValueFunction) {
		fValueFunction = aValueFunction;
	}


	public List<TRLStateActionPair> getStateActionPairList() {
		return fStateActionPairList;
	}

	
	
}
