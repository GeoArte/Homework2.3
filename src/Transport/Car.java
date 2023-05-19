package Transport;

public class Car extends Transport
{
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private int registrationNumber;
    private final int numberOfSeats;
    private boolean winterTires;

    public Car(String brand, String model, int year, String country, String color, int speed, double engineVolume, String transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean winterTires)
    {
        super(brand, model, year, country, color, speed);
        if (engineVolume > 0)
        {
            this.engineVolume = engineVolume;
        }
        else
        {
            this.engineVolume = 1.5;
        }
        if (transmission == null || transmission.equals(""))
        {
            this.transmission = defaulta;
        }
        else
        {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.equals(""))
        {
            this.bodyType = defaulta;
        }
        else
        {
            this.bodyType = bodyType;
        }
        if (registrationNumber > 0)
        {
            this.registrationNumber = registrationNumber;
        }
        else
        {
            this.registrationNumber = 0;
        }
        if (numberOfSeats > 0 && numberOfSeats <= 10)
        {
            this.numberOfSeats = numberOfSeats;
        }
        else
        {
            this.numberOfSeats = 5;
        }
        this.winterTires = winterTires;
    }
    public double getEngineVolume()
    {
        return this.engineVolume;
    }

    public int getNumberOfSeats()
    {
        return numberOfSeats;
    }

    public int getRegistrationNumber()
    {
        return registrationNumber;
    }

    public String getBodyType()
    {
        return bodyType;
    }

    public String getTransmission()
    {
        return transmission;
    }
    public String getWinterTires()
    {
        if (this.winterTires = true)
        {
            return "Зимние шины";
        }
        else
        {
            return "Летние шины";
        }
    }

    public void setEngineVolume(double engineVolume)
    {
        this.engineVolume = engineVolume;
    }
    public void setTransmission(String transmission)
    {
        this.transmission = transmission;
    }
    public void setRegistrationNumber (int registrationNumber)
    {
        this.registrationNumber = registrationNumber;
    }
    public void setWinterTires (boolean winterTires)
    {
        this.winterTires = winterTires;
    }
    public void changeTiresToSeason(int month)
    {
        if (month > 2 && month < 12)
        {
            this.winterTires = false;
        }
        else
        {
            this.winterTires = true;
        }
    }
}

