public class Controller {
    private Auto auto;
    private View view;

    public Controller(Auto auto, View view){
        this.auto = auto;
        this.view = view;
    }

    public void setAutoBrand(String brand){
        auto.setBrand(brand);
    }

    public String getAutoBrand(){
        return auto.getBrand();
    }

    public void setAutoId(int id){
        auto.setId(id);
    }

    public int getAutoId(){
        return auto.getId();
    }

    public void setAutoModel(String model){
        auto.setModel(model);
    }

    public String getAutoModel(){
        return auto.getModel();
    }
    public void updateView(){
        view.printDetails(auto.getBrand(), auto.getModel(), auto.getId());
    }
}