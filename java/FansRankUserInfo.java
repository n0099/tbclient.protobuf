import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FansRankUserInfo;

public final class FansRankUserInfo extends Message {
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_PRESENT_NUM;
  
  public static final String DEFAULT_PRESENT_SCORES = "";
  
  public static final Integer DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer present_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String present_scores;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1264694804, "Ltbclient/FansRankUserInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1264694804, "Ltbclient/FansRankUserInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_USER_ID = integer;
    DEFAULT_PRESENT_NUM = integer;
  }
  
  public FansRankUserInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.user_id;
      if (integer2 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = integer2;
      } 
      String str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      Integer integer1 = paramBuilder.present_num;
      if (integer1 == null) {
        this.present_num = DEFAULT_PRESENT_NUM;
      } else {
        this.present_num = integer1;
      } 
      String str1 = paramBuilder.present_scores;
      if (str1 == null) {
        this.present_scores = "";
      } else {
        this.present_scores = str1;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
    } else {
      this.user_id = ((Builder)str).user_id;
      this.user_name = ((Builder)str).user_name;
      this.present_num = ((Builder)str).present_num;
      this.present_scores = ((Builder)str).present_scores;
      this.portrait = ((Builder)str).portrait;
    } 
  }
}
