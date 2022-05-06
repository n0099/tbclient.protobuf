import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.TwAnchorProfitItem;

public final class TwAnchorProfitItem extends Message {
  public static final Integer DEFAULT_AVAILABLE_ANCHOR_LEVEL;
  
  public static final String DEFAULT_ICON_LOCK_URL = "";
  
  public static final String DEFAULT_ICON_UNLOCK_URL = "";
  
  public static final Integer DEFAULT_ID;
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer available_anchor_level;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String icon_lock_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String icon_unlock_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1842997182, "Ltbclient/TwAnchorProfitItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1842997182, "Ltbclient/TwAnchorProfitItem;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
    DEFAULT_AVAILABLE_ANCHOR_LEVEL = integer;
  }
  
  public TwAnchorProfitItem(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      integer = paramBuilder.available_anchor_level;
      if (integer == null) {
        this.available_anchor_level = DEFAULT_AVAILABLE_ANCHOR_LEVEL;
      } else {
        this.available_anchor_level = integer;
      } 
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.icon_unlock_url;
      if (str1 == null) {
        this.icon_unlock_url = "";
      } else {
        this.icon_unlock_url = str1;
      } 
      str = paramBuilder.icon_lock_url;
      if (str == null) {
        this.icon_lock_url = "";
      } else {
        this.icon_lock_url = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.available_anchor_level = ((Builder)str).available_anchor_level;
      this.name = ((Builder)str).name;
      this.icon_unlock_url = ((Builder)str).icon_unlock_url;
      this.icon_lock_url = ((Builder)str).icon_lock_url;
    } 
  }
}
