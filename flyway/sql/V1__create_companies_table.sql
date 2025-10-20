CREATE SCHEMA IF NOT EXISTS app;

CREATE TABLE IF NOT EXISTS app.companies (
    id SERIAL PRIMARY KEY,
    external_id UUID,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255),
    creation_date TIMESTAMPTZ,
    modification_date TIMESTAMPTZ,
    nip VARCHAR(20),
    version INT DEFAULT 0,
    open BOOLEAN DEFAULT FALSE,
    active BOOLEAN DEFAULT TRUE,
    phone VARCHAR(50),
    email VARCHAR(255),
    status VARCHAR(50),
    CONSTRAINT uk_companies_name UNIQUE (name)
);
