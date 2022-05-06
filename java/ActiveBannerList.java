import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ActiveBannerList;

public final class ActiveBannerList extends Message {
  public static final String DEFAULT_ACTIVE_DESC = "";
  
  public static final String DEFAULT_ACTIVE_NAME = "";
  
  public static final Integer DEFAULT_ACTIVE_TYPE;
  
  public static final String DEFAULT_ACTIVE_URL = "";
  
  public static final Integer DEFAULT_ID;
  
  public static final String DEFAULT_SKIP_URL = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String active_desc;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String active_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer active_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String active_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String skip_url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(660787457, "Ltbclient/ActiveBannerList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(660787457, "Ltbclient/ActiveBannerList;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
    DEFAULT_ACTIVE_TYPE = integer;
  }
  
  public ActiveBannerList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.id;
      if (integer1 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer1;
      } 
      String str = paramBuilder.active_name;
      if (str == null) {
        this.active_name = "";
      } else {
        this.active_name = str;
      } 
      str = paramBuilder.active_url;
      if (str == null) {
        this.active_url = "";
      } else {
        this.active_url = str;
      } 
      str = paramBuilder.active_desc;
      if (str == null) {
        this.active_desc = "";
      } else {
        this.active_desc = str;
      } 
      str = paramBuilder.skip_url;
      if (str == null) {
        this.skip_url = "";
      } else {
        this.skip_url = str;
      } 
      integer = paramBuilder.active_type;
      if (integer == null) {
        this.active_type = DEFAULT_ACTIVE_TYPE;
      } else {
        this.active_type = integer;
      } 
    } else {
      this.id = ((Builder)integer).id;
      this.active_name = ((Builder)integer).active_name;
      this.active_url = ((Builder)integer).active_url;
      this.active_desc = ((Builder)integer).active_desc;
      this.skip_url = ((Builder)integer).skip_url;
      this.active_type = ((Builder)integer).active_type;
    } 
  }
}
