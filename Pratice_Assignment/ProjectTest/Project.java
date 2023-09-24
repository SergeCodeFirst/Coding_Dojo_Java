public class Project {
    private String name;
    private String description;
    private Double initialCost;

    Project(){
    }

    Project(String name){
        this.name = name;
    }
    
    Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDesc(String description){
        this.description = description;
    }
    
    public void setPrice(Double initialCost){
        this.initialCost = initialCost;
    }
    
    public String getName(){
        return this.name;
    }

    public String getDesc(){
        return this.description;
    }
    
    public Double getPrice(){
        return this.initialCost;
    }

    public String Pitch(){
        return this.name + " : " +  this.description +  " : " + this.initialCost;
    }
}
