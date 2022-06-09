create table account (
  account uuid not null, 
  active varchar(255), 
  dob timestamp, 
  user_role varchar(255), 
  primary key (account)
);
create table shoppingmall_auth (
  id varchar(255) not null, 
  created_at timestamp, 
  created_by varchar(255), 
  last_modified_at timestamp, 
  last_modified_by varchar(255), 
  version int4 not null, 
  password varchar(255), 
  username varchar(255), 
  primary key (id)
);
