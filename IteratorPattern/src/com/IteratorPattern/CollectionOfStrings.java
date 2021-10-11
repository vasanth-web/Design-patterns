package com.IteratorPattern;

public class CollectionOfStrings {
	
	public String name[] = {"Logan", "Specter", "Harry", "Mike", "Louis"};   
    
	public Iterator getIterator() {  
	        return new CollectionofStringsIterate() ;  
	}  
	
    private class CollectionofStringsIterate implements Iterator {  
       	
    	int i;  
        
        @Override  
        public boolean hasNext() {  
            if (i < name.length){  
                return true;  
            }  
            return false;  
        }  
        
        @Override  
        public Object next() {  
            if(this.hasNext()){  
                return name[i++];  
            }  
            return null;      
        }  
    }  
}  
