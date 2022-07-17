package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TiebaPlusInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_APP_COMPANY = "";
  
  public static final String DEFAULT_APP_ICON = "";
  
  public static final String DEFAULT_APP_ID = "";
  
  public static final String DEFAULT_APP_PACKAGE = "";
  
  public static final String DEFAULT_APP_POWER = "";
  
  public static final String DEFAULT_APP_PRIVACY = "";
  
  public static final String DEFAULT_APP_VERSION = "";
  
  public static final String DEFAULT_BUTTON_DESC = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_DOWNLOAD_URL = "";
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_H5_JUMP_NUMBER = "";
  
  public static final String DEFAULT_H5_JUMP_PARAM = "";
  
  public static final Integer DEFAULT_H5_JUMP_TYPE;
  
  public static final Integer DEFAULT_IS_APPOINT;
  
  public static final String DEFAULT_ITEM_ID = "";
  
  public static final Integer DEFAULT_JUMP_SETTING;
  
  public static final Integer DEFAULT_JUMP_TYPE;
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final Integer DEFAULT_TARGET_TYPE;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_WX_THUMBNAIL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String app_company;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String app_icon;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String app_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String app_package;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String app_power;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String app_privacy;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String app_version;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String button_desc;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String download_url;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String h5_jump_number;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String h5_jump_param;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer h5_jump_type;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer is_appoint;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String item_id;
  
  @ProtoField(tag = 21, type = Message.Datatype.INT32)
  public final Integer jump_setting;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer jump_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 19)
  public final PluginUser plugin_user;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer target_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String wx_thumbnail;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1936198446, "Ltbclient/TiebaPlusInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1936198446, "Ltbclient/TiebaPlusInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TARGET_TYPE = integer;
    DEFAULT_H5_JUMP_TYPE = integer;
    DEFAULT_JUMP_TYPE = integer;
    DEFAULT_IS_APPOINT = integer;
    DEFAULT_JUMP_SETTING = integer;
  }
  
  public TiebaPlusInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str5 = paramBuilder.title;
      if (str5 == null) {
        this.title = "";
      } else {
        this.title = str5;
      } 
      str5 = paramBuilder.desc;
      if (str5 == null) {
        this.desc = "";
      } else {
        this.desc = str5;
      } 
      str5 = paramBuilder.jump_url;
      if (str5 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str5;
      } 
      str5 = paramBuilder.download_url;
      if (str5 == null) {
        this.download_url = "";
      } else {
        this.download_url = str5;
      } 
      str5 = paramBuilder.app_id;
      if (str5 == null) {
        this.app_id = "";
      } else {
        this.app_id = str5;
      } 
      str5 = paramBuilder.app_icon;
      if (str5 == null) {
        this.app_icon = "";
      } else {
        this.app_icon = str5;
      } 
      str5 = paramBuilder.app_package;
      if (str5 == null) {
        this.app_package = "";
      } else {
        this.app_package = str5;
      } 
      str5 = paramBuilder.app_version;
      if (str5 == null) {
        this.app_version = "";
      } else {
        this.app_version = str5;
      } 
      str5 = paramBuilder.app_privacy;
      if (str5 == null) {
        this.app_privacy = "";
      } else {
        this.app_privacy = str5;
      } 
      str5 = paramBuilder.app_power;
      if (str5 == null) {
        this.app_power = "";
      } else {
        this.app_power = str5;
      } 
      str5 = paramBuilder.app_company;
      if (str5 == null) {
        this.app_company = "";
      } else {
        this.app_company = str5;
      } 
      Integer integer4 = paramBuilder.target_type;
      if (integer4 == null) {
        this.target_type = DEFAULT_TARGET_TYPE;
      } else {
        this.target_type = integer4;
      } 
      integer4 = paramBuilder.h5_jump_type;
      if (integer4 == null) {
        this.h5_jump_type = DEFAULT_H5_JUMP_TYPE;
      } else {
        this.h5_jump_type = integer4;
      } 
      String str4 = paramBuilder.h5_jump_number;
      if (str4 == null) {
        this.h5_jump_number = "";
      } else {
        this.h5_jump_number = str4;
      } 
      str4 = paramBuilder.h5_jump_param;
      if (str4 == null) {
        this.h5_jump_param = "";
      } else {
        this.h5_jump_param = str4;
      } 
      Integer integer3 = paramBuilder.jump_type;
      if (integer3 == null) {
        this.jump_type = DEFAULT_JUMP_TYPE;
      } else {
        this.jump_type = integer3;
      } 
      String str3 = paramBuilder.item_id;
      if (str3 == null) {
        this.item_id = "";
      } else {
        this.item_id = str3;
      } 
      Integer integer2 = paramBuilder.is_appoint;
      if (integer2 == null) {
        this.is_appoint = DEFAULT_IS_APPOINT;
      } else {
        this.is_appoint = integer2;
      } 
      this.plugin_user = paramBuilder.plugin_user;
      String str2 = paramBuilder.forum_name;
      if (str2 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str2;
      } 
      Integer integer1 = paramBuilder.jump_setting;
      if (integer1 == null) {
        this.jump_setting = DEFAULT_JUMP_SETTING;
      } else {
        this.jump_setting = integer1;
      } 
      String str1 = paramBuilder.wx_thumbnail;
      if (str1 == null) {
        this.wx_thumbnail = "";
      } else {
        this.wx_thumbnail = str1;
      } 
      str = paramBuilder.button_desc;
      if (str == null) {
        this.button_desc = "";
      } else {
        this.button_desc = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.desc = ((Builder)str).desc;
      this.jump_url = ((Builder)str).jump_url;
      this.download_url = ((Builder)str).download_url;
      this.app_id = ((Builder)str).app_id;
      this.app_icon = ((Builder)str).app_icon;
      this.app_package = ((Builder)str).app_package;
      this.app_version = ((Builder)str).app_version;
      this.app_privacy = ((Builder)str).app_privacy;
      this.app_power = ((Builder)str).app_power;
      this.app_company = ((Builder)str).app_company;
      this.target_type = ((Builder)str).target_type;
      this.h5_jump_type = ((Builder)str).h5_jump_type;
      this.h5_jump_number = ((Builder)str).h5_jump_number;
      this.h5_jump_param = ((Builder)str).h5_jump_param;
      this.jump_type = ((Builder)str).jump_type;
      this.item_id = ((Builder)str).item_id;
      this.is_appoint = ((Builder)str).is_appoint;
      this.plugin_user = ((Builder)str).plugin_user;
      this.forum_name = ((Builder)str).forum_name;
      this.jump_setting = ((Builder)str).jump_setting;
      this.wx_thumbnail = ((Builder)str).wx_thumbnail;
      this.button_desc = ((Builder)str).button_desc;
    } 
  }
  
  public TiebaPlusInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TiebaPlusInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String app_company;
    
    public String app_icon;
    
    public String app_id;
    
    public String app_package;
    
    public String app_power;
    
    public String app_privacy;
    
    public String app_version;
    
    public String button_desc;
    
    public String desc;
    
    public String download_url;
    
    public String forum_name;
    
    public String h5_jump_number;
    
    public String h5_jump_param;
    
    public Integer h5_jump_type;
    
    public Integer is_appoint;
    
    public String item_id;
    
    public Integer jump_setting;
    
    public Integer jump_type;
    
    public String jump_url;
    
    public PluginUser plugin_user;
    
    public Integer target_type;
    
    public String title;
    
    public String wx_thumbnail;
    
    public Builder() {}
    
    public Builder(TiebaPlusInfo param1TiebaPlusInfo) {
      super(param1TiebaPlusInfo);
      if (param1TiebaPlusInfo == null)
        return; 
      this.title = param1TiebaPlusInfo.title;
      this.desc = param1TiebaPlusInfo.desc;
      this.jump_url = param1TiebaPlusInfo.jump_url;
      this.download_url = param1TiebaPlusInfo.download_url;
      this.app_id = param1TiebaPlusInfo.app_id;
      this.app_icon = param1TiebaPlusInfo.app_icon;
      this.app_package = param1TiebaPlusInfo.app_package;
      this.app_version = param1TiebaPlusInfo.app_version;
      this.app_privacy = param1TiebaPlusInfo.app_privacy;
      this.app_power = param1TiebaPlusInfo.app_power;
      this.app_company = param1TiebaPlusInfo.app_company;
      this.target_type = param1TiebaPlusInfo.target_type;
      this.h5_jump_type = param1TiebaPlusInfo.h5_jump_type;
      this.h5_jump_number = param1TiebaPlusInfo.h5_jump_number;
      this.h5_jump_param = param1TiebaPlusInfo.h5_jump_param;
      this.jump_type = param1TiebaPlusInfo.jump_type;
      this.item_id = param1TiebaPlusInfo.item_id;
      this.is_appoint = param1TiebaPlusInfo.is_appoint;
      this.plugin_user = param1TiebaPlusInfo.plugin_user;
      this.forum_name = param1TiebaPlusInfo.forum_name;
      this.jump_setting = param1TiebaPlusInfo.jump_setting;
      this.wx_thumbnail = param1TiebaPlusInfo.wx_thumbnail;
      this.button_desc = param1TiebaPlusInfo.button_desc;
    }
    
    public TiebaPlusInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TiebaPlusInfo)interceptResult.objValue; 
      } 
      return new TiebaPlusInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
