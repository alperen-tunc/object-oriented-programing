package _04_factory._01_beispiel_geometrische_formen._02nachher.variant3;

import _04_factory._01_beispiel_geometrische_formen._02nachher.formen.Form;
import _04_factory._01_beispiel_geometrische_formen._02nachher.formen.Rechteck;

public class RechteckFactory extends FormFactory
{

    @Override
    public Form createForm()
    {
        return new Rechteck();
    }
}
