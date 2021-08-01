package me.libraryaddict.disguise.utilities.params.types.custom;

import me.libraryaddict.disguise.utilities.params.types.ParamInfoEnum;

/**
 * Created by libraryaddict on 1/08/2021.
 */
public class ParamInfoChatColor extends ParamInfoEnum {
    public ParamInfoChatColor(Class<? extends Enum> paramClass, String name, String description) {
        super(paramClass, name, description);
    }

    @Override
    public String toString(Object object) {
        return ((Enum) object).name();
    }
}
