insert into "Part" (type, serialnumber, name, price)
    values ('Case', '10V8-953A', 'be quiet! Pure Base 500DX', 99.89),
           ('Case', '20T9-37Z9', 'Corsair iCue 4000X', 119.90),
           ('CPU', 'TZ51-U8Q7', 'AMD Ryzen 5 3600', 227.1),
           ('CPU', 'ZU92-2J29', 'Intel Core i5-10400', 155.57),
           ('CPU', '333Z-93TG', 'Intel Xeon Platinum 8280L', 20529.81),
           ('GraphicsCard', '80IU-91Z2', 'MSI GeForce RTX 3060 Gaming X', 654),
           ('GraphicsCard', 'RT9F-87AS', 'MSI GeForce RTX 3080 Ti', 2019),
           ('Storage', 'Z76Q-1234', 'Toshiba Enterprise Capacity MG09ACA', 409.19),
           ('Storage', 'UI42-TR12', 'Samsung SSD 870 EVO', 111.9),
           ('RAM', 'IZTE-8513', 'Crucial Ballistix', 117.9),
           ('RAM', 'ZU26-Z7Z7', 'G.Skill Aegis', 63.9),
           ('PSU', 'UOI8-999A', 'be quiet! Straight Power 11 ATX 2.4', 118.45),
           ('PSU', 'UOI8-999B', 'be quiet! Straight Power 11 ATX 2.4', 141.9),
           ('Motherboard', 'ZZ18-9812', 'GIGABYTE B560M DS3H V2', 88.90);

insert into "Motherboard" (chipset, formfactor, memorylanes, socket, serialnumber)
    values ('Intel B560', 'µATX', null, 'Intel 1200', 'ZZ18-9812');

insert into "PSU" (power, rating, serialnumber)
    values (750, '80 PLUS', 'UOI8-999A'),
           (850, '80 PLUS', 'UOI8-999B');

insert into "RAM" (clock, count, memory, type, serialnumber)
    values (3200, 2, 16, 'DDR4', 'IZTE-8513'),
           (1600, 2, 8, 'DDR3', 'ZU26-Z7Z7');

insert into "Storage" (readspeed, storage, writespeed, serialnumber)
    values (null, 18000, null, 'Z76Q-1234'),
           (560, 1000, 530, 'UI42-TR12');

insert into "HDD" (rpm, serialnumber)
    values (7200, 'Z76Q-1234');

insert into "SSD" (interfacetype, serialnumber)
    values ('SATA', 'UI42-TR12');

insert into "Case" (depth, height, width, fancount, formfactor, serialnumber)
    values (450, 463, 232, 3, 'Midi-Tower', '10V8-953A'),
           (453, 466, 230, 4, 'Midi-Tower', '20T9-37Z9');

insert into "CPU" (baseclock, boostclock, corecount,threadcount,  cpusocket, includedcooler, serialnumber)
    values (3.60, 4.20, 6,12, 'AM4', true, 'TZ51-U8Q7'),
           (2.9, 4.3, 6, 12,'LGA-1200', true, 'ZU92-2J29'),
           (2.7, 4, 28, 56, 'LGA-3647', false, '333Z-93TG');

insert into "GraphicsCard" (tdp, vram, vramtype, baseclock, boostclock, serialnumber)
    values (170, 12, 'GDDR6', 1320, 1837, '80IU-91Z2'),
           (350, 12, 'GDDR6X', 1365, 1845, 'RT9F-87AS');

insert into "Customer" (id, firstname, lastname)
    values (1, 'John', 'Doo');

insert into "PC" (id, type, price, warrantyend, shouldbebuilt, manufacturer, model, customer_id)
    values (1, 'PrebuiltPC', 500, null, null, 'ASUS', '7TZ8-UI89-ZTWR', 1),
           (2, 'ConfiguredPC', 3000, null, false, null, null, 1);

insert into "PCPart" (amount, part_serialnumber, "configuredPC_id")
    values (2, '80IU-91Z2', 2),
           (1, '10V8-953A', 2);