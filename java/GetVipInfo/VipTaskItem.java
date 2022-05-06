package GetVipInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VipTaskItem extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final Integer DEFAULT_IS_FINISH;
  
  public static final String DEFAULT_LINK = "";
  
  public static final Integer DEFAULT_TASK_ID;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer is_finish;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer task_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(521114358, "Ltbclient/GetVipInfo/VipTaskItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(521114358, "Ltbclient/GetVipInfo/VipTaskItem;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TASK_ID = integer;
    DEFAULT_IS_FINISH = integer;
  }
  
  public VipTaskItem(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.img_url;
      if (str2 == null) {
        this.img_url = "";
      } else {
        this.img_url = str2;
      } 
      Integer integer1 = paramBuilder.task_id;
      if (integer1 == null) {
        this.task_id = DEFAULT_TASK_ID;
      } else {
        this.task_id = integer1;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      str1 = paramBuilder.link;
      if (str1 == null) {
        this.link = "";
      } else {
        this.link = str1;
      } 
      integer = paramBuilder.is_finish;
      if (integer == null) {
        this.is_finish = DEFAULT_IS_FINISH;
      } else {
        this.is_finish = integer;
      } 
    } else {
      this.img_url = ((Builder)integer).img_url;
      this.task_id = ((Builder)integer).task_id;
      this.title = ((Builder)integer).title;
      this.desc = ((Builder)integer).desc;
      this.link = ((Builder)integer).link;
      this.is_finish = ((Builder)integer).is_finish;
    } 
  }
}
