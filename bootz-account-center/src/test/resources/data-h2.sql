insert into account_base(id, login, state, nickname, avatar)
values (2, 'xiaozhu', 'ACTIVATED', '', ''),
       (3, 'xiaozhu2', 'ACTIVATED', '', ''),
       (4, 'xiaozhu3', 'LOCKED', '', ''),
       (5, 'xiaozhu4', 'INACTIVE', '', '');

insert into account_binding_email(id, email)
values (2, 'xiaozhu@page.pig'),
       (3, 'xiaozhu2@page.pig'),
       (5, 'xiaozhu4@page.pig');

insert into account_binding_mobile(id, mobile)
values (2, '18600000001'),
       (4, '18600000003');

insert into account_password(id, password)
values (2, 'pwd'),
       (3, '123456'),
       (4, 'password'),
       (5, 'passwd');