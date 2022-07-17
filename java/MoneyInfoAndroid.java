package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MoneyInfoAndroid extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_DEFAULT;
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final Integer DEFAULT_MONEY;
  
  public static final String DEFAULT_MONTHS = "";
  
  public static final Integer DEFAULT_ORIGINAL_COST;
  
  public static final String DEFAULT_PACKET_TEXT = "";
  
  public static final String DEFAULT_PAYMENT_POS_KEY = "";
  
  public static final String DEFAULT_PRODUCT_ID = "";
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public static final Integer DEFAULT_SOCRES;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer _default;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer money;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String months;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer original_cost;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String packet_text;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String payment_pos_key;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String product_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer props_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer socres;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1214955440, "Ltbclient/MoneyInfoAndroid;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1214955440, "Ltbclient/MoneyInfoAndroid;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_PROPS_ID = integer;
    DEFAULT_SOCRES = integer;
    DEFAULT_MONEY = integer;
    DEFAULT_DEFAULT = integer;
    DEFAULT_ORIGINAL_COST = integer;
  }
  
  public MoneyInfoAndroid(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str3 = paramBuilder.icon;
      if (str3 == null) {
        this.icon = "";
      } else {
        this.icon = str3;
      } 
      str3 = paramBuilder.product_id;
      if (str3 == null) {
        this.product_id = "";
      } else {
        this.product_id = str3;
      } 
      Integer integer2 = paramBuilder.type;
      if (integer2 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer2;
      } 
      integer2 = paramBuilder.props_id;
      if (integer2 == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer2;
      } 
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.desc;
      if (str2 == null) {
        this.desc = "";
      } else {
        this.desc = str2;
      } 
      str2 = paramBuilder.months;
      if (str2 == null) {
        this.months = "";
      } else {
        this.months = str2;
      } 
      Integer integer1 = paramBuilder.socres;
      if (integer1 == null) {
        this.socres = DEFAULT_SOCRES;
      } else {
        this.socres = integer1;
      } 
      integer1 = paramBuilder.money;
      if (integer1 == null) {
        this.money = DEFAULT_MONEY;
      } else {
        this.money = integer1;
      } 
      integer1 = paramBuilder._default;
      if (integer1 == null) {
        this._default = DEFAULT_DEFAULT;
      } else {
        this._default = integer1;
      } 
      String str1 = paramBuilder.payment_pos_key;
      if (str1 == null) {
        this.payment_pos_key = "";
      } else {
        this.payment_pos_key = str1;
      } 
      str1 = paramBuilder.packet_text;
      if (str1 == null) {
        this.packet_text = "";
      } else {
        this.packet_text = str1;
      } 
      integer = paramBuilder.original_cost;
      if (integer == null) {
        this.original_cost = DEFAULT_ORIGINAL_COST;
      } else {
        this.original_cost = integer;
      } 
    } else {
      this.icon = ((Builder)integer).icon;
      this.product_id = ((Builder)integer).product_id;
      this.type = ((Builder)integer).type;
      this.props_id = ((Builder)integer).props_id;
      this.title = ((Builder)integer).title;
      this.desc = ((Builder)integer).desc;
      this.months = ((Builder)integer).months;
      this.socres = ((Builder)integer).socres;
      this.money = ((Builder)integer).money;
      this._default = ((Builder)integer)._default;
      this.payment_pos_key = ((Builder)integer).payment_pos_key;
      this.packet_text = ((Builder)integer).packet_text;
      this.original_cost = ((Builder)integer).original_cost;
    } 
  }
  
  public MoneyInfoAndroid(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MoneyInfoAndroid> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer _default;
    
    public String desc;
    
    public String icon;
    
    public Integer money;
    
    public String months;
    
    public Integer original_cost;
    
    public String packet_text;
    
    public String payment_pos_key;
    
    public String product_id;
    
    public Integer props_id;
    
    public Integer socres;
    
    public String title;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(MoneyInfoAndroid param1MoneyInfoAndroid) {
      super(param1MoneyInfoAndroid);
      if (param1MoneyInfoAndroid == null)
        return; 
      this.icon = param1MoneyInfoAndroid.icon;
      this.product_id = param1MoneyInfoAndroid.product_id;
      this.type = param1MoneyInfoAndroid.type;
      this.props_id = param1MoneyInfoAndroid.props_id;
      this.title = param1MoneyInfoAndroid.title;
      this.desc = param1MoneyInfoAndroid.desc;
      this.months = param1MoneyInfoAndroid.months;
      this.socres = param1MoneyInfoAndroid.socres;
      this.money = param1MoneyInfoAndroid.money;
      this._default = param1MoneyInfoAndroid._default;
      this.payment_pos_key = param1MoneyInfoAndroid.payment_pos_key;
      this.packet_text = param1MoneyInfoAndroid.packet_text;
      this.original_cost = param1MoneyInfoAndroid.original_cost;
    }
    
    public MoneyInfoAndroid build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (MoneyInfoAndroid)interceptResult.objValue; 
      } 
      return new MoneyInfoAndroid(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
