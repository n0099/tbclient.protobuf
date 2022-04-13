import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FineBannerPb;

public final class FineBannerPb extends Message {
  public static final Long DEFAULT_FTID = Long.valueOf(0L);
  
  public static final String DEFAULT_LINK_URL = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long ftid;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String link_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public FineBannerPb(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.ftid;
      if (long_ == null) {
        this.ftid = DEFAULT_FTID;
      } else {
        this.ftid = long_;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.pic_url;
      if (str1 == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str1;
      } 
      str = paramBuilder.link_url;
      if (str == null) {
        this.link_url = "";
      } else {
        this.link_url = str;
      } 
    } else {
      this.ftid = ((Builder)str).ftid;
      this.title = ((Builder)str).title;
      this.pic_url = ((Builder)str).pic_url;
      this.link_url = ((Builder)str).link_url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2125494151, "Ltbclient/FineBannerPb;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2125494151, "Ltbclient/FineBannerPb;");
          return;
        } 
      } 
    } 
  }
}
