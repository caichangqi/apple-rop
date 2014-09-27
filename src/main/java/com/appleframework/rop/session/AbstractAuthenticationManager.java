package com.appleframework.rop.session;


/**
 * @author : chenxh
 * @date: 13-8-13
 */
public abstract class AbstractAuthenticationManager implements AuthenticationManager {

    private String[] appKeys = null;

    private boolean _default = false;

    @Override
    public String[] appkeys() {
        return appKeys;
    }

    @Override
    public boolean isDefault() {
        return _default;
    }

    public void setAppKeys(String[] appKeys) {
        this.appKeys = appKeys;
    }

    public void setDefault(boolean _default) {
        this._default = _default;
    }
}
