insert into account_base(id, login, state, nickname, avatar)
values (1, 'xiaozhu', 'ACTIVATED', '', ''),
       (2, 'xiaozhu2', 'ACTIVATED', '', ''),
       (3, 'xiaozhu3', 'LOCKED', '', ''),
       (4, 'xiaozhu4', 'INACTIVE', '', '');

insert into account_binding_email(id, email)
values (1, 'xiaozhu@page.pig'),
       (2, 'xiaozhu2@page.pig'),
       (4, 'xiaozhu4@page.pig');

insert into account_binding_mobile(id, mobile)
values (1, '18600000001'),
       (3, '18600000003');

insert into account_password(id, password)
values (1, 'pwd'),
       (2, '123456'),
       (3, 'password'),
       (4, 'passwd');