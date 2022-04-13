package DecryptCode;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final Integer DEFAULT_ACITIVITY_ID;
  
  public static final String DEFAULT_BTN_CANCEL = "";
  
  public static final String DEFAULT_BTN_SURE = "";
  
  public static final String DEFAULT_IMG = "";
  
  public static final String DEFAULT_TIPS = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer acitivity_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String btn_cancel;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String btn_sure;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String img;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tips;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1387245628, "Ltbclient/DecryptCode/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1387245628, "Ltbclient/DecryptCode/DataRes;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ACITIVITY_ID = integer;
    DEFAULT_TYPE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.img;
      if (str == null) {
        this.img = "";
      } else {
        this.img = str;
      } 
      str = paramBuilder.tips;
      if (str == null) {
        this.tips = "";
      } else {
        this.tips = str;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
      str = paramBuilder.btn_sure;
      if (str == null) {
        this.btn_sure = "";
      } else {
        this.btn_sure = str;
      } 
      str = paramBuilder.btn_cancel;
      if (str == null) {
        this.btn_cancel = "";
      } else {
        this.btn_cancel = str;
      } 
      Integer integer1 = paramBuilder.acitivity_id;
      if (integer1 == null) {
        this.acitivity_id = DEFAULT_ACITIVITY_ID;
      } else {
        this.acitivity_id = integer1;
      } 
      integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.img = ((Builder)integer).img;
      this.tips = ((Builder)integer).tips;
      this.url = ((Builder)integer).url;
      this.btn_sure = ((Builder)integer).btn_sure;
      this.btn_cancel = ((Builder)integer).btn_cancel;
      this.acitivity_id = ((Builder)integer).acitivity_id;
      this.type = ((Builder)integer).type;
    } 
  }
}
