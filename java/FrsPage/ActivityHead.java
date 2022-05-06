package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsPage.HeadImgs;
import tbclient.FrsPage.Size;

public final class ActivityHead extends Message {
  public static final String DEFAULT_ACTIVITY_TITLE = "";
  
  public static final Integer DEFAULT_ACTIVITY_TYPE;
  
  public static final List<HeadImgs> DEFAULT_HEAD_IMGS = Collections.emptyList();
  
  public static final Boolean DEFAULT_IS_AD;
  
  public static final String DEFAULT_OBJ_ID = "";
  
  public static final String DEFAULT_PULL_DOWN_CLICK_URL = "";
  
  public static final String DEFAULT_PULL_DOWN_EXPOSURE_URL = "";
  
  public static final Integer DEFAULT_PULL_DOWN_INTERVAL;
  
  public static final String DEFAULT_PULL_DOWN_PACKAGE_NAME = "";
  
  public static final String DEFAULT_PULL_DOWN_PIC_ANDROID = "";
  
  public static final String DEFAULT_PULL_DOWN_PIC_IOS = "";
  
  public static final String DEFAULT_PULL_DOWN_SCHEMA = "";
  
  public static final String DEFAULT_PULL_DOWN_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String activity_title;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer activity_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<HeadImgs> head_imgs;
  
  @ProtoField(tag = 13, type = Message.Datatype.BOOL)
  public final Boolean is_ad;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String obj_id;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String pull_down_click_url;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String pull_down_exposure_url;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer pull_down_interval;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String pull_down_package_name;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String pull_down_pic_android;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String pull_down_pic_ios;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String pull_down_schema;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String pull_down_url;
  
  @ProtoField(tag = 4)
  public final Size top_size;
  
  static {
    DEFAULT_PULL_DOWN_INTERVAL = integer;
    DEFAULT_IS_AD = Boolean.FALSE;
  }
  
  public ActivityHead(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.activity_type;
      if (integer2 == null) {
        this.activity_type = DEFAULT_ACTIVITY_TYPE;
      } else {
        this.activity_type = integer2;
      } 
      String str4 = paramBuilder.activity_title;
      if (str4 == null) {
        this.activity_title = "";
      } else {
        this.activity_title = str4;
      } 
      List list = paramBuilder.head_imgs;
      if (list == null) {
        this.head_imgs = DEFAULT_HEAD_IMGS;
      } else {
        this.head_imgs = Message.immutableCopyOf(list);
      } 
      this.top_size = paramBuilder.top_size;
      String str3 = paramBuilder.obj_id;
      if (str3 == null) {
        this.obj_id = "";
      } else {
        this.obj_id = str3;
      } 
      str3 = paramBuilder.pull_down_url;
      if (str3 == null) {
        this.pull_down_url = "";
      } else {
        this.pull_down_url = str3;
      } 
      Integer integer1 = paramBuilder.pull_down_interval;
      if (integer1 == null) {
        this.pull_down_interval = DEFAULT_PULL_DOWN_INTERVAL;
      } else {
        this.pull_down_interval = integer1;
      } 
      String str2 = paramBuilder.pull_down_pic_ios;
      if (str2 == null) {
        this.pull_down_pic_ios = "";
      } else {
        this.pull_down_pic_ios = str2;
      } 
      str2 = paramBuilder.pull_down_pic_android;
      if (str2 == null) {
        this.pull_down_pic_android = "";
      } else {
        this.pull_down_pic_android = str2;
      } 
      str2 = paramBuilder.pull_down_exposure_url;
      if (str2 == null) {
        this.pull_down_exposure_url = "";
      } else {
        this.pull_down_exposure_url = str2;
      } 
      str2 = paramBuilder.pull_down_click_url;
      if (str2 == null) {
        this.pull_down_click_url = "";
      } else {
        this.pull_down_click_url = str2;
      } 
      Boolean bool = paramBuilder.is_ad;
      if (bool == null) {
        this.is_ad = DEFAULT_IS_AD;
      } else {
        this.is_ad = bool;
      } 
      String str1 = paramBuilder.pull_down_schema;
      if (str1 == null) {
        this.pull_down_schema = "";
      } else {
        this.pull_down_schema = str1;
      } 
      str = paramBuilder.pull_down_package_name;
      if (str == null) {
        this.pull_down_package_name = "";
      } else {
        this.pull_down_package_name = str;
      } 
    } else {
      this.activity_type = ((Builder)str).activity_type;
      this.activity_title = ((Builder)str).activity_title;
      this.head_imgs = Message.immutableCopyOf(((Builder)str).head_imgs);
      this.top_size = ((Builder)str).top_size;
      this.obj_id = ((Builder)str).obj_id;
      this.pull_down_url = ((Builder)str).pull_down_url;
      this.pull_down_interval = ((Builder)str).pull_down_interval;
      this.pull_down_pic_ios = ((Builder)str).pull_down_pic_ios;
      this.pull_down_pic_android = ((Builder)str).pull_down_pic_android;
      this.pull_down_exposure_url = ((Builder)str).pull_down_exposure_url;
      this.pull_down_click_url = ((Builder)str).pull_down_click_url;
      this.is_ad = ((Builder)str).is_ad;
      this.pull_down_schema = ((Builder)str).pull_down_schema;
      this.pull_down_package_name = ((Builder)str).pull_down_package_name;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1127712823, "Ltbclient/FrsPage/ActivityHead;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1127712823, "Ltbclient/FrsPage/ActivityHead;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ACTIVITY_TYPE = integer;
  }
}
