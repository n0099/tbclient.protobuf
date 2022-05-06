package GetVipInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VipSpecialItem extends Message {
  public static final String DEFAULT_BUTTON_TEXT_FINISH = "";
  
  public static final String DEFAULT_BUTTON_TEXT_INITIAL = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_DESC_EXT = "";
  
  public static final Integer DEFAULT_ID;
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final Integer DEFAULT_IS_FINISH;
  
  public static final String DEFAULT_LINK = "";
  
  public static final Integer DEFAULT_TASK_ID;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_UPDATE_TIME = "";
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String button_text_finish;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String button_text_initial;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String desc_ext;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer is_finish;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer task_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String update_time;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1645048700, "Ltbclient/GetVipInfo/VipSpecialItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1645048700, "Ltbclient/GetVipInfo/VipSpecialItem;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_TASK_ID = integer;
    DEFAULT_IS_FINISH = integer;
  }
  
  public VipSpecialItem(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str3 = paramBuilder.img_url;
      if (str3 == null) {
        this.img_url = "";
      } else {
        this.img_url = str3;
      } 
      str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      str3 = paramBuilder.desc;
      if (str3 == null) {
        this.desc = "";
      } else {
        this.desc = str3;
      } 
      str3 = paramBuilder.link;
      if (str3 == null) {
        this.link = "";
      } else {
        this.link = str3;
      } 
      str3 = paramBuilder.update_time;
      if (str3 == null) {
        this.update_time = "";
      } else {
        this.update_time = str3;
      } 
      Integer integer2 = paramBuilder.id;
      if (integer2 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer2;
      } 
      integer2 = paramBuilder.type;
      if (integer2 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer2;
      } 
      String str2 = paramBuilder.desc_ext;
      if (str2 == null) {
        this.desc_ext = "";
      } else {
        this.desc_ext = str2;
      } 
      Integer integer1 = paramBuilder.task_id;
      if (integer1 == null) {
        this.task_id = DEFAULT_TASK_ID;
      } else {
        this.task_id = integer1;
      } 
      integer1 = paramBuilder.is_finish;
      if (integer1 == null) {
        this.is_finish = DEFAULT_IS_FINISH;
      } else {
        this.is_finish = integer1;
      } 
      String str1 = paramBuilder.button_text_initial;
      if (str1 == null) {
        this.button_text_initial = "";
      } else {
        this.button_text_initial = str1;
      } 
      str = paramBuilder.button_text_finish;
      if (str == null) {
        this.button_text_finish = "";
      } else {
        this.button_text_finish = str;
      } 
    } else {
      this.img_url = ((Builder)str).img_url;
      this.title = ((Builder)str).title;
      this.desc = ((Builder)str).desc;
      this.link = ((Builder)str).link;
      this.update_time = ((Builder)str).update_time;
      this.id = ((Builder)str).id;
      this.type = ((Builder)str).type;
      this.desc_ext = ((Builder)str).desc_ext;
      this.task_id = ((Builder)str).task_id;
      this.is_finish = ((Builder)str).is_finish;
      this.button_text_initial = ((Builder)str).button_text_initial;
      this.button_text_finish = ((Builder)str).button_text_finish;
    } 
  }
}
