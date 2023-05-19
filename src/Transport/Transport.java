package Transport;

public class Transport
{
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private static String color;
    private static int speed;
    String defaulta = "Default";

    public Transport(String brand, String model, int year, String country, String color, int speed)
    {
        if (brand.equals("") || brand.equals(null))
        {
            this.brand = defaulta;
        }
        else
        {
            this.brand = brand;
        }
        if (model.equals("") || model.equals(null))
        {
            this.model = defaulta;
        }
        else
        {
            this.model = model;
        }
        if (year >= 1900 && year <= 2023)
        {
            this.year = year;
        }
        else
        {
            this.year = 2000;
        }
        if (country.equals("") || country.equals(null))
        {
            this.country = defaulta;
        }
        else
        {
            this.country = country;
        }
        if (color.equals("") || color.equals(null))
        {
            this.color = defaulta;
        }
        else
        {
            this.color = color;
        }
        if (speed < 60 || speed > 300)
        {
            this.speed = 60;
        }
        else
        {
            this.speed = speed;
        }
    }

    public int getSpeed()
    {
        return this.speed;
    }

    public int getYear()
    {
        return year;
    }

    public  String getBrand()
    {
        return brand;
    }

    public String getColor()
    {
        return color;
    }

    public  String getCountry()
    {
        return country;
    }

    public  String getModel()
    {
        return model;
    }

    public void setColor(String color)
    {
        if (color.equals("") || color.equals(null))
        {
            this.color = defaulta;
        }
        else
        {
            this.color = color;
        }
    }

    public void setSpeed(int speed)
    {
        if (speed < 60)
        {
            this.speed = 60;
        }
        else
        {
            this.speed = speed;
        }
    }
}
