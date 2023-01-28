package tbclient.PlaceOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final Integer DEFAULT_CURRENCY;
  
  public static final Integer DEFAULT_GIFT_COUNT;
  
  public static final Integer DEFAULT_GOODS_DURATION;
  
  public static final String DEFAULT_GOODS_NAME = "";
  
  public static final Integer DEFAULT_GOODS_NUM;
  
  public static final String DEFAULT_GOODS_PIC = "";
  
  public static final Integer DEFAULT_GOODS_PRICE;
  
  public static final String DEFAULT_GOODS_UNIT = "";
  
  public static final Integer DEFAULT_GOODS_USER_LEVEL;
  
  public static final Long DEFAULT_OPEN_ID;
  
  public static final String DEFAULT_ORDER_ID = "";
  
  public static final Integer DEFAULT_PAY_TYPE;
  
  public static final Integer DEFAULT_SCENE_ID;
  
  public static final Integer DEFAULT_TB_TIMESTAMP;
  
  public static final Integer DEFAULT_TDOU_NUM;
  
  public static final Integer DEFAULT_TERMINAL;
  
  public static final Integer DEFAULT_TIMESTAMP;
  
  public static final Long DEFAULT_USER_ID;
  
  @ProtoField(tag = 18, type = Message.Datatype.UINT32)
  public final Integer currency;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT32)
  public final Integer gift_count;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer goods_duration;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String goods_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer goods_num;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String goods_pic;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer goods_price;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String goods_unit;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer goods_user_level;
  
  @ProtoField(tag = 16, type = Message.Datatype.UINT64)
  public final Long open_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String order_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer pay_type;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer scene_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer tb_timestamp;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer tdou_num;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer terminal;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer timestamp;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long user_id;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TDOU_NUM = integer;
    DEFAULT_GOODS_PRICE = integer;
    DEFAULT_GOODS_NUM = integer;
    DEFAULT_PAY_TYPE = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_USER_ID = long_;
    DEFAULT_TB_TIMESTAMP = integer;
    DEFAULT_TIMESTAMP = integer;
    DEFAULT_SCENE_ID = integer;
    DEFAULT_GOODS_USER_LEVEL = integer;
    DEFAULT_GOODS_DURATION = integer;
    DEFAULT_TERMINAL = integer;
    DEFAULT_OPEN_ID = long_;
    DEFAULT_GIFT_COUNT = integer;
    DEFAULT_CURRENCY = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str3 = paramBuilder.order_id;
      if (str3 == null) {
        this.order_id = "";
      } else {
        this.order_id = str3;
      } 
      str3 = paramBuilder.goods_unit;
      if (str3 == null) {
        this.goods_unit = "";
      } else {
        this.goods_unit = str3;
      } 
      Integer integer5 = paramBuilder.tdou_num;
      if (integer5 == null) {
        this.tdou_num = DEFAULT_TDOU_NUM;
      } else {
        this.tdou_num = integer5;
      } 
      integer5 = paramBuilder.goods_price;
      if (integer5 == null) {
        this.goods_price = DEFAULT_GOODS_PRICE;
      } else {
        this.goods_price = integer5;
      } 
      integer5 = paramBuilder.goods_num;
      if (integer5 == null) {
        this.goods_num = DEFAULT_GOODS_NUM;
      } else {
        this.goods_num = integer5;
      } 
      integer5 = paramBuilder.pay_type;
      if (integer5 == null) {
        this.pay_type = DEFAULT_PAY_TYPE;
      } else {
        this.pay_type = integer5;
      } 
      Long long_2 = paramBuilder.user_id;
      if (long_2 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_2;
      } 
      Integer integer4 = paramBuilder.tb_timestamp;
      if (integer4 == null) {
        this.tb_timestamp = DEFAULT_TB_TIMESTAMP;
      } else {
        this.tb_timestamp = integer4;
      } 
      integer4 = paramBuilder.timestamp;
      if (integer4 == null) {
        this.timestamp = DEFAULT_TIMESTAMP;
      } else {
        this.timestamp = integer4;
      } 
      String str2 = paramBuilder.goods_name;
      if (str2 == null) {
        this.goods_name = "";
      } else {
        this.goods_name = str2;
      } 
      Integer integer3 = paramBuilder.scene_id;
      if (integer3 == null) {
        this.scene_id = DEFAULT_SCENE_ID;
      } else {
        this.scene_id = integer3;
      } 
      integer3 = paramBuilder.goods_user_level;
      if (integer3 == null) {
        this.goods_user_level = DEFAULT_GOODS_USER_LEVEL;
      } else {
        this.goods_user_level = integer3;
      } 
      integer3 = paramBuilder.goods_duration;
      if (integer3 == null) {
        this.goods_duration = DEFAULT_GOODS_DURATION;
      } else {
        this.goods_duration = integer3;
      } 
      String str1 = paramBuilder.goods_pic;
      if (str1 == null) {
        this.goods_pic = "";
      } else {
        this.goods_pic = str1;
      } 
      Integer integer2 = paramBuilder.terminal;
      if (integer2 == null) {
        this.terminal = DEFAULT_TERMINAL;
      } else {
        this.terminal = integer2;
      } 
      Long long_1 = paramBuilder.open_id;
      if (long_1 == null) {
        this.open_id = DEFAULT_OPEN_ID;
      } else {
        this.open_id = long_1;
      } 
      Integer integer1 = paramBuilder.gift_count;
      if (integer1 == null) {
        this.gift_count = DEFAULT_GIFT_COUNT;
      } else {
        this.gift_count = integer1;
      } 
      integer = paramBuilder.currency;
      if (integer == null) {
        this.currency = DEFAULT_CURRENCY;
      } else {
        this.currency = integer;
      } 
    } else {
      this.order_id = ((Builder)integer).order_id;
      this.goods_unit = ((Builder)integer).goods_unit;
      this.tdou_num = ((Builder)integer).tdou_num;
      this.goods_price = ((Builder)integer).goods_price;
      this.goods_num = ((Builder)integer).goods_num;
      this.pay_type = ((Builder)integer).pay_type;
      this.user_id = ((Builder)integer).user_id;
      this.tb_timestamp = ((Builder)integer).tb_timestamp;
      this.timestamp = ((Builder)integer).timestamp;
      this.goods_name = ((Builder)integer).goods_name;
      this.scene_id = ((Builder)integer).scene_id;
      this.goods_user_level = ((Builder)integer).goods_user_level;
      this.goods_duration = ((Builder)integer).goods_duration;
      this.goods_pic = ((Builder)integer).goods_pic;
      this.terminal = ((Builder)integer).terminal;
      this.open_id = ((Builder)integer).open_id;
      this.gift_count = ((Builder)integer).gift_count;
      this.currency = ((Builder)integer).currency;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer currency;
    
    public Integer gift_count;
    
    public Integer goods_duration;
    
    public String goods_name;
    
    public Integer goods_num;
    
    public String goods_pic;
    
    public Integer goods_price;
    
    public String goods_unit;
    
    public Integer goods_user_level;
    
    public Long open_id;
    
    public String order_id;
    
    public Integer pay_type;
    
    public Integer scene_id;
    
    public Integer tb_timestamp;
    
    public Integer tdou_num;
    
    public Integer terminal;
    
    public Integer timestamp;
    
    public Long user_id;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.order_id = param1DataRes.order_id;
      this.goods_unit = param1DataRes.goods_unit;
      this.tdou_num = param1DataRes.tdou_num;
      this.goods_price = param1DataRes.goods_price;
      this.goods_num = param1DataRes.goods_num;
      this.pay_type = param1DataRes.pay_type;
      this.user_id = param1DataRes.user_id;
      this.tb_timestamp = param1DataRes.tb_timestamp;
      this.timestamp = param1DataRes.timestamp;
      this.goods_name = param1DataRes.goods_name;
      this.scene_id = param1DataRes.scene_id;
      this.goods_user_level = param1DataRes.goods_user_level;
      this.goods_duration = param1DataRes.goods_duration;
      this.goods_pic = param1DataRes.goods_pic;
      this.terminal = param1DataRes.terminal;
      this.open_id = param1DataRes.open_id;
      this.gift_count = param1DataRes.gift_count;
      this.currency = param1DataRes.currency;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
