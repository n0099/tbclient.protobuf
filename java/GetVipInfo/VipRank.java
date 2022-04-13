package GetVipInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VipRank extends Message {
  public static final String DEFAULT_CARD_ID = "";
  
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final String DEFAULT_CLASS_URL = "";
  
  public static final String DEFAULT_CLASS_URL_NAME = "";
  
  public static final Integer DEFAULT_MY_SCORE_RANK;
  
  public static final Integer DEFAULT_TENDENCY;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String card_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String class_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String class_url_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer my_score_rank;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer tendency;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(931156226, "Ltbclient/GetVipInfo/VipRank;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(931156226, "Ltbclient/GetVipInfo/VipRank;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_MY_SCORE_RANK = integer;
    DEFAULT_TENDENCY = integer;
  }
  
  public VipRank(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.class_name;
      if (str1 == null) {
        this.class_name = "";
      } else {
        this.class_name = str1;
      } 
      str1 = paramBuilder.class_url_name;
      if (str1 == null) {
        this.class_url_name = "";
      } else {
        this.class_url_name = str1;
      } 
      str1 = paramBuilder.class_url;
      if (str1 == null) {
        this.class_url = "";
      } else {
        this.class_url = str1;
      } 
      Integer integer = paramBuilder.my_score_rank;
      if (integer == null) {
        this.my_score_rank = DEFAULT_MY_SCORE_RANK;
      } else {
        this.my_score_rank = integer;
      } 
      integer = paramBuilder.tendency;
      if (integer == null) {
        this.tendency = DEFAULT_TENDENCY;
      } else {
        this.tendency = integer;
      } 
      str = paramBuilder.card_id;
      if (str == null) {
        this.card_id = "";
      } else {
        this.card_id = str;
      } 
    } else {
      this.class_name = ((Builder)str).class_name;
      this.class_url_name = ((Builder)str).class_url_name;
      this.class_url = ((Builder)str).class_url;
      this.my_score_rank = ((Builder)str).my_score_rank;
      this.tendency = ((Builder)str).tendency;
      this.card_id = ((Builder)str).card_id;
    } 
  }
}
