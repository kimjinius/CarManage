package org.tukorea.myweb.domain;

public class HyundaiCarVO {

	   private Integer carId;
	   private String carModel;
	   private String carColor;
	   private String carPrice;
	   private String carFuel;
	   private String carFuelefficiency;
	   private Integer carStock;
	   private String carOutput;
	   private String carEngine;
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(String carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarFuel() {
		return carFuel;
	}
	public void setCarFuel(String carFuel) {
		this.carFuel = carFuel;
	}
	public String getCarFuelefficiency() {
		return carFuelefficiency;
	}
	public void setCarFuelefficiency(String carFuelefficiency) {
		this.carFuelefficiency = carFuelefficiency;
	}
	public Integer getCarStock() {
		return carStock;
	}
	public void setCarStock(Integer carStock) {
		this.carStock = carStock;
	}
	public String getCarOutput() {
		return carOutput;
	}
	public void setCarOutput(String carOutput) {
		this.carOutput = carOutput;
	}
	public String getCarEngine() {
		return carEngine;
	}
	public void setCarEngine(String carEngine) {
		this.carEngine = carEngine;
	}
	@Override
	public String toString() {
		return "HyundaiCarVO [carId=" + carId + ", carModel=" + carModel + ", carColor=" + carColor + ", carPrice="
				+ carPrice + ", carFuel=" + carFuel + ", carFuelefficiency=" + carFuelefficiency + ", carStock="
				+ carStock + ", carOutput=" + carOutput + ", carEngine=" + carEngine + "]";
	}
}
