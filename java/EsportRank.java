import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.EsportRank;
import tbclient.EsportUser;

public final class EsportRank extends Message {
  public static final Integer DEFAULT_RANK = Integer.valueOf(0);
  
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer rank;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 3)
  public final EsportUser user;
  
  public EsportRank(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      Integer integer = paramBuilder.rank;
      if (integer == null) {
        this.rank = DEFAULT_RANK;
      } else {
        this.rank = integer;
      } 
      this.user = paramBuilder.user;
      String str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.rank = ((Builder)str).rank;
      this.user = ((Builder)str).user;
      this.text = ((Builder)str).text;
      this.url = ((Builder)str).url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(488128886, "Ltbclient/EsportRank;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(488128886, "Ltbclient/EsportRank;");
          return;
        } 
      } 
    } 
  }
}
