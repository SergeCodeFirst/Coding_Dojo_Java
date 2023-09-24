import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;

    Portfolio(){
        projects = new ArrayList<Project>();
    }

    public ArrayList<Project> getProjects(){
        return this.projects;
    }
    
    public void addProject(Project myProject){
        this.projects.add(myProject);
    }

    public Double getPortfolioCost(){
        Double cost = 0.0;

        for (int i=0; i< this.projects.size(); i++){
            Project curProject = this.projects.get(i);
            cost = cost + curProject.getPrice();
        }
        return cost;
    }

    public void showPortfolio(){
        for (int i =0; i< this.projects.size(); i++){
            Project cur = getProjects().get(i);
            System.out.println(cur.Pitch());
        }
        System.out.println("Total cost: " + getPortfolioCost());
    }
}
