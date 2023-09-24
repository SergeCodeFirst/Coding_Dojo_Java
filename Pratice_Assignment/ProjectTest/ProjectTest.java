class ProjectTest {
    public static void main(String[] args){
        Project Google = new Project();
        Google.setName("Google");
        Google.setDesc("A search engine");
        Google.setPrice(20000.00);
        // String googleName = Google.getName();
        // String googleDesc = Google.getDesc();
        // System.out.println("My project Name is: " + googleName + " and it's description is: " + googleDesc);
        System.out.println(Google.Pitch());
        
        Project Meta = new Project("Meta");
        Meta.setPrice(10000.00);
        // String metaName = Meta.getName();
        // String metaDesc = Meta.getDesc();
        // System.out.println("My project Name is: " + metaName + " and it's description is: " + metaDesc);
        System.out.println(Meta.Pitch());
        
        Project Oracle = new Project("Oracle", "A Database that use Structure Queries Languages");
        Oracle.setPrice(10000.00);
        // String oracleName = Oracle.getName();
        // String oracleDesc = Oracle.getDesc();
        // System.out.println("My project Name is: " + oracleName + " and it's description is: " + oracleDesc);
        System.out.println(Oracle.Pitch());

        Portfolio myPortfolio = new Portfolio();
        myPortfolio.addProject(Google);
        myPortfolio.addProject(Meta);
        myPortfolio.addProject(Oracle);

        System.out.println(myPortfolio.getPortfolioCost());;
        myPortfolio.showPortfolio();
    }
}