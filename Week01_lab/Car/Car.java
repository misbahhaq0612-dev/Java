public class Car {
    private double speed;
    private double angle;
    private double fuelLevel;
    private boolean engineRunning;
    private static final double maxSpeed = 200;

    // default Constructor
    public Car() {
        this.speed = 0;
        this.angle = 0;
        this.fuelLevel = 100;
        this.engineRunning = false;
    }

    // parameterized Constructor
    public Car(double speed, double angle, double fuelLevel, boolean engineRunning) {
        this.speed = speed;
        this.angle = angle;
        this.fuelLevel = fuelLevel;
        this.engineRunning = engineRunning;
    }

    public Car(Car obj){
        this.angle = obj.angle;
         this.angle = obj.angle;
        this.fuelLevel = obj.fuelLevel;
        this.engineRunning = obj.engineRunning;
    }
    public double getSpeed() {
        return speed;
    }

    public double getAngle() {
        return angle;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setEngineRunning(boolean engineRunning) {
        this.engineRunning = engineRunning;
    }

    // start engine if there's fuel
    public void start() {
        if (fuelLevel <= 0) {
            System.out.println("Engine cannot start");
            return;
        }
        engineRunning = true;
        System.out.println("Engine Started!");
    }

    // accelerate forward, capped at maxSpeed
    public double moveFast(double acceleration) {
        if (!engineRunning) {
            System.out.println("Engine is not running");
            return speed;
        }
        for (int i = 1; i <= 10; i++) {
            if (fuelLevel < 5) {
                break; // low fuel, stop
            }
            if (speed < maxSpeed) {
                speed += acceleration;
                fuelLevel -= 5;
            }
        }
        System.out.println("Speed after moving fast: ");
        return speed;
        
    }

    // slow down, floor at 0
    public double reverse(double deceleration) {
        if (!engineRunning) {
            System.out.println("Engine is not running");
            return speed;
        }
        for (int i = 1; i <= 10; i++) {
            if (fuelLevel < 5) {
                break;
            }
            if (speed - deceleration >= 0) {
                speed -= deceleration;
                fuelLevel -= 5;
            } else {
                speed = 0; // avoid negative speed
                break;
            }
        }
        System.out.println("Speed after reversing: " );
        return speed;
    }

    // sudden speed boost + slight angle shift, costs fuel
    public double nitroBoost(double speedGain, double angleShift, double duration) {
        if (!engineRunning) {
            System.out.println("Engine is not running");
            return speed;
        }

        double fuelCost = speedGain + duration; // bigger boost = more fuel

        if (fuelLevel < fuelCost) {
            System.out.println("Fuel not enough for nitro boost!");
            return speed;
        }

        speed += speedGain;
        if (speed > maxSpeed) {
            speed = maxSpeed; // still capped
        }
        angle += angleShift;
        fuelLevel -= fuelCost;

        System.out.println("NITRO BOOST ACTIVATED! ");
        return speed;
    }

    // brake gradually, stop at 0
    public double moveSlow(double acceleration) {
        if (!engineRunning) {
            System.out.println("Engine is not running");
            return speed;
        }
        for (int i = 1; i <= 10; i++) {
            if (fuelLevel < 5) {
                break;
            }
            if (speed - acceleration >= 0) {
                speed -= acceleration;
                fuelLevel -= 5;
            } else {
                speed = 0;
                break;
            }
        }
        System.out.println("Speed after moving slow: ");
        return speed;
    }

    // add fuel, cap at 100
    public double refuel(double amount) {
        fuelLevel += amount;
        if (fuelLevel > 100) {
            fuelLevel = 100;
        }
        System.out.println("Fuel level after refueling: " );
        return fuelLevel;
    }

    // stop car and turn off engine
    public void stop() {
        engineRunning = false;
        speed = 0;
        System.out.println("Engine stopped!");
    }

    // print current car status
    @Override
    public String toString() {
        String str = "Car{" +
                "speed=" + speed +
                ", angle=" + angle +
                ", fuelLevel=" + fuelLevel +
                ", engineRunning=" + engineRunning +
                '}';
        return str;
    }
}