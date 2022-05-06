package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Banner extends Message {
  public static final Integer DEFAULT_BANNER_TYPE;
  
  public static final String DEFAULT_BANNER_URL = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_OBJ_ID = "";
  
  public static final String DEFAULT_TAG_NAME = "";
  
  public static final String DEFAULT_TAG_NAME_URL = "";
  
  public static final String DEFAULT_TAG_NAME_WH = "";
  
  public static final Integer DEFAULT_TEMPLATE_ID;
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_VALUE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer banner_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String banner_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String obj_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String tag_name;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String tag_name_url;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String tag_name_wh;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer template_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String value;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(119583628, "Ltbclient/FrsPage/Banner;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(119583628, "Ltbclient/FrsPage/Banner;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_BANNER_TYPE = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_TEMPLATE_ID = integer;
  }
  
  public Banner(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str4 = paramBuilder.banner_url;
      if (str4 == null) {
        this.banner_url = "";
      } else {
        this.banner_url = str4;
      } 
      Integer integer3 = paramBuilder.banner_type;
      if (integer3 == null) {
        this.banner_type = DEFAULT_BANNER_TYPE;
      } else {
        this.banner_type = integer3;
      } 
      String str3 = paramBuilder.value;
      if (str3 == null) {
        this.value = "";
      } else {
        this.value = str3;
      } 
      Integer integer2 = paramBuilder.type;
      if (integer2 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer2;
      } 
      String str2 = paramBuilder.desc;
      if (str2 == null) {
        this.desc = "";
      } else {
        this.desc = str2;
      } 
      Integer integer1 = paramBuilder.template_id;
      if (integer1 == null) {
        this.template_id = DEFAULT_TEMPLATE_ID;
      } else {
        this.template_id = integer1;
      } 
      String str1 = paramBuilder.obj_id;
      if (str1 == null) {
        this.obj_id = "";
      } else {
        this.obj_id = str1;
      } 
      str1 = paramBuilder.tag_name;
      if (str1 == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str1;
      } 
      str1 = paramBuilder.tag_name_url;
      if (str1 == null) {
        this.tag_name_url = "";
      } else {
        this.tag_name_url = str1;
      } 
      str = paramBuilder.tag_name_wh;
      if (str == null) {
        this.tag_name_wh = "";
      } else {
        this.tag_name_wh = str;
      } 
    } else {
      this.banner_url = ((Builder)str).banner_url;
      this.banner_type = ((Builder)str).banner_type;
      this.value = ((Builder)str).value;
      this.type = ((Builder)str).type;
      this.desc = ((Builder)str).desc;
      this.template_id = ((Builder)str).template_id;
      this.obj_id = ((Builder)str).obj_id;
      this.tag_name = ((Builder)str).tag_name;
      this.tag_name_url = ((Builder)str).tag_name_url;
      this.tag_name_wh = ((Builder)str).tag_name_wh;
    } 
  }
}
