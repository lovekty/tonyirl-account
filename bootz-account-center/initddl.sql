create or replace function renew_update_time()
    returns trigger
    language plpgsql
as
$$
begin
    new.update_time = current_timestamp;
    return new;
end;
$$;


create table if not exists account_base
(
    id          bigint       not null generated always as identity
        constraint pk_acct primary key,
    login       varchar(64)  not null
        constraint uk_acct_login unique,
    state       smallint     not null,
    nickname    varchar(256) not null default '',
    avatar      varchar(512) not null default '',
    add_time    timestamptz  not null default current_timestamp,
    update_time timestamptz  not null default current_timestamp
);

create trigger trig_renew_acct_update_time
    before update
    on account_base
    for each row
execute function renew_update_time();

create table if not exists account_binding_mobile
(
    id       bigint      not null
        constraint pk_acct_mobile primary key,
    mobile   varchar(32) not null
        constraint uk_acct_mobile_mobile unique,
    add_time timestamptz not null default current_timestamp,
    update_time timestamptz  not null default current_timestamp
);

create trigger trig_renew_acct_mobile_update_time
    before update
    on account_binding_mobile
    for each row
execute function renew_update_time();

create table if not exists account_binding_email
(
    id       bigint       not null
        constraint pk_acct_email primary key,
    email    varchar(128) not null
        constraint uk_acct_email_email unique,
    add_time timestamptz  not null default current_timestamp,
    update_time timestamptz  not null default current_timestamp
);

create trigger trig_renew_acct_email_update_time
    before update
    on account_binding_email
    for each row
execute function renew_update_time();

create table if not exists account_password
(
    id       bigint       not null
        constraint pk_acct_pwd primary key,
    password varchar(128) not null,
    add_time timestamptz  not null default current_timestamp,
    update_time timestamptz  not null default current_timestamp
);

create trigger trig_renew_acct_pwd_update_time
    before update
    on account_password
    for each row
execute function renew_update_time();
