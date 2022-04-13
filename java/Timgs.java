import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Timgs;

public final class Timgs extends Message {
  public static final String DEFAULT_BIG_CDN_URL = "";
  
  public static final String DEFAULT_BSIZE = "";
  
  public static final String DEFAULT_DES_MAIN = "";
  
  public static final String DEFAULT_DES_SUB = "";
  
  public static final Integer DEFAULT_FLAG = Integer.valueOf(0);
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String big_cdn_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String bsize;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String des_main;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String des_sub;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer flag;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public Timgs(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.img_url;
      if (str2 == null) {
        this.img_url = "";
      } else {
        this.img_url = str2;
      } 
      str2 = paramBuilder.url;
      if (str2 == null) {
        this.url = "";
      } else {
        this.url = str2;
      } 
      Integer integer = paramBuilder.flag;
      if (integer == null) {
        this.flag = DEFAULT_FLAG;
      } else {
        this.flag = integer;
      } 
      String str1 = paramBuilder.des_main;
      if (str1 == null) {
        this.des_main = "";
      } else {
        this.des_main = str1;
      } 
      str1 = paramBuilder.des_sub;
      if (str1 == null) {
        this.des_sub = "";
      } else {
        this.des_sub = str1;
      } 
      str1 = paramBuilder.bsize;
      if (str1 == null) {
        this.bsize = "";
      } else {
        this.bsize = str1;
      } 
      str = paramBuilder.big_cdn_url;
      if (str == null) {
        this.big_cdn_url = "";
      } else {
        this.big_cdn_url = str;
      } 
    } else {
      this.img_url = ((Builder)str).img_url;
      this.url = ((Builder)str).url;
      this.flag = ((Builder)str).flag;
      this.des_main = ((Builder)str).des_main;
      this.des_sub = ((Builder)str).des_sub;
      this.bsize = ((Builder)str).bsize;
      this.big_cdn_url = ((Builder)str).big_cdn_url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(655108769, "Ltbclient/Timgs;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(655108769, "Ltbclient/Timgs;");
          return;
        } 
      } 
    } 
  }
}
