package Load.Balancer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class LoadBalancer {
	List<String> ipList;
	Map<String,Integer> ipMap;
	
	 public LoadBalancer(List<String> ipList) {
	        this.ipList = Collections.unmodifiableList(ipList);
	  }
	 
	 public LoadBalancer(Map<String,Integer> ipMap) {
	        this.ipMap = Collections.unmodifiableMap(ipMap);
	  }
	 
	 public abstract String getServer();
	 
	 public List<String> getServerIpByWeight() {
		 return new ArrayList();
	 }
	 

}
