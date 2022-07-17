package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GameCodeList extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_BEGIN_TIME;
  
  public static final Integer DEFAULT_CLAIMED_STATUS;
  
  public static final String DEFAULT_CLAIMED_VALUE = "";
  
  public static final Integer DEFAULT_END_TIME;
  
  public static final Integer DEFAULT_ITEM_ID;
  
  public static final String DEFAULT_LABEL = "";
  
  public static final Integer DEFAULT_LIST_ID;
  
  public static final Integer DEFAULT_TYPE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer begin_time;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer claimed_status;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String claimed_value;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer end_time;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer item_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String label;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer list_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1103640332, "Ltbclient/GameCodeList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1103640332, "Ltbclient/GameCodeList;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_LIST_ID = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_BEGIN_TIME = integer;
    DEFAULT_END_TIME = integer;
    DEFAULT_ITEM_ID = integer;
    DEFAULT_CLAIMED_STATUS = integer;
  }
  
  public GameCodeList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.list_id;
      if (integer2 == null) {
        this.list_id = DEFAULT_LIST_ID;
      } else {
        this.list_id = integer2;
      } 
      integer2 = paramBuilder.type;
      if (integer2 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer2;
      } 
      String str1 = paramBuilder.label;
      if (str1 == null) {
        this.label = "";
      } else {
        this.label = str1;
      } 
      Integer integer1 = paramBuilder.begin_time;
      if (integer1 == null) {
        this.begin_time = DEFAULT_BEGIN_TIME;
      } else {
        this.begin_time = integer1;
      } 
      integer1 = paramBuilder.end_time;
      if (integer1 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = integer1;
      } 
      integer1 = paramBuilder.item_id;
      if (integer1 == null) {
        this.item_id = DEFAULT_ITEM_ID;
      } else {
        this.item_id = integer1;
      } 
      integer1 = paramBuilder.claimed_status;
      if (integer1 == null) {
        this.claimed_status = DEFAULT_CLAIMED_STATUS;
      } else {
        this.claimed_status = integer1;
      } 
      str = paramBuilder.claimed_value;
      if (str == null) {
        this.claimed_value = "";
      } else {
        this.claimed_value = str;
      } 
    } else {
      this.list_id = ((Builder)str).list_id;
      this.type = ((Builder)str).type;
      this.label = ((Builder)str).label;
      this.begin_time = ((Builder)str).begin_time;
      this.end_time = ((Builder)str).end_time;
      this.item_id = ((Builder)str).item_id;
      this.claimed_status = ((Builder)str).claimed_status;
      this.claimed_value = ((Builder)str).claimed_value;
    } 
  }
  
  public GameCodeList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GameCodeList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer begin_time;
    
    public Integer claimed_status;
    
    public String claimed_value;
    
    public Integer end_time;
    
    public Integer item_id;
    
    public String label;
    
    public Integer list_id;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(GameCodeList param1GameCodeList) {
      super(param1GameCodeList);
      if (param1GameCodeList == null)
        return; 
      this.list_id = param1GameCodeList.list_id;
      this.type = param1GameCodeList.type;
      this.label = param1GameCodeList.label;
      this.begin_time = param1GameCodeList.begin_time;
      this.end_time = param1GameCodeList.end_time;
      this.item_id = param1GameCodeList.item_id;
      this.claimed_status = param1GameCodeList.claimed_status;
      this.claimed_value = param1GameCodeList.claimed_value;
    }
    
    public GameCodeList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GameCodeList)interceptResult.objValue; 
      } 
      return new GameCodeList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
