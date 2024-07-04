import java.util.Date;
import java.util.Map;;

public class Sale {

  //Fields
  private Map<String, Integer> items;

  private Date date;

  private double total;

  //Constructor
  public Sale(Map<String, Integer> items, double total) {
    this.items = items;
    this.date = new Date();
    this.total = total;
  }

  //Getter and Setter
  public Map<String, Integer> getItems() {
    return items;
  }

  public void setItems(Map<String, Integer> items) {
    this.items = items;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }


  
}
