import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ActInfo;
import tbclient.SeniorLottery;

public final class ActInfo extends Message {
  public static final Integer DEFAULT_ACTIVITY_ID;
  
  public static final Integer DEFAULT_ACTIVITY_TYPE;
  
  public static final Integer DEFAULT_AWARD_ACT_ID;
  
  public static final String DEFAULT_BANNER_IMG = "";
  
  public static final String DEFAULT_BANNER_IMG_SIZE = "";
  
  public static final Integer DEFAULT_BEGIN_TIME;
  
  public static final Integer DEFAULT_COMPONENT_ID;
  
  public static final Integer DEFAULT_END_TIME;
  
  public static final Boolean DEFAULT_IS_SENIOR;
  
  public static final Integer DEFAULT_SHOW_TOTAL_NUM;
  
  public static final Integer DEFAULT_STATUS;
  
  public static final Integer DEFAULT_TOTAL_NUM;
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer activity_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer activity_type;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer award_act_id;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String banner_img;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String banner_img_size;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer begin_time;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer component_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer end_time;
  
  @ProtoField(tag = 10, type = Message.Datatype.BOOL)
  public final Boolean is_senior;
  
  @ProtoField(tag = 13)
  public final SeniorLottery lottery_senior;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer show_total_num;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer total_num;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1411783995, "Ltbclient/ActInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1411783995, "Ltbclient/ActInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ACTIVITY_TYPE = integer;
    DEFAULT_STATUS = integer;
    DEFAULT_BEGIN_TIME = integer;
    DEFAULT_END_TIME = integer;
    DEFAULT_TOTAL_NUM = integer;
    DEFAULT_ACTIVITY_ID = integer;
    DEFAULT_AWARD_ACT_ID = integer;
    DEFAULT_COMPONENT_ID = integer;
    DEFAULT_IS_SENIOR = Boolean.FALSE;
    DEFAULT_SHOW_TOTAL_NUM = integer;
  }
  
  public ActInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.activity_type;
      if (integer2 == null) {
        this.activity_type = DEFAULT_ACTIVITY_TYPE;
      } else {
        this.activity_type = integer2;
      } 
      integer2 = paramBuilder.status;
      if (integer2 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer2;
      } 
      integer2 = paramBuilder.begin_time;
      if (integer2 == null) {
        this.begin_time = DEFAULT_BEGIN_TIME;
      } else {
        this.begin_time = integer2;
      } 
      integer2 = paramBuilder.end_time;
      if (integer2 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = integer2;
      } 
      String str2 = paramBuilder.url;
      if (str2 == null) {
        this.url = "";
      } else {
        this.url = str2;
      } 
      Integer integer1 = paramBuilder.total_num;
      if (integer1 == null) {
        this.total_num = DEFAULT_TOTAL_NUM;
      } else {
        this.total_num = integer1;
      } 
      integer1 = paramBuilder.activity_id;
      if (integer1 == null) {
        this.activity_id = DEFAULT_ACTIVITY_ID;
      } else {
        this.activity_id = integer1;
      } 
      integer1 = paramBuilder.award_act_id;
      if (integer1 == null) {
        this.award_act_id = DEFAULT_AWARD_ACT_ID;
      } else {
        this.award_act_id = integer1;
      } 
      integer1 = paramBuilder.component_id;
      if (integer1 == null) {
        this.component_id = DEFAULT_COMPONENT_ID;
      } else {
        this.component_id = integer1;
      } 
      Boolean bool = paramBuilder.is_senior;
      if (bool == null) {
        this.is_senior = DEFAULT_IS_SENIOR;
      } else {
        this.is_senior = bool;
      } 
      String str1 = paramBuilder.banner_img;
      if (str1 == null) {
        this.banner_img = "";
      } else {
        this.banner_img = str1;
      } 
      str1 = paramBuilder.banner_img_size;
      if (str1 == null) {
        this.banner_img_size = "";
      } else {
        this.banner_img_size = str1;
      } 
      this.lottery_senior = paramBuilder.lottery_senior;
      integer = paramBuilder.show_total_num;
      if (integer == null) {
        this.show_total_num = DEFAULT_SHOW_TOTAL_NUM;
      } else {
        this.show_total_num = integer;
      } 
    } else {
      this.activity_type = ((Builder)integer).activity_type;
      this.status = ((Builder)integer).status;
      this.begin_time = ((Builder)integer).begin_time;
      this.end_time = ((Builder)integer).end_time;
      this.url = ((Builder)integer).url;
      this.total_num = ((Builder)integer).total_num;
      this.activity_id = ((Builder)integer).activity_id;
      this.award_act_id = ((Builder)integer).award_act_id;
      this.component_id = ((Builder)integer).component_id;
      this.is_senior = ((Builder)integer).is_senior;
      this.banner_img = ((Builder)integer).banner_img;
      this.banner_img_size = ((Builder)integer).banner_img_size;
      this.lottery_senior = ((Builder)integer).lottery_senior;
      this.show_total_num = ((Builder)integer).show_total_num;
    } 
  }
}
