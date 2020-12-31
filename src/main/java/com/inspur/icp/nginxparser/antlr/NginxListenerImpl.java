package com.inspur.icp.nginxparser.antlr;

import com.inspur.icp.nginxparser.NgxConfig;
import org.antlr.v4.runtime.misc.NotNull;


public class NginxListenerImpl extends NginxBaseListener {

    private NgxConfig result;

    public NgxConfig getResult() {
        return result;
    }

    @Override
    public void enterConfig(@NotNull NginxParser.ConfigContext ctx) {
        result = ctx.ret;
    }
}
