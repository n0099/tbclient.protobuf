package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ActivityConfig extends Message {
  public static final Long DEFAULT_ACTIVITY_ID;
  
  public static final String DEFAULT_ADDTHREAD_ICON = "";
  
  public static final String DEFAULT_ADDTHREAD_TEXT = "";
  
  public static final String DEFAULT_AGREED_ICON = "";
  
  public static final String DEFAULT_AGREE_ICON = "";
  
  public static final String DEFAULT_NIGHT_ADDTHREAD_ICON = "";
  
  public static final String DEFAULT_NIGHT_AGREED_ICON = "";
  
  public static final String DEFAULT_NIGHT_AGREE_ICON = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT64)
  public final Long activity_id;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String addthread_icon;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String addthread_text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String agree_icon;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String agreed_icon;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String night_addthread_icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String night_agree_icon;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String night_agreed_icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  static {
    DEFAULT_ACTIVITY_ID = Long.valueOf(0L);
  }
  
  public ActivityConfig(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      String str2 = paramBuilder.agree_icon;
      if (str2 == null) {
        this.agree_icon = "";
      } else {
        this.agree_icon = str2;
      } 
      str2 = paramBuilder.night_agree_icon;
      if (str2 == null) {
        this.night_agree_icon = "";
      } else {
        this.night_agree_icon = str2;
      } 
      str2 = paramBuilder.agreed_icon;
      if (str2 == null) {
        this.agreed_icon = "";
      } else {
        this.agreed_icon = str2;
      } 
      str2 = paramBuilder.night_agreed_icon;
      if (str2 == null) {
        this.night_agreed_icon = "";
      } else {
        this.night_agreed_icon = str2;
      } 
      Long long_ = paramBuilder.activity_id;
      if (long_ == null) {
        this.activity_id = DEFAULT_ACTIVITY_ID;
      } else {
        this.activity_id = long_;
      } 
      String str1 = paramBuilder.addthread_icon;
      if (str1 == null) {
        this.addthread_icon = "";
      } else {
        this.addthread_icon = str1;
      } 
      str1 = paramBuilder.night_addthread_icon;
      if (str1 == null) {
        this.night_addthread_icon = "";
      } else {
        this.night_addthread_icon = str1;
      } 
      str = paramBuilder.addthread_text;
      if (str == null) {
        this.addthread_text = "";
      } else {
        this.addthread_text = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.agree_icon = ((Builder)str).agree_icon;
      this.night_agree_icon = ((Builder)str).night_agree_icon;
      this.agreed_icon = ((Builder)str).agreed_icon;
      this.night_agreed_icon = ((Builder)str).night_agreed_icon;
      this.activity_id = ((Builder)str).activity_id;
      this.addthread_icon = ((Builder)str).addthread_icon;
      this.night_addthread_icon = ((Builder)str).night_addthread_icon;
      this.addthread_text = ((Builder)str).addthread_text;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1244411097, "Ltbclient/FrsPage/ActivityConfig;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1244411097, "Ltbclient/FrsPage/ActivityConfig;");
          return;
        } 
      } 
    } 
  }
}
