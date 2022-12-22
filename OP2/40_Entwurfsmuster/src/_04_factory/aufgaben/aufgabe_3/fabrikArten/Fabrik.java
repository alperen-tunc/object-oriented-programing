package _04_factory.aufgaben.aufgabe_3.fabrikArten;

import _04_factory.aufgaben.aufgabe_3.pizzaSorten.*;

import java.util.HashMap;
import java.util.Map;

public abstract class Fabrik
{
    public abstract Pizza erstellePizza( String type);
    public Map<String, Pizza> fabrikMap;
}
