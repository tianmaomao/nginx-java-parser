package com.inspur.icp.nginxparser;

import org.junit.Test;

import static com.inspur.icp.nginxparser.TestUtils.assertParam;

public class LuaTest extends ParseTestBase {
    @Test
    public void testC1() throws Exception {
        NgxConfig conf = parse("lua/c1.conf");
        NgxParam lua = conf.findParam("location", "content_by_lua");
        assertParam(lua,
                "content_by_lua",
                "'\n" +
                        "        local name = ngx.var.arg_name or \"Anonymous\"\n" +
                        "        ngx.say(\"Hello, \", name, \"!\")\n" +
                        "    '");
    }
}
