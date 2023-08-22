package p341task13;


public class GreenHouseController {

    public static void main(String[] args) {
        GreenHouseControls gc = new GreenHouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
                gc.new FanOn(1500),
                gc.new FanOff(1980)
        };

        gc.addEvent(gc.new Restart(2000, eventList));

        if (args.length == 1) {
            gc.addEvent(new GreenHouseControls.Terminate(new Integer(args[0])));
        }

        gc.run();
    }
}