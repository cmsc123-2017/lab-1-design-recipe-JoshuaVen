class JeepneyTrip {
  double distance;
  int totalPassengers;
  int discountPassengers;
  
  // constants
  final int BASE_KM = 5;
  final double EXCESS_FARE = .5;
  final int DISCOUNT_FARE = 6;
  final int BASE_FARE = 7;
  
  
  
  JeepneyTrip(double distance, int totalPassengers, int discountPassengers) {
    this.distance = distance;
    this.totalPassengers = totalPassengers;
    this.discountPassengers = discountPassengers;
  }
  
    /*... totalPassengers
      ... payment
      ... discountPassengers
      ... BASE_KM
      ... distance
      ... EXCESS_FARE
      ... DISCOUNT_FARE
      ... BASE_FARE*/
  
  // -> double
  // Returns the additional kilometers if it reaches a certain base distance.
  double excessDistance() {
    if (this.distance <= BASE_KM) {
      return 0;
    } else {
      return this.distance - BASE_KM;
    }
  }
  
  // -> double
  // Returns the total fare of passengers without discounts given the total number of passengers, number of passengers
  // with discount, and trip distance
  double computeFare() {
    return (this.totalPassengers - this.discountPassengers) * (BASE_FARE + (excessDistance() * EXCESS_FARE));
  }
  
  // -> double
  // Returns the total fare of discounted passengers given the number of passengers
  // with discount, and trip distance
  double computeFareDiscounted() {
    return this.discountPassengers * (DISCOUNT_FARE + (excessDistance() * EXCESS_FARE));
  }
  
  // -> double
  // Returns the total fare given the total number of passengers, number of passengers with discount,
  // and trip distance
  double totalFare() {
      return computeFareDiscounted() + computeFare();
  }
  
  // -> double
  // Returns the change, given the paid fare, total number of passengers, 
  // number of passengers with discount, and the trip distance.
  double fareChange(double payment) {
    return payment - totalFare();
  }
}
  
 
  