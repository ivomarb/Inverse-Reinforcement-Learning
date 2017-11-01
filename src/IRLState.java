import java.util.List;

public interface IRLState extends IRL {

	public IRLCell getCell();
	public void setCell(IRLCell aCell);
	public List<IRLAction> getActionList();
	public Boolean getAbsorbing();
	public void setAbsorbing(Boolean aAbsorbing);
	public Integer getIndex();
	public Boolean getInitial();
	public void setInitial(Boolean aInitial);
	
	public IRLAction retrieveAction( String aActionID);
}
