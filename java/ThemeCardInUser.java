package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeCardInUser extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_COORDINATE = "";
  
  public static final String DEFAULT_IMG_ANDROID = "";
  
  public static final String DEFAULT_IMG_IOS = "";
  
  public static final Integer DEFAULT_LEVEL;
  
  public static final Long DEFAULT_PROPS_ID = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String coordinate;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String img_android;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String img_ios;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer level;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long props_id;
  
  static {
    DEFAULT_LEVEL = Integer.valueOf(0);
  }
  
  public ThemeCardInUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.props_id;
      if (long_ == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = long_;
      } 
      String str = paramBuilder.img_ios;
      if (str == null) {
        this.img_ios = "";
      } else {
        this.img_ios = str;
      } 
      str = paramBuilder.coordinate;
      if (str == null) {
        this.coordinate = "";
      } else {
        this.coordinate = str;
      } 
      str = paramBuilder.img_android;
      if (str == null) {
        this.img_android = "";
      } else {
        this.img_android = str;
      } 
      integer = paramBuilder.level;
      if (integer == null) {
        this.level = DEFAULT_LEVEL;
      } else {
        this.level = integer;
      } 
    } else {
      this.props_id = ((Builder)integer).props_id;
      this.img_ios = ((Builder)integer).img_ios;
      this.coordinate = ((Builder)integer).coordinate;
      this.img_android = ((Builder)integer).img_android;
      this.level = ((Builder)integer).level;
    } 
  }
  
  public ThemeCardInUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1533901276, "Ltbclient/ThemeCardInUser;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1533901276, "Ltbclient/ThemeCardInUser;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ThemeCardInUser> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String coordinate;
    
    public String img_android;
    
    public String img_ios;
    
    public Integer level;
    
    public Long props_id;
    
    public Builder() {}
    
    public Builder(ThemeCardInUser param1ThemeCardInUser) {
      super(param1ThemeCardInUser);
      if (param1ThemeCardInUser == null)
        return; 
      this.props_id = param1ThemeCardInUser.props_id;
      this.img_ios = param1ThemeCardInUser.img_ios;
      this.coordinate = param1ThemeCardInUser.coordinate;
      this.img_android = param1ThemeCardInUser.img_android;
      this.level = param1ThemeCardInUser.level;
    }
    
    public ThemeCardInUser build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ThemeCardInUser)interceptResult.objValue; 
      } 
      return new ThemeCardInUser(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
