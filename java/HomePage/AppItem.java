package tbclient.HomePage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AppItem extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_APP_ICON = "";
  
  public static final String DEFAULT_APP_LINK = "";
  
  public static final String DEFAULT_APP_NAME = "";
  
  public static final Integer DEFAULT_ICON_TYPE = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String app_icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String app_link;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String app_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer icon_type;
  
  public AppItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.app_name;
      if (str == null) {
        this.app_name = "";
      } else {
        this.app_name = str;
      } 
      str = paramBuilder.app_icon;
      if (str == null) {
        this.app_icon = "";
      } else {
        this.app_icon = str;
      } 
      str = paramBuilder.app_link;
      if (str == null) {
        this.app_link = "";
      } else {
        this.app_link = str;
      } 
      integer = paramBuilder.icon_type;
      if (integer == null) {
        this.icon_type = DEFAULT_ICON_TYPE;
      } else {
        this.icon_type = integer;
      } 
    } else {
      this.app_name = ((Builder)integer).app_name;
      this.app_icon = ((Builder)integer).app_icon;
      this.app_link = ((Builder)integer).app_link;
      this.icon_type = ((Builder)integer).icon_type;
    } 
  }
  
  public AppItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1162507070, "Ltbclient/HomePage/AppItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1162507070, "Ltbclient/HomePage/AppItem;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<AppItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String app_icon;
    
    public String app_link;
    
    public String app_name;
    
    public Integer icon_type;
    
    public Builder() {}
    
    public Builder(AppItem param1AppItem) {
      super(param1AppItem);
      if (param1AppItem == null)
        return; 
      this.app_name = param1AppItem.app_name;
      this.app_icon = param1AppItem.app_icon;
      this.app_link = param1AppItem.app_link;
      this.icon_type = param1AppItem.icon_type;
    }
    
    public AppItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AppItem)interceptResult.objValue; 
      } 
      return new AppItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
