
/**
 * 
 * @author Ivomar Brito Soares
 *
 */
public class TRLStateActionPair {

	private IRLState fInitialState;
	private Double   fInitialStateValue;
	
	public Double getInitialStateValue() {
		return fInitialStateValue;
	}
	public void setInitialStateValue(Double aInitialStateValue) {
		fInitialStateValue = aInitialStateValue;
	}
	private IRLAction fAction;
	
	public IRLAction getAction() {
		return fAction;
	}
	public void setAction(IRLAction aAction) {
		fAction = aAction;
	}
	public IRLState getInitialState() {
		return fInitialState;
	}
	public void setInitialState(IRLState aInitialState) {
		fInitialState = aInitialState;
	}
	
	
}
