create table if not exists component_attach_file (
   id char(26),
   name varchar(1000),
   path varchar(2000),
   capacity bigint,
   extension varchar(16),
   created timestamp,
   creator varchar(26),
   modified timestamp,
   modifier varchar(26),
   constraint pk_component_attach_file primary key (id)
);

create table if not exists component_attach_file_group (
   id char(26),
   entity_id char(26),
   file_id char(26),
   created timestamp,
   creator varchar(26),
   constraint pk_component_attach_file_group primary key (id),
   constraint fk_component_attach_file_group_file_id foreign key (file_id) references component_attach_file(id)
);
