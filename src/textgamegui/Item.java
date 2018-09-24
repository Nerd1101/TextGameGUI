
package textgamegui;


public class Item {
    
    private String name;
    private boolean have;
    private boolean found;
    
    public Item(String s){
        this.have = false;
        this.name = s;
        this.found = false;
    }
    
    public void setHas(boolean b){
        this.have = b;
    }
    
    public Boolean doesHave(){
        return this.have;
    }
    
    public void found(){
        this.found = true;
    }
}
