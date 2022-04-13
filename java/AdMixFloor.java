import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AdMixFloor;

public final class AdMixFloor extends Message {
  public static final Long DEFAULT_AD_ID;
  
  public static final Integer DEFAULT_AD_TYPE;
  
  public static final Integer DEFAULT_FLOOR_NUM;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long ad_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer ad_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer floor_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1259284706, "Ltbclient/AdMixFloor;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1259284706, "Ltbclient/AdMixFloor;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_AD_TYPE = integer;
    DEFAULT_FLOOR_NUM = integer;
    DEFAULT_AD_ID = Long.valueOf(0L);
  }
  
  public AdMixFloor(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.ad_type;
      if (integer == null) {
        this.ad_type = DEFAULT_AD_TYPE;
      } else {
        this.ad_type = integer;
      } 
      integer = paramBuilder.floor_num;
      if (integer == null) {
        this.floor_num = DEFAULT_FLOOR_NUM;
      } else {
        this.floor_num = integer;
      } 
      long_ = paramBuilder.ad_id;
      if (long_ == null) {
        this.ad_id = DEFAULT_AD_ID;
      } else {
        this.ad_id = long_;
      } 
    } else {
      this.ad_type = ((Builder)long_).ad_type;
      this.floor_num = ((Builder)long_).floor_num;
      this.ad_id = ((Builder)long_).ad_id;
    } 
  }
}
