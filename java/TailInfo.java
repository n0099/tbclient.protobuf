package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TailInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_ICON_LINK = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final Integer DEFAULT_TAIL_TYPE = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon_link;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer tail_type;
  
  public TailInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.tail_type;
      if (integer == null) {
        this.tail_type = DEFAULT_TAIL_TYPE;
      } else {
        this.tail_type = integer;
      } 
      String str1 = paramBuilder.icon_url;
      if (str1 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str1;
      } 
      str1 = paramBuilder.icon_link;
      if (str1 == null) {
        this.icon_link = "";
      } else {
        this.icon_link = str1;
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
    } else {
      this.tail_type = ((Builder)str).tail_type;
      this.icon_url = ((Builder)str).icon_url;
      this.icon_link = ((Builder)str).icon_link;
      this.content = ((Builder)str).content;
    } 
  }
  
  public TailInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-192705229, "Ltbclient/TailInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-192705229, "Ltbclient/TailInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<TailInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String content;
    
    public String icon_link;
    
    public String icon_url;
    
    public Integer tail_type;
    
    public Builder() {}
    
    public Builder(TailInfo param1TailInfo) {
      super(param1TailInfo);
      if (param1TailInfo == null)
        return; 
      this.tail_type = param1TailInfo.tail_type;
      this.icon_url = param1TailInfo.icon_url;
      this.icon_link = param1TailInfo.icon_link;
      this.content = param1TailInfo.content;
    }
    
    public TailInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TailInfo)interceptResult.objValue; 
      } 
      return new TailInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
