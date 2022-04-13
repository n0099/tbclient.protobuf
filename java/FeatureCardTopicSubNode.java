import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FeatureCardTopicSubNode;

public final class FeatureCardTopicSubNode extends Message {
  public static final Integer DEFAULT_ARTICLE_NUM;
  
  public static final String DEFAULT_IMAGE = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer article_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer update_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-654452788, "Ltbclient/FeatureCardTopicSubNode;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-654452788, "Ltbclient/FeatureCardTopicSubNode;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_UPDATE_TIME = integer;
    DEFAULT_ARTICLE_NUM = integer;
  }
  
  public FeatureCardTopicSubNode(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.image;
      if (str2 == null) {
        this.image = "";
      } else {
        this.image = str2;
      } 
      Integer integer = paramBuilder.update_time;
      if (integer == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer;
      } 
      integer = paramBuilder.article_num;
      if (integer == null) {
        this.article_num = DEFAULT_ARTICLE_NUM;
      } else {
        this.article_num = integer;
      } 
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
    } else {
      this.image = ((Builder)str).image;
      this.update_time = ((Builder)str).update_time;
      this.article_num = ((Builder)str).article_num;
      this.url = ((Builder)str).url;
      this.title = ((Builder)str).title;
    } 
  }
}
