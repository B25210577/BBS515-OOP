/**
 * 
 */
package deneme;

/**
 * 
 */
public class TravelCostCalculatorr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float distance=450;
		float consumptionPer100km=7.5f;
		float fuelPrice=52;
		float highwayFee=250; 
		float numberOfPeople=3;
		
	
		float totalFuelConsumption=distance*consumptionPer100km/100;
		
		float fuelCost=totalFuelConsumption*fuelPrice;
		float totalTravelCost=fuelCost+highwayFee;
		float costPerPerson=totalTravelCost/numberOfPeople;

		
		
		
		System.out.println("Total Fuel Consumption: "+totalFuelConsumption);
		System.out.println("Fuel Cost: "+totalFuelConsumption*fuelPrice);
		System.out.println("Total Travel Cost: "+totalTravelCost);
		System.out.println("Cost Per Person: "+costPerPerson);

	}

}
