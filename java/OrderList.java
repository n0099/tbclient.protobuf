package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class OrderList extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ACTIVITY_DESC = "";
  
  public static final String DEFAULT_ACTIVITY_URL = "";
  
  public static final String DEFAULT_BUTTON_NAME = "";
  
  public static final Long DEFAULT_CREATE_TIME;
  
  public static final Long DEFAULT_FINISH_TIME;
  
  public static final Long DEFAULT_MONEY;
  
  public static final Double DEFAULT_ORDER_AMOUNT;
  
  public static final String DEFAULT_ORDER_ID = "";
  
  public static final Double DEFAULT_ORDER_YY_AMOUNT;
  
  public static final String DEFAULT_PREG_FIELD = "";
  
  public static final Integer DEFAULT_PRICE_TYPE;
  
  public static final Integer DEFAULT_SCENE_ID;
  
  public static final Long DEFAULT_SCORES;
  
  public static final Integer DEFAULT_STATUS;
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String activity_desc;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String activity_url;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String button_name;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long create_time;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT64)
  public final Long finish_time;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT64)
  public final Long money;
  
  @ProtoField(tag = 24, type = Message.Datatype.DOUBLE)
  public final Double order_amount;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String order_id;
  
  @ProtoField(tag = 23, type = Message.Datatype.DOUBLE)
  public final Double order_yy_amount;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String preg_field;
  
  @ProtoField(tag = 22, type = Message.Datatype.INT32)
  public final Integer price_type;
  
  @ProtoField(tag = 18, type = Message.Datatype.UINT32)
  public final Integer scene_id;
  
  @ProtoField(tag = 20, type = Message.Datatype.INT64)
  public final Long scores;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2037500185, "Ltbclient/OrderList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2037500185, "Ltbclient/OrderList;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_STATUS = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_CREATE_TIME = long_;
    DEFAULT_FINISH_TIME = long_;
    DEFAULT_SCENE_ID = integer;
    DEFAULT_MONEY = long_;
    DEFAULT_SCORES = long_;
    DEFAULT_PRICE_TYPE = integer;
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_ORDER_YY_AMOUNT = double_;
    DEFAULT_ORDER_AMOUNT = double_;
  }
  
  public OrderList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Double double_;
    if (paramBoolean == true) {
      String str3 = paramBuilder.order_id;
      if (str3 == null) {
        this.order_id = "";
      } else {
        this.order_id = str3;
      } 
      Integer integer3 = paramBuilder.status;
      if (integer3 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer3;
      } 
      Long long_2 = paramBuilder.create_time;
      if (long_2 == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = long_2;
      } 
      long_2 = paramBuilder.finish_time;
      if (long_2 == null) {
        this.finish_time = DEFAULT_FINISH_TIME;
      } else {
        this.finish_time = long_2;
      } 
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.activity_desc;
      if (str2 == null) {
        this.activity_desc = "";
      } else {
        this.activity_desc = str2;
      } 
      str2 = paramBuilder.activity_url;
      if (str2 == null) {
        this.activity_url = "";
      } else {
        this.activity_url = str2;
      } 
      str2 = paramBuilder.button_name;
      if (str2 == null) {
        this.button_name = "";
      } else {
        this.button_name = str2;
      } 
      Integer integer2 = paramBuilder.scene_id;
      if (integer2 == null) {
        this.scene_id = DEFAULT_SCENE_ID;
      } else {
        this.scene_id = integer2;
      } 
      Long long_1 = paramBuilder.money;
      if (long_1 == null) {
        this.money = DEFAULT_MONEY;
      } else {
        this.money = long_1;
      } 
      long_1 = paramBuilder.scores;
      if (long_1 == null) {
        this.scores = DEFAULT_SCORES;
      } else {
        this.scores = long_1;
      } 
      String str1 = paramBuilder.preg_field;
      if (str1 == null) {
        this.preg_field = "";
      } else {
        this.preg_field = str1;
      } 
      Integer integer1 = paramBuilder.price_type;
      if (integer1 == null) {
        this.price_type = DEFAULT_PRICE_TYPE;
      } else {
        this.price_type = integer1;
      } 
      Double double_1 = paramBuilder.order_yy_amount;
      if (double_1 == null) {
        this.order_yy_amount = DEFAULT_ORDER_YY_AMOUNT;
      } else {
        this.order_yy_amount = double_1;
      } 
      double_ = paramBuilder.order_amount;
      if (double_ == null) {
        this.order_amount = DEFAULT_ORDER_AMOUNT;
      } else {
        this.order_amount = double_;
      } 
    } else {
      this.order_id = ((Builder)double_).order_id;
      this.status = ((Builder)double_).status;
      this.create_time = ((Builder)double_).create_time;
      this.finish_time = ((Builder)double_).finish_time;
      this.title = ((Builder)double_).title;
      this.activity_desc = ((Builder)double_).activity_desc;
      this.activity_url = ((Builder)double_).activity_url;
      this.button_name = ((Builder)double_).button_name;
      this.scene_id = ((Builder)double_).scene_id;
      this.money = ((Builder)double_).money;
      this.scores = ((Builder)double_).scores;
      this.preg_field = ((Builder)double_).preg_field;
      this.price_type = ((Builder)double_).price_type;
      this.order_yy_amount = ((Builder)double_).order_yy_amount;
      this.order_amount = ((Builder)double_).order_amount;
    } 
  }
  
  public OrderList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<OrderList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String activity_desc;
    
    public String activity_url;
    
    public String button_name;
    
    public Long create_time;
    
    public Long finish_time;
    
    public Long money;
    
    public Double order_amount;
    
    public String order_id;
    
    public Double order_yy_amount;
    
    public String preg_field;
    
    public Integer price_type;
    
    public Integer scene_id;
    
    public Long scores;
    
    public Integer status;
    
    public String title;
    
    public Builder() {}
    
    public Builder(OrderList param1OrderList) {
      super(param1OrderList);
      if (param1OrderList == null)
        return; 
      this.order_id = param1OrderList.order_id;
      this.status = param1OrderList.status;
      this.create_time = param1OrderList.create_time;
      this.finish_time = param1OrderList.finish_time;
      this.title = param1OrderList.title;
      this.activity_desc = param1OrderList.activity_desc;
      this.activity_url = param1OrderList.activity_url;
      this.button_name = param1OrderList.button_name;
      this.scene_id = param1OrderList.scene_id;
      this.money = param1OrderList.money;
      this.scores = param1OrderList.scores;
      this.preg_field = param1OrderList.preg_field;
      this.price_type = param1OrderList.price_type;
      this.order_yy_amount = param1OrderList.order_yy_amount;
      this.order_amount = param1OrderList.order_amount;
    }
    
    public OrderList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (OrderList)interceptResult.objValue; 
      } 
      return new OrderList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
