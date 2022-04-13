import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FrsTabInfo;

public final class FrsTabInfo extends Message {
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
    super((Message.Builder)paramBuilder);
    Integer integer;
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
      integer = paramBuilder.need_page;
      if (integer == null) {
        this.need_page = DEFAULT_NEED_PAGE;
      } else {
        this.need_page = integer;
      } 
    } else {
      this.tab_id = ((Builder)integer).tab_id;
      this.tab_type = ((Builder)integer).tab_type;
      this.tab_name = ((Builder)integer).tab_name;
      this.tab_url = ((Builder)integer).tab_url;
      this.tab_gid = ((Builder)integer).tab_gid;
      this.tab_title = ((Builder)integer).tab_title;
      this.is_general_tab = ((Builder)integer).is_general_tab;
      this.tab_code = ((Builder)integer).tab_code;
      this.tab_version = ((Builder)integer).tab_version;
      this.is_default = ((Builder)integer).is_default;
      this.need_page = ((Builder)integer).need_page;
    } 
  }
}
