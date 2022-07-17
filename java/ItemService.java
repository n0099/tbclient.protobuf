package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ItemService extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_APP_ID;
  
  public static final Integer DEFAULT_CLIENT_TYPE;
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer app_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer client_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(468268611, "Ltbclient/ItemService;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(468268611, "Ltbclient/ItemService;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_CLIENT_TYPE = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_APP_ID = integer;
  }
  
  public ItemService(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.icon;
      if (str2 == null) {
        this.icon = "";
      } else {
        this.icon = str2;
      } 
      Integer integer1 = paramBuilder.client_type;
      if (integer1 == null) {
        this.client_type = DEFAULT_CLIENT_TYPE;
      } else {
        this.client_type = integer1;
      } 
      integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      integer = paramBuilder.app_id;
      if (integer == null) {
        this.app_id = DEFAULT_APP_ID;
      } else {
        this.app_id = integer;
      } 
    } else {
      this.icon = ((Builder)integer).icon;
      this.client_type = ((Builder)integer).client_type;
      this.type = ((Builder)integer).type;
      this.name = ((Builder)integer).name;
      this.url = ((Builder)integer).url;
      this.app_id = ((Builder)integer).app_id;
    } 
  }
  
  public ItemService(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ItemService> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer app_id;
    
    public Integer client_type;
    
    public String icon;
    
    public String name;
    
    public Integer type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(ItemService param1ItemService) {
      super(param1ItemService);
      if (param1ItemService == null)
        return; 
      this.icon = param1ItemService.icon;
      this.client_type = param1ItemService.client_type;
      this.type = param1ItemService.type;
      this.name = param1ItemService.name;
      this.url = param1ItemService.url;
      this.app_id = param1ItemService.app_id;
    }
    
    public ItemService build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ItemService)interceptResult.objValue; 
      } 
      return new ItemService(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
