package Interfaces;

import ThemePark.Visitor;

public interface IRestrictable {

    public Boolean isAllowedTo(Visitor visitor);
}
