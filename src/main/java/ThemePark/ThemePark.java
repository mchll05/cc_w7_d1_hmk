package ThemePark;

import Interfaces.IEnjoyable;
import java.util.ArrayList;

public abstract class ThemePark implements IEnjoyable {

    ArrayList<IEnjoyable> goodAttractions;

    public ThemePark(ArrayList<IEnjoyable> goodAttractions) {
        this.goodAttractions = goodAttractions;
    }

    public String getGoodAttractions() {
        String report = "Enjoy";
        for (IEnjoyable eachobject : goodAttractions) {
            report = eachobject.getName() + eachobject.getFunRating();
            }
            return report;
        }
}


