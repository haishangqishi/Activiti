<<<<<<< HEAD
alter table ACT_ID_MEMBERSHIP 
    drop CONSTRAINT ACT_FK_MEMB_GROUP;
    
alter table ACT_ID_MEMBERSHIP 
    drop CONSTRAINT ACT_FK_MEMB_USER;

drop index ACT_IDX_MEMB_GROUP;
drop index ACT_IDX_MEMB_USER;

drop table  ACT_ID_INFO;
drop table  ACT_ID_MEMBERSHIP;
drop table  ACT_ID_GROUP;
drop table  ACT_ID_USER;
=======
alter table ACT_ID_MEMBERSHIP 
    drop CONSTRAINT ACT_FK_MEMB_GROUP;
    
alter table ACT_ID_MEMBERSHIP 
    drop CONSTRAINT ACT_FK_MEMB_USER;

drop index ACT_IDX_MEMB_GROUP;
drop index ACT_IDX_MEMB_USER;

drop table  ACT_ID_INFO;
drop table  ACT_ID_MEMBERSHIP;
drop table  ACT_ID_GROUP;
drop table  ACT_ID_USER;
>>>>>>> 4417bb216feb631658be5fb53da2a693926f6001
