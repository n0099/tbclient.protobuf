package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PrivatePopInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_DAY;
  
  public static final String DEFAULT_POP_CONTENT = "";
  
  public static final Integer DEFAULT_POP_FORUM_ID;
  
  public static final String DEFAULT_POP_TYPE = "";
  
  public static final String DEFAULT_POP_URL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer day;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pop_content;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer pop_forum_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pop_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pop_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1933810187, "Ltbclient/PrivatePopInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1933810187, "Ltbclient/PrivatePopInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_POP_FORUM_ID = integer;
    DEFAULT_DAY = integer;
  }
  
  public PrivatePopInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.pop_type;
      if (str2 == null) {
        this.pop_type = "";
      } else {
        this.pop_type = str2;
      } 
      str2 = paramBuilder.pop_content;
      if (str2 == null) {
        this.pop_content = "";
      } else {
        this.pop_content = str2;
      } 
      str2 = paramBuilder.pop_url;
      if (str2 == null) {
        this.pop_url = "";
      } else {
        this.pop_url = str2;
      } 
      Integer integer1 = paramBuilder.pop_forum_id;
      if (integer1 == null) {
        this.pop_forum_id = DEFAULT_POP_FORUM_ID;
      } else {
        this.pop_forum_id = integer1;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      integer = paramBuilder.day;
      if (integer == null) {
        this.day = DEFAULT_DAY;
      } else {
        this.day = integer;
      } 
    } else {
      this.pop_type = ((Builder)integer).pop_type;
      this.pop_content = ((Builder)integer).pop_content;
      this.pop_url = ((Builder)integer).pop_url;
      this.pop_forum_id = ((Builder)integer).pop_forum_id;
      this.title = ((Builder)integer).title;
      this.day = ((Builder)integer).day;
    } 
  }
  
  public PrivatePopInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PrivatePopInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer day;
    
    public String pop_content;
    
    public Integer pop_forum_id;
    
    public String pop_type;
    
    public String pop_url;
    
    public String title;
    
    public Builder() {}
    
    public Builder(PrivatePopInfo param1PrivatePopInfo) {
      super(param1PrivatePopInfo);
      if (param1PrivatePopInfo == null)
        return; 
      this.pop_type = param1PrivatePopInfo.pop_type;
      this.pop_content = param1PrivatePopInfo.pop_content;
      this.pop_url = param1PrivatePopInfo.pop_url;
      this.pop_forum_id = param1PrivatePopInfo.pop_forum_id;
      this.title = param1PrivatePopInfo.title;
      this.day = param1PrivatePopInfo.day;
    }
    
    public PrivatePopInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PrivatePopInfo)interceptResult.objValue; 
      } 
      return new PrivatePopInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
