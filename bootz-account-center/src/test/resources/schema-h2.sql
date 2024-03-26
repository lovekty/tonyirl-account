
CREATE TABLE account_base
(
    id          BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    login       VARCHAR(64)                             NOT NULL,
    state       VARCHAR(32)                             NOT NULL,
    nickname    VARCHAR(256)                            NOT NULL,
    avatar      VARCHAR(512)                            NOT NULL,
    add_time    TIMESTAMP,
    update_time TIMESTAMP,
    CONSTRAINT pk_account_base PRIMARY KEY (id)
);

CREATE TABLE account_binding_email
(
    id       BIGINT       NOT NULL,
    email    VARCHAR(128) NOT NULL,
    add_time TIMESTAMP,
    CONSTRAINT pk_account_binding_email PRIMARY KEY (id)
);

CREATE TABLE account_binding_mobile
(
    id       BIGINT      NOT NULL,
    mobile   VARCHAR(32) NOT NULL,
    add_time TIMESTAMP,
    CONSTRAINT pk_account_binding_mobile PRIMARY KEY (id)
);

CREATE TABLE account_password
(
    id       BIGINT       NOT NULL,
    password VARCHAR(128) NOT NULL,
    add_time TIMESTAMP,
    CONSTRAINT pk_account_password PRIMARY KEY (id)
);

ALTER TABLE account_base
    ADD CONSTRAINT uc_account_base_login UNIQUE (login);

ALTER TABLE account_binding_email
    ADD CONSTRAINT uc_account_binding_email_email UNIQUE (email);

ALTER TABLE account_binding_mobile
    ADD CONSTRAINT uc_account_binding_mobile_mobile UNIQUE (mobile);

ALTER TABLE account_binding_email
    ADD CONSTRAINT FK_ACCOUNT_BINDING_EMAIL_ON_ID FOREIGN KEY (id) REFERENCES account_base (id) ON DELETE CASCADE;

ALTER TABLE account_binding_mobile
    ADD CONSTRAINT FK_ACCOUNT_BINDING_MOBILE_ON_ID FOREIGN KEY (id) REFERENCES account_base (id) ON DELETE CASCADE;

ALTER TABLE account_password
    ADD CONSTRAINT FK_ACCOUNT_PASSWORD_ON_ID FOREIGN KEY (id) REFERENCES account_base (id) ON DELETE CASCADE;