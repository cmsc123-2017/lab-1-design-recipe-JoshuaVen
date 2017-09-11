class Item {
  double salePercentage;
  
  //constants
  final int PRICE_LIMIT = 1000;
  
  Item(double salePercentage) {
    this.salePercentage = salePercentage;
  }
  
  // -> double
  // Returns the sale price.
  double priceSale(double totalPrice) {
    return totalPrice * (1 - this.salePercentage);
  }
  
  /* TEMPLATE
     Fields:
     ... this.salePercentage ...       -- double
     ... totalPrice ...                -- double
     ... PRICE_LIMIT ...               -- int
     
     Methods:
     ... price ...                     -- double
     ... priceSale ...                 -- double
   */
  
  
  // -> double
  // Returns the price of the total price if it reaches 1000 worth of sales.
  double price(int totalPrice) {
    if (totalPrice <= PRICE_LIMIT) {
      return totalPrice;
    } else {
      return priceSale(totalPrice);
    }
  }
    
}
