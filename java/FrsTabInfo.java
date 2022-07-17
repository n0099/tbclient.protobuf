package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FrsTabInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_IS_DEFAULT;
  
  public static final Integer DEFAULT_IS_GENERAL_TAB;
  
  public static final Integer DEFAULT_NEED_PAGE;
  
  public static final String DEFAULT_TAB_CODE = "";
  
  public static final String DEFAULT_TAB_GID = "";
  
  public static final Integer DEFAULT_TAB_ID;
  
  public static final String DEFAULT_TAB_NAME = "";
  
  public static final String DEFAULT_TAB_TITLE = "";
  
  public static final Integer DEFAULT_TAB_TYPE;
  
  public static final String DEFAULT_TAB_URL = "";
  
  public static final Integer DEFAULT_TAB_VERSION;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 12)
  public final TabPic head_pics;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer is_default;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_general_tab;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer need_page;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String tab_code;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String tab_gid;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer tab_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tab_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String tab_title;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer tab_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String tab_url;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer tab_version;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-481893931, "Ltbclient/FrsTabInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-481893931, "Ltbclient/FrsTabInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAB_ID = integer;
    DEFAULT_TAB_TYPE = integer;
    DEFAULT_IS_GENERAL_TAB = integer;
    DEFAULT_TAB_VERSION = integer;
    DEFAULT_IS_DEFAULT = integer;
    DEFAULT_NEED_PAGE = integer;
  }
  
  public FrsTabInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Integer integer3 = paramBuilder.tab_id;
      if (integer3 == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = integer3;
      } 
      integer3 = paramBuilder.tab_type;
      if (integer3 == null) {
        this.tab_type = DEFAULT_TAB_TYPE;
      } else {
        this.tab_type = integer3;
      } 
      String str2 = paramBuilder.tab_name;
      if (str2 == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str2;
      } 
      str2 = paramBuilder.tab_url;
      if (str2 == null) {
        this.tab_url = "";
      } else {
        this.tab_url = str2;
      } 
      str2 = paramBuilder.tab_gid;
      if (str2 == null) {
        this.tab_gid = "";
      } else {
        this.tab_gid = str2;
      } 
      str2 = paramBuilder.tab_title;
      if (str2 == null) {
        this.tab_title = "";
      } else {
        this.tab_title = str2;
      } 
      Integer integer2 = paramBuilder.is_general_tab;
      if (integer2 == null) {
        this.is_general_tab = DEFAULT_IS_GENERAL_TAB;
      } else {
        this.is_general_tab = integer2;
      } 
      String str1 = paramBuilder.tab_code;
      if (str1 == null) {
        this.tab_code = "";
      } else {
        this.tab_code = str1;
      } 
      Integer integer1 = paramBuilder.tab_version;
      if (integer1 == null) {
        this.tab_version = DEFAULT_TAB_VERSION;
      } else {
        this.tab_version = integer1;
      } 
      integer1 = paramBuilder.is_default;
      if (integer1 == null) {
        this.is_default = DEFAULT_IS_DEFAULT;
      } else {
        this.is_default = integer1;
      } 
      integer1 = paramBuilder.need_page;
      if (integer1 == null) {
        this.need_page = DEFAULT_NEED_PAGE;
      } else {
        this.need_page = integer1;
      } 
      this.head_pics = paramBuilder.head_pics;
    } else {
      this.tab_id = paramBuilder.tab_id;
      this.tab_type = paramBuilder.tab_type;
      this.tab_name = paramBuilder.tab_name;
      this.tab_url = paramBuilder.tab_url;
      this.tab_gid = paramBuilder.tab_gid;
      this.tab_title = paramBuilder.tab_title;
      this.is_general_tab = paramBuilder.is_general_tab;
      this.tab_code = paramBuilder.tab_code;
      this.tab_version = paramBuilder.tab_version;
      this.is_default = paramBuilder.is_default;
      this.need_page = paramBuilder.need_page;
      this.head_pics = paramBuilder.head_pics;
    } 
  }
  
  public FrsTabInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FrsTabInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public TabPic head_pics;
    
    public Integer is_default;
    
    public Integer is_general_tab;
    
    public Integer need_page;
    
    public String tab_code;
    
    public String tab_gid;
    
    public Integer tab_id;
    
    public String tab_name;
    
    public String tab_title;
    
    public Integer tab_type;
    
    public String tab_url;
    
    public Integer tab_version;
    
    public Builder() {}
    
    public Builder(FrsTabInfo param1FrsTabInfo) {
      super(param1FrsTabInfo);
      if (param1FrsTabInfo == null)
        return; 
      this.tab_id = param1FrsTabInfo.tab_id;
      this.tab_type = param1FrsTabInfo.tab_type;
      this.tab_name = param1FrsTabInfo.tab_name;
      this.tab_url = param1FrsTabInfo.tab_url;
      this.tab_gid = param1FrsTabInfo.tab_gid;
      this.tab_title = param1FrsTabInfo.tab_title;
      this.is_general_tab = param1FrsTabInfo.is_general_tab;
      this.tab_code = param1FrsTabInfo.tab_code;
      this.tab_version = param1FrsTabInfo.tab_version;
      this.is_default = param1FrsTabInfo.is_default;
      this.need_page = param1FrsTabInfo.need_page;
      this.head_pics = param1FrsTabInfo.head_pics;
    }
    
    public FrsTabInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (FrsTabInfo)interceptResult.objValue; 
      } 
      return new FrsTabInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
