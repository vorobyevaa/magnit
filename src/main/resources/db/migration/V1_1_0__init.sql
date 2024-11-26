
CREATE TABLE IF NOT EXISTS public.forms
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS public.types
(
    id  SERIAL PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS public.locations
(
    id  SERIAL PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS public.countries
(
    id  SERIAL PRIMARY KEY,
    name text
);

CREATE TABLE IF NOT EXISTS public.regions
(
    id  SERIAL PRIMARY KEY,
    name varchar(255),
    country_id int REFERENCES public.countries(id)
);

CREATE TABLE IF NOT EXISTS public.towns
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    is_not_specified boolean default false,
    is_lead boolean default false,
    region_id int REFERENCES public.regions(id)
);

CREATE TABLE IF NOT EXISTS public.items
(
    id SERIAL PRIMARY KEY,
    town_id int REFERENCES public.towns(id),
    form_id int REFERENCES public.forms(id),
    type_id int REFERENCES public.types(id),
    location_id int REFERENCES public.locations(id)
);

