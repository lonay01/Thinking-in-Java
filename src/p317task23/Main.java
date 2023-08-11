package p317task23;


import p317task22.Event;
import p317task22.GreenHouseControls;


public class Main extends GreenHouseControls {


        private boolean wet = false;
        public class WetOn extends p317task22.Event {

            public WetOn(long delayTime) {
                super(delayTime);
            }

            @Override
            public void action() {
                wet = true;
            }

            @Override
            public String toString() {
                return "Влажность включен";
            }
        }

        public class WetOff extends p317task22.Event {

            public WetOff(long delayTime) {
                super(delayTime);
            }

            @Override
            public void action() {
                wet = false;
            }

            @Override
            public String toString() {
                return "Влажность выключен";
            }
        }


    public static void main(String[] args) {
        Main gc = new Main();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
                gc.new FanOn(1500),
                gc.new FanOff(1980),
                gc.new WaterOff(2000),
                gc.new WetOn(2222)
        };

        gc.addEvent(gc.new Restart(2500, eventList));

        if (args.length == 1) {
            gc.addEvent(new GreenHouseControls.Terminate(new Integer(args[0])));
        }

        gc.run();
    }
}
