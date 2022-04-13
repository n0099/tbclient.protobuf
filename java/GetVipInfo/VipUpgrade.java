package GetVipInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VipUpgrade extends Message {
  public static final String DEFAULT_BUTTON = "";
  
  public static final String DEFAULT_CARD_ID = "";
  
  public static final String DEFAULT_EXPIRE = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final Integer DEFAULT_NORMAL;
  
  public static final Integer DEFAULT_PAY;
  
  public static final String DEFAULT_SVIP = "";
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String button;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String card_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String expire;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer normal;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer pay;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String svip;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String text;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(49772876, "Ltbclient/GetVipInfo/VipUpgrade;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(49772876, "Ltbclient/GetVipInfo/VipUpgrade;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_NORMAL = integer;
    DEFAULT_PAY = integer;
  }
  
  public VipUpgrade(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.normal;
      if (integer == null) {
        this.normal = DEFAULT_NORMAL;
      } else {
        this.normal = integer;
      } 
      integer = paramBuilder.pay;
      if (integer == null) {
        this.pay = DEFAULT_PAY;
      } else {
        this.pay = integer;
      } 
      String str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      str1 = paramBuilder.button;
      if (str1 == null) {
        this.button = "";
      } else {
        this.button = str1;
      } 
      str1 = paramBuilder.link;
      if (str1 == null) {
        this.link = "";
      } else {
        this.link = str1;
      } 
      str1 = paramBuilder.svip;
      if (str1 == null) {
        this.svip = "";
      } else {
        this.svip = str1;
      } 
      str1 = paramBuilder.expire;
      if (str1 == null) {
        this.expire = "";
      } else {
        this.expire = str1;
      } 
      str = paramBuilder.card_id;
      if (str == null) {
        this.card_id = "";
      } else {
        this.card_id = str;
      } 
    } else {
      this.normal = ((Builder)str).normal;
      this.pay = ((Builder)str).pay;
      this.text = ((Builder)str).text;
      this.button = ((Builder)str).button;
      this.link = ((Builder)str).link;
      this.svip = ((Builder)str).svip;
      this.expire = ((Builder)str).expire;
      this.card_id = ((Builder)str).card_id;
    } 
  }
}
