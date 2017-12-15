/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     2017/12/15 星期五 19:09:57                      */
/*==============================================================*/


if exists(select 1 from sys.sysforeignkey where role='FK_ADVERTIS_REFERENCE_COIN_TYP') then
    alter table Advertisement
       delete foreign key FK_ADVERTIS_REFERENCE_COIN_TYP
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ADVERTIS_REFERENCE_SELLER') then
    alter table Advertisement
       delete foreign key FK_ADVERTIS_REFERENCE_SELLER
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ORDER_DA_REFERENCE_ADVERTIS') then
    alter table Order_Data
       delete foreign key FK_ORDER_DA_REFERENCE_ADVERTIS
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ORDER_DA_REFERENCE_USER') then
    alter table Order_Data
       delete foreign key FK_ORDER_DA_REFERENCE_USER
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ORDER_DA_REFERENCE_TRADE_FE') then
    alter table Order_Data
       delete foreign key FK_ORDER_DA_REFERENCE_TRADE_FE
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_USER_REFERENCE_WALLET') then
    alter table "User"
       delete foreign key FK_USER_REFERENCE_WALLET
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_WALLET_REFERENCE_WALLET_H') then
    alter table Wallet
       delete foreign key FK_WALLET_REFERENCE_WALLET_H
end if;

drop table if exists Advertisement;

drop table if exists Coin_Type;

drop table if exists Core_Seqno;

drop table if exists Order_Data;

drop table if exists Seller;

drop table if exists Trade_Fee;

drop table if exists "User";

drop table if exists Wallet;

drop table if exists Wallet_History;

/*==============================================================*/
/* Table: Advertisement                                         */
/*==============================================================*/
create table Advertisement 
(
   adId                 bigint                         not null,
   adName               varchar(50)                    null,
   sellerId             bigint                         null,
   coinTypeId           varchar(10)                    null,
   adURL                varchar(100)                   null,
   adClickNum           smallint                       null,
   adSort               smallint                       null,
   adStatus             varchar(2)                     null,
   createTime           datetime                       null,
   updateTime           datetime                       null,
   constraint PK_ADVERTISEMENT primary key clustered (adId)
);

/*==============================================================*/
/* Table: Coin_Type                                             */
/*==============================================================*/
create table Coin_Type 
(
   coinTypeId           varchar(10)                    not null,
   nameCh               varchar(10)                    null,
   nameEn               varchar(10)                    null,
   constraint PK_COIN_TYPE primary key clustered (coinTypeId)
);

comment on table Coin_Type is 
'货币英文名';

/*==============================================================*/
/* Table: Core_Seqno                                            */
/*==============================================================*/
create table Core_Seqno 
(
   seqType              varchar(30)                    not null,
   seqValue             varchar(30)                    null,
   constraint PK_CORE_SEQNO primary key clustered (seqType)
);

comment on table Core_Seqno is 
'货币英文名';

/*==============================================================*/
/* Table: Order_Data                                            */
/*==============================================================*/
create table Order_Data 
(
   tradeNo              varchar(30)                    not null,
   adId                 bigint                         null,
   userNo               bigint                         null,
   tradeFeeSeq          bigint                         null,
   orderNo              varchar(30)                    null,
   tradeType            varchar(2)                     null,
   tradeCurrency        varchar(8)                     null,
   initiatorUserNo      varchar(18)                    null,
   initiatorInfo        varchar(512)                   null,
   receiverUserNo       varchar(18)                    null,
   receiverInfo         varchar(512)                   null,
   tradeAmount          decimal(20,2)                  null,
   payMethod            varchar(2)                     null,
   tradeStatus          varchar(2)                     null,
   tradeTime            datetime                       null,
   updateTime           datetime                       null,
   constraint PK_ORDER_DATA primary key clustered (tradeNo)
);

/*==============================================================*/
/* Table: Seller                                                */
/*==============================================================*/
create table Seller 
(
   sellerId             bigint                         not null,
   sellerUsername       varchar(20)                    null,
   tradeCount           smallint                       null,
   favorableRate        smallint                       null,
   supplyPrice          smallint                       null,
   payMethod            varchar(10)                    null,
   priceMax             smallint                       null,
   priceMin             smallint                       null,
   constraint PK_SELLER primary key clustered (sellerId)
);

/*==============================================================*/
/* Table: Trade_Fee                                             */
/*==============================================================*/
create table Trade_Fee 
(
   tradeFeeSeq          bigint                         not null,
   tradeType            varchar(2)                     null,
   currency             varchar(8)                     null,
   startAmount          decimal(20,2)                  null,
   endAmount            decimal(20,2)                  null,
   fixedAmount          decimal(20,2)                  null,
   feeRate              decimal(8,4)                   null,
   singleMinFee         decimal(20,2)                  null,
   singleMaxFee         decimal(20,2)                  null,
   createTime           datetime                       null,
   updateTime           datetime                       null,
   constraint PK_TRADE_FEE primary key clustered (tradeFeeSeq)
);

/*==============================================================*/
/* Table: "User"                                                */
/*==============================================================*/
create table "User" 
(
   userNo               bigint                         not null,
   acctNo               varchar(50)                    null,
   mobilePrefix         varchar(4)                     null,
   mobile               varchar(11)                    null,
   email                varchar(40)                    null,
   payPwd               varchar(255)                   null,
   payPwdSettingStatus  varchar(2)                     null,
   currentStatus        varchar(2)                     null,
   createTime           datetime                       null,
   updateTime           datetime                       null,
   constraint PK_USER primary key clustered (userNo)
);

/*==============================================================*/
/* Table: Wallet                                                */
/*==============================================================*/
create table Wallet 
(
   acctNo               varchar(50)                    not null,
   walletHistorySeq     bigint                         null,
   userNo               varchar(18)                    null,
   currency             varchar(3)                     null,
   totalAmount          decimal(20,2)                  null,
   frozenAmount         decimal(20,2)                  null,
   accountStatus        varchar(3)                     null,
   createTime           datetime                       null,
   lastUpdateTime       datetime                       null,
   walletType           varchar(2)                     null,
   constraint PK_WALLET primary key clustered (acctNo)
);

/*==============================================================*/
/* Table: Wallet_History                                        */
/*==============================================================*/
create table Wallet_History 
(
   walletHistorySeq     bigint                         not null,
   acctNo               varchar(50)                    null,
   fundFlow             varchar(2)                     null,
   tradeAmount          decimal(20,2)                  null,
   tradeAbstract        varchar(100)                   null,
   tradeNo              varchar(30)                    null,
   tradeType            varchar(2)                     null,
   acctBalance          decimal(20,2)                  null,
   createTime           datetime                       null,
   updateTime           datetime                       null,
   constraint PK_WALLET_HISTORY primary key clustered (walletHistorySeq)
);

alter table Advertisement
   add constraint FK_ADVERTIS_REFERENCE_COIN_TYP foreign key (coinTypeId)
      references Coin_Type (coinTypeId)
      on update restrict
      on delete restrict;

alter table Advertisement
   add constraint FK_ADVERTIS_REFERENCE_SELLER foreign key (sellerId)
      references Seller (sellerId)
      on update restrict
      on delete restrict;

alter table Order_Data
   add constraint FK_ORDER_DA_REFERENCE_ADVERTIS foreign key (adId)
      references Advertisement (adId)
      on update restrict
      on delete restrict;

alter table Order_Data
   add constraint FK_ORDER_DA_REFERENCE_USER foreign key (userNo)
      references "User" (userNo)
      on update restrict
      on delete restrict;

alter table Order_Data
   add constraint FK_ORDER_DA_REFERENCE_TRADE_FE foreign key (tradeFeeSeq)
      references Trade_Fee (tradeFeeSeq)
      on update restrict
      on delete restrict;

alter table "User"
   add constraint FK_USER_REFERENCE_WALLET foreign key (acctNo)
      references Wallet (acctNo)
      on update restrict
      on delete restrict;

alter table Wallet
   add constraint FK_WALLET_REFERENCE_WALLET_H foreign key (walletHistorySeq)
      references Wallet_History (walletHistorySeq)
      on update restrict
      on delete restrict;

