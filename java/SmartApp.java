package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SmartApp extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_H5_URL = "";
  
  public static final String DEFAULT_ID = "";
  
  public static final Integer DEFAULT_IS_GAME;
  
  public static final Integer DEFAULT_IS_RECOM;
  
  public static final String DEFAULT_LINK = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PIC = "";
  
  public static final Long DEFAULT_SWAN_APP_ID = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String h5_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String id;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer is_game;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer is_recom;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String pic;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT64)
  public final Long swan_app_id;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_RECOM = integer;
    DEFAULT_IS_GAME = integer;
  }
  
  public SmartApp(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.avatar;
      if (str == null) {
        this.avatar = "";
      } else {
        this.avatar = str;
      } 
      str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder._abstract;
      if (str == null) {
        this._abstract = "";
      } else {
        this._abstract = str;
      } 
      str = paramBuilder.pic;
      if (str == null) {
        this.pic = "";
      } else {
        this.pic = str;
      } 
      str = paramBuilder.h5_url;
      if (str == null) {
        this.h5_url = "";
      } else {
        this.h5_url = str;
      } 
      str = paramBuilder.id;
      if (str == null) {
        this.id = "";
      } else {
        this.id = str;
      } 
      str = paramBuilder.link;
      if (str == null) {
        this.link = "";
      } else {
        this.link = str;
      } 
      Long long_ = paramBuilder.swan_app_id;
      if (long_ == null) {
        this.swan_app_id = DEFAULT_SWAN_APP_ID;
      } else {
        this.swan_app_id = long_;
      } 
      Integer integer1 = paramBuilder.is_recom;
      if (integer1 == null) {
        this.is_recom = DEFAULT_IS_RECOM;
      } else {
        this.is_recom = integer1;
      } 
      integer = paramBuilder.is_game;
      if (integer == null) {
        this.is_game = DEFAULT_IS_GAME;
      } else {
        this.is_game = integer;
      } 
    } else {
      this.avatar = ((Builder)integer).avatar;
      this.name = ((Builder)integer).name;
      this._abstract = ((Builder)integer)._abstract;
      this.pic = ((Builder)integer).pic;
      this.h5_url = ((Builder)integer).h5_url;
      this.id = ((Builder)integer).id;
      this.link = ((Builder)integer).link;
      this.swan_app_id = ((Builder)integer).swan_app_id;
      this.is_recom = ((Builder)integer).is_recom;
      this.is_game = ((Builder)integer).is_game;
    } 
  }
  
  public SmartApp(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1541270023, "Ltbclient/SmartApp;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1541270023, "Ltbclient/SmartApp;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<SmartApp> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String _abstract;
    
    public String avatar;
    
    public String h5_url;
    
    public String id;
    
    public Integer is_game;
    
    public Integer is_recom;
    
    public String link;
    
    public String name;
    
    public String pic;
    
    public Long swan_app_id;
    
    public Builder() {}
    
    public Builder(SmartApp param1SmartApp) {
      super(param1SmartApp);
      if (param1SmartApp == null)
        return; 
      this.avatar = param1SmartApp.avatar;
      this.name = param1SmartApp.name;
      this._abstract = param1SmartApp._abstract;
      this.pic = param1SmartApp.pic;
      this.h5_url = param1SmartApp.h5_url;
      this.id = param1SmartApp.id;
      this.link = param1SmartApp.link;
      this.swan_app_id = param1SmartApp.swan_app_id;
      this.is_recom = param1SmartApp.is_recom;
      this.is_game = param1SmartApp.is_game;
    }
    
    public SmartApp build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (SmartApp)interceptResult.objValue; 
      } 
      return new SmartApp(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
