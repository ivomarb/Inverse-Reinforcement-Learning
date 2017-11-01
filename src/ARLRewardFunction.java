import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public abstract class ARLRewardFunction implements IRLRewardFunction {

	private HashMap<IRLState, Double> fStateRewardHashMap = new HashMap<IRLState, Double>();

	
	public double[] toArray(){
		double[] lArray = new double[fStateRewardHashMap.size()];
		int lIndex = 0;
		Set<IRLState> lKeySet = fStateRewardHashMap.keySet();
		for (Iterator lIterator = lKeySet.iterator(); lIterator.hasNext();) {
			IRLState lState = (IRLState) lIterator.next();
			lArray[lState.getIndex()] = fStateRewardHashMap.get(lState);
			lIndex++;
		}
		
		return lArray;
	}


	public HashMap<IRLState, Double> getStateRewardHashMap() {
		return fStateRewardHashMap;
	}

	
	
}
