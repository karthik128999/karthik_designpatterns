package creational;
public class mobilebuildfunction{

	public String weight;
	public int screen_size;
	public int  cam_front,cam_back;
	public String os;
	int battery;
	int storage;
	int processor;
		public mobilebuildfunction setWeight(String weight) {
		this.weight = weight;
		return(this);
	}
	public mobilebuildfunction setScreen_size(int screen_size) {
		this.screen_size = screen_size;
		return(this);
	}
	public mobilebuildfunction setCam_front(int cam_front) {
		this.cam_front = cam_front;
		return(this);
	}
	public mobilebuildfunction setCam_back(int cam_back) {
		this.cam_back = cam_back;
		return(this);
	}
	public mobilebuildfunction setOs(String os) {
		this.os = os;
		return(this);
	}
	public mobilebuildfunction setBattery(int battery) {
		this.battery = battery;
		return(this);
	}
	
	public mobilebuildfunction setStorage(int storage) {
		this.storage = storage;
		return(this);
	}
		public mobilebuildfunction setProcessor(int processor) {
		this.processor = processor;
		return(this);
	}
		public mobilefeatures getall()
		{
			return  new mobilefeatures(weight, screen_size,cam_front,cam_back,os,battery,storage,processor);
			
		}
}