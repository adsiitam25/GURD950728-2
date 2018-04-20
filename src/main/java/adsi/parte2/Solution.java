
package adsi.parte2.solution;

class Solution {
	
	public boolean problema(String s){
		
		int l=s.Length(), marca=0;
		char c=s.charAt(0);
		
		while(c!=s.charAt(marca) && marca <= l)
			marca++;
		if(c.equals(s.charAt(marca))){		
			if(marca==l)
				return false;
			else{
				if(Number.isInteger(l/marca)){
					String sub = "";
					for(int i=0; i<= marca;i++)
						sub=sub+charAt(i);
					String prueba="";
					for(iny j=0;j<l/marca;j++)
						prueba=prueba+sub;
					
					if(prueba.equals(s))
						return true;
					else 
						return false;
				}
				else
					return false	
				}					
			}
		}
		else
			return false;
}
