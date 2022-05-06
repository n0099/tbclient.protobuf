import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BusinessAccountInfo;

public final class BusinessAccountInfo extends Message {
  public static final String DEFAULT_BUSINESS_NAME = "";
  
  public static final String DEFAULT_IDENTIFI_EXPLAIN = "";
  
  public static final Integer DEFAULT_IS_BUSINESS_ACCOUNT;
  
  public static final Integer DEFAULT_IS_FORUM_BUSINESS_ACCOUNT;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String business_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String identifi_explain;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_business_account;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_forum_business_account;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(924253930, "Ltbclient/BusinessAccountInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(924253930, "Ltbclient/BusinessAccountInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_BUSINESS_ACCOUNT = integer;
    DEFAULT_IS_FORUM_BUSINESS_ACCOUNT = integer;
  }
  
  public BusinessAccountInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_business_account;
      if (integer == null) {
        this.is_business_account = DEFAULT_IS_BUSINESS_ACCOUNT;
      } else {
        this.is_business_account = integer;
      } 
      integer = paramBuilder.is_forum_business_account;
      if (integer == null) {
        this.is_forum_business_account = DEFAULT_IS_FORUM_BUSINESS_ACCOUNT;
      } else {
        this.is_forum_business_account = integer;
      } 
      String str1 = paramBuilder.business_name;
      if (str1 == null) {
        this.business_name = "";
      } else {
        this.business_name = str1;
      } 
      str = paramBuilder.identifi_explain;
      if (str == null) {
        this.identifi_explain = "";
      } else {
        this.identifi_explain = str;
      } 
    } else {
      this.is_business_account = ((Builder)str).is_business_account;
      this.is_forum_business_account = ((Builder)str).is_forum_business_account;
      this.business_name = ((Builder)str).business_name;
      this.identifi_explain = ((Builder)str).identifi_explain;
    } 
  }
}
