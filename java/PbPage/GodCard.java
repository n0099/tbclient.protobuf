package PbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GodCard extends Message {
  public static final String DEFAULT_BUTTON_TEXT = "";
  
  public static final String DEFAULT_BUTTON_URL = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_SHOW_FLOOR = Integer.valueOf(0);
  
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_TIME_EX = "";
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String button_text;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String button_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer show_floor;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String time_ex;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String user_name;
  
  public GodCard(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.user_name;
      if (str == null) {
        this.user_name = "";
      } else {
        this.user_name = str;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
      str = paramBuilder.time_ex;
      if (str == null) {
        this.time_ex = "";
      } else {
        this.time_ex = str;
      } 
      str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
      str = paramBuilder.button_text;
      if (str == null) {
        this.button_text = "";
      } else {
        this.button_text = str;
      } 
      str = paramBuilder.button_url;
      if (str == null) {
        this.button_url = "";
      } else {
        this.button_url = str;
      } 
      integer = paramBuilder.show_floor;
      if (integer == null) {
        this.show_floor = DEFAULT_SHOW_FLOOR;
      } else {
        this.show_floor = integer;
      } 
    } else {
      this.user_name = ((Builder)integer).user_name;
      this.portrait = ((Builder)integer).portrait;
      this.time_ex = ((Builder)integer).time_ex;
      this.text = ((Builder)integer).text;
      this.pic_url = ((Builder)integer).pic_url;
      this.button_text = ((Builder)integer).button_text;
      this.button_url = ((Builder)integer).button_url;
      this.show_floor = ((Builder)integer).show_floor;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1386104653, "Ltbclient/PbPage/GodCard;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1386104653, "Ltbclient/PbPage/GodCard;");
          return;
        } 
      } 
    } 
  }
}
