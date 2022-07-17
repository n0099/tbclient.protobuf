package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeBgProp extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ACTIVITY_URL = "";
  
  public static final String DEFAULT_DESCRIPTION = "";
  
  public static final String DEFAULT_EXAMPLE_URL = "";
  
  public static final Integer DEFAULT_FREE_USER_LEVEL;
  
  public static final Integer DEFAULT_IN_USE;
  
  public static final Integer DEFAULT_IS_FINISHED;
  
  public static final String DEFAULT_PERMISSION = "";
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public static final String DEFAULT_PROPS_STATE_IMG = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String activity_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String description;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String example_url;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer free_user_level;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer in_use;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer is_finished;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String permission;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer props_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String props_state_img;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1934981076, "Ltbclient/ThemeBgProp;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1934981076, "Ltbclient/ThemeBgProp;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_IN_USE = integer;
    DEFAULT_FREE_USER_LEVEL = integer;
    DEFAULT_IS_FINISHED = integer;
  }
  
  public ThemeBgProp(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.props_id;
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
      str2 = paramBuilder.description;
      if (str2 == null) {
        this.description = "";
      } else {
        this.description = str2;
      } 
      str2 = paramBuilder.example_url;
      if (str2 == null) {
        this.example_url = "";
      } else {
        this.example_url = str2;
      } 
      str2 = paramBuilder.permission;
      if (str2 == null) {
        this.permission = "";
      } else {
        this.permission = str2;
      } 
      str2 = paramBuilder.props_state_img;
      if (str2 == null) {
        this.props_state_img = "";
      } else {
        this.props_state_img = str2;
      } 
      Integer integer1 = paramBuilder.in_use;
      if (integer1 == null) {
        this.in_use = DEFAULT_IN_USE;
      } else {
        this.in_use = integer1;
      } 
      integer1 = paramBuilder.free_user_level;
      if (integer1 == null) {
        this.free_user_level = DEFAULT_FREE_USER_LEVEL;
      } else {
        this.free_user_level = integer1;
      } 
      String str1 = paramBuilder.activity_url;
      if (str1 == null) {
        this.activity_url = "";
      } else {
        this.activity_url = str1;
      } 
      integer = paramBuilder.is_finished;
      if (integer == null) {
        this.is_finished = DEFAULT_IS_FINISHED;
      } else {
        this.is_finished = integer;
      } 
    } else {
      this.props_id = ((Builder)integer).props_id;
      this.title = ((Builder)integer).title;
      this.description = ((Builder)integer).description;
      this.example_url = ((Builder)integer).example_url;
      this.permission = ((Builder)integer).permission;
      this.props_state_img = ((Builder)integer).props_state_img;
      this.in_use = ((Builder)integer).in_use;
      this.free_user_level = ((Builder)integer).free_user_level;
      this.activity_url = ((Builder)integer).activity_url;
      this.is_finished = ((Builder)integer).is_finished;
    } 
  }
  
  public ThemeBgProp(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeBgProp> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String activity_url;
    
    public String description;
    
    public String example_url;
    
    public Integer free_user_level;
    
    public Integer in_use;
    
    public Integer is_finished;
    
    public String permission;
    
    public Integer props_id;
    
    public String props_state_img;
    
    public String title;
    
    public Builder() {}
    
    public Builder(ThemeBgProp param1ThemeBgProp) {
      super(param1ThemeBgProp);
      if (param1ThemeBgProp == null)
        return; 
      this.props_id = param1ThemeBgProp.props_id;
      this.title = param1ThemeBgProp.title;
      this.description = param1ThemeBgProp.description;
      this.example_url = param1ThemeBgProp.example_url;
      this.permission = param1ThemeBgProp.permission;
      this.props_state_img = param1ThemeBgProp.props_state_img;
      this.in_use = param1ThemeBgProp.in_use;
      this.free_user_level = param1ThemeBgProp.free_user_level;
      this.activity_url = param1ThemeBgProp.activity_url;
      this.is_finished = param1ThemeBgProp.is_finished;
    }
    
    public ThemeBgProp build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ThemeBgProp)interceptResult.objValue; 
      } 
      return new ThemeBgProp(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
