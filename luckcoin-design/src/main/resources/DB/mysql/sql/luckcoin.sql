drop table if exists Advertisement;

drop table if exists Coin_Type;

drop table if exists Core_Seqno;

drop table if exists Order_Data;

drop table if exists Seller;

drop table if exists Trade_Fee;

drop table if exists User;

drop table if exists Wallet;

drop table if exists Wallet_History;

drop table if exists Search_Data;

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
   primary key (adId)
);

/*==============================================================*/
/* Table: Coin_Type                                             */
/*==============================================================*/
create table Coin_Type 
(
   coinTypeId           varchar(10)                    not null,
   nameCh               varchar(10)                    null,
   nameEn               varchar(10)                    null,
   primary key (coinTypeId)
);

/*==============================================================*/
/* Table: Core_Seqno                                            */
/*==============================================================*/
create table Core_Seqno 
(
   seqType              varchar(30)                    not null,
   seqValue             varchar(30)                    null,
   primary key (seqType)
);

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
   primary key (tradeNo)
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
   primary key (sellerId)
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
   primary key (tradeFeeSeq)
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
   primary key (acctNo)
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
   primary key (walletHistorySeq)
);

/*==============================================================*/
/* Table: Search_Data                                           */
/*==============================================================*/
create table Search_Data 
(
   id                   varchar(30)                    not null,
   coinType             varchar(10)                    null,
   high                 varchar(10)                    null,
   low                  varchar(10)                    null,
   vol                  varchar(10)                    null,
   last                 varchar(10)                    null,
   buy                  varchar(10)                    null,
   sell                 varchar(10)                    null,
   createTime           datetime                       null,
   primary key (id)
);



