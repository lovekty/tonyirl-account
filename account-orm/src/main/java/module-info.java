module tonyirl.account.orm {
    requires transitive tonyirl.account.base;

    exports me.tony.tonyirl.account.orm.config;
    exports me.tony.tonyirl.account.orm.domain;
    exports me.tony.tonyirl.account.orm.typehandler;
    exports me.tony.tonyirl.account.orm.mapper
            to
            tonyirl.account.service;
}