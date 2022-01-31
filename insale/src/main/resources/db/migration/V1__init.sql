CREATE TABLE IF NOT EXISTS cliente (
  idc serial,
  nombre VARCHAR(45) NOT NULL,
  usuario VARCHAR(45) NOT NULL,
  clave VARCHAR(45) NOT NULL,
  correo VARCHAR(45) NOT NULL,
  telefono VARCHAR(45) NOT NULL,
  PRIMARY KEY (idcliente));

CREATE TABLE IF NOT EXISTS empresa (
  id serial,
  nombre VARCHAR(45) NOT NULL,
  usuario VARCHAR(45) NOT NULL,
  clave VARCHAR(45) NOT NULL,
  correo VARCHAR(45) NOT NULL,
  telefono VARCHAR(45) NOT NULL,
  PRIMARY KEY (idempresa));

CREATE TABLE IF NOT EXISTS inmueble (
  id serial,
  provincia VARCHAR(45) NOT NULL,
  precio DECIMAL(10,2) NOT NULL,
  ciudad VARCHAR(45) NOT NULL,
  descripcion VARCHAR(45) NOT NULL,
  sector VARCHAR(45) NOT NULL,
  empresa_idempresa INT NOT NULL,
  PRIMARY KEY (idinmueble),
  CONSTRAINT fk_inmueble_empresa FOREIGN KEY (empresa_idempresa) REFERENCES empresa (idempresa) ON DELETE CASCADE);
