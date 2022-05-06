import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BawuThrones;

public final class BawuThrones extends Message {
  public static final String DEFAULT_BAZHU_LEVEL = "";
  
  public static final Integer DEFAULT_HAS_SEND_BCAST;
  
  public static final Integer DEFAULT_NEWEST_BCAST_PUSHUSER_CNT;
  
  public static final Integer DEFAULT_NEWEST_BCAST_PV;
  
  public static final Integer DEFAULT_TOTAL_BCAST_CNT;
  
  public static final Integer DEFAULT_TOTAL_RECOMMEND_NUM;
  
  public static final Integer DEFAULT_USED_BCAST_CNT;
  
  public static final Integer DEFAULT_USED_RECOMMEND_NUM;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String bazhu_level;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer has_send_bcast;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer newest_bcast_pushuser_cnt;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer newest_bcast_pv;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer total_bcast_cnt;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer total_recommend_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer used_bcast_cnt;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer used_recommend_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1365941833, "Ltbclient/BawuThrones;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1365941833, "Ltbclient/BawuThrones;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TOTAL_RECOMMEND_NUM = integer;
    DEFAULT_USED_RECOMMEND_NUM = integer;
    DEFAULT_USED_BCAST_CNT = integer;
    DEFAULT_TOTAL_BCAST_CNT = integer;
    DEFAULT_NEWEST_BCAST_PV = integer;
    DEFAULT_HAS_SEND_BCAST = integer;
    DEFAULT_NEWEST_BCAST_PUSHUSER_CNT = integer;
  }
  
  public BawuThrones(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.total_recommend_num;
      if (integer2 == null) {
        this.total_recommend_num = DEFAULT_TOTAL_RECOMMEND_NUM;
      } else {
        this.total_recommend_num = integer2;
      } 
      integer2 = paramBuilder.used_recommend_num;
      if (integer2 == null) {
        this.used_recommend_num = DEFAULT_USED_RECOMMEND_NUM;
      } else {
        this.used_recommend_num = integer2;
      } 
      String str = paramBuilder.bazhu_level;
      if (str == null) {
        this.bazhu_level = "";
      } else {
        this.bazhu_level = str;
      } 
      Integer integer1 = paramBuilder.used_bcast_cnt;
      if (integer1 == null) {
        this.used_bcast_cnt = DEFAULT_USED_BCAST_CNT;
      } else {
        this.used_bcast_cnt = integer1;
      } 
      integer1 = paramBuilder.total_bcast_cnt;
      if (integer1 == null) {
        this.total_bcast_cnt = DEFAULT_TOTAL_BCAST_CNT;
      } else {
        this.total_bcast_cnt = integer1;
      } 
      integer1 = paramBuilder.newest_bcast_pv;
      if (integer1 == null) {
        this.newest_bcast_pv = DEFAULT_NEWEST_BCAST_PV;
      } else {
        this.newest_bcast_pv = integer1;
      } 
      integer1 = paramBuilder.has_send_bcast;
      if (integer1 == null) {
        this.has_send_bcast = DEFAULT_HAS_SEND_BCAST;
      } else {
        this.has_send_bcast = integer1;
      } 
      integer = paramBuilder.newest_bcast_pushuser_cnt;
      if (integer == null) {
        this.newest_bcast_pushuser_cnt = DEFAULT_NEWEST_BCAST_PUSHUSER_CNT;
      } else {
        this.newest_bcast_pushuser_cnt = integer;
      } 
    } else {
      this.total_recommend_num = ((Builder)integer).total_recommend_num;
      this.used_recommend_num = ((Builder)integer).used_recommend_num;
      this.bazhu_level = ((Builder)integer).bazhu_level;
      this.used_bcast_cnt = ((Builder)integer).used_bcast_cnt;
      this.total_bcast_cnt = ((Builder)integer).total_bcast_cnt;
      this.newest_bcast_pv = ((Builder)integer).newest_bcast_pv;
      this.has_send_bcast = ((Builder)integer).has_send_bcast;
      this.newest_bcast_pushuser_cnt = ((Builder)integer).newest_bcast_pushuser_cnt;
    } 
  }
}
