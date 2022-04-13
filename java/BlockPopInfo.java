import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BlockPopInfo;

public final class BlockPopInfo extends Message {
  public static final String DEFAULT_AHEAD_INFO = "";
  
  public static final Integer DEFAULT_AHEAD_TYPE;
  
  public static final String DEFAULT_AHEAD_URL = "";
  
  public static final String DEFAULT_APPEAL_MSG = "";
  
  public static final Integer DEFAULT_APPEAL_STATUS;
  
  public static final String DEFAULT_BLOCK_INFO = "";
  
  public static final Integer DEFAULT_CAN_POST;
  
  public static final String DEFAULT_OK_INFO = "";
  
  public static final String DEFAULT_SUB_BLOCK_INFO = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String ahead_info;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer ahead_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String ahead_url;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String appeal_msg;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer appeal_status;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String block_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer can_post;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String ok_info;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String sub_block_info;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1703946113, "Ltbclient/BlockPopInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1703946113, "Ltbclient/BlockPopInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_CAN_POST = integer;
    DEFAULT_AHEAD_TYPE = integer;
    DEFAULT_APPEAL_STATUS = integer;
  }
  
  public BlockPopInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.can_post;
      if (integer2 == null) {
        this.can_post = DEFAULT_CAN_POST;
      } else {
        this.can_post = integer2;
      } 
      String str2 = paramBuilder.block_info;
      if (str2 == null) {
        this.block_info = "";
      } else {
        this.block_info = str2;
      } 
      str2 = paramBuilder.ahead_info;
      if (str2 == null) {
        this.ahead_info = "";
      } else {
        this.ahead_info = str2;
      } 
      str2 = paramBuilder.ahead_url;
      if (str2 == null) {
        this.ahead_url = "";
      } else {
        this.ahead_url = str2;
      } 
      str2 = paramBuilder.ok_info;
      if (str2 == null) {
        this.ok_info = "";
      } else {
        this.ok_info = str2;
      } 
      Integer integer1 = paramBuilder.ahead_type;
      if (integer1 == null) {
        this.ahead_type = DEFAULT_AHEAD_TYPE;
      } else {
        this.ahead_type = integer1;
      } 
      integer1 = paramBuilder.appeal_status;
      if (integer1 == null) {
        this.appeal_status = DEFAULT_APPEAL_STATUS;
      } else {
        this.appeal_status = integer1;
      } 
      String str1 = paramBuilder.appeal_msg;
      if (str1 == null) {
        this.appeal_msg = "";
      } else {
        this.appeal_msg = str1;
      } 
      str = paramBuilder.sub_block_info;
      if (str == null) {
        this.sub_block_info = "";
      } else {
        this.sub_block_info = str;
      } 
    } else {
      this.can_post = ((Builder)str).can_post;
      this.block_info = ((Builder)str).block_info;
      this.ahead_info = ((Builder)str).ahead_info;
      this.ahead_url = ((Builder)str).ahead_url;
      this.ok_info = ((Builder)str).ok_info;
      this.ahead_type = ((Builder)str).ahead_type;
      this.appeal_status = ((Builder)str).appeal_status;
      this.appeal_msg = ((Builder)str).appeal_msg;
      this.sub_block_info = ((Builder)str).sub_block_info;
    } 
  }
}
