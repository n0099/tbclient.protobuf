import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.MultipleForum;

public final class MultipleForum extends Message {
  public static final String DEFAULT_BAWU_TYPE = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_BAWU;
  
  public static final Integer DEFAULT_IS_DELETED;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String bawu_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_bawu;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_deleted;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_BAWU = integer;
    DEFAULT_IS_DELETED = integer;
  }
  
  public MultipleForum(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      String str2 = paramBuilder.forum_name;
      if (str2 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str2;
      } 
      Integer integer1 = paramBuilder.is_bawu;
      if (integer1 == null) {
        this.is_bawu = DEFAULT_IS_BAWU;
      } else {
        this.is_bawu = integer1;
      } 
      String str1 = paramBuilder.bawu_type;
      if (str1 == null) {
        this.bawu_type = "";
      } else {
        this.bawu_type = str1;
      } 
      integer = paramBuilder.is_deleted;
      if (integer == null) {
        this.is_deleted = DEFAULT_IS_DELETED;
      } else {
        this.is_deleted = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.is_bawu = ((Builder)integer).is_bawu;
      this.bawu_type = ((Builder)integer).bawu_type;
      this.is_deleted = ((Builder)integer).is_deleted;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1271851820, "Ltbclient/MultipleForum;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1271851820, "Ltbclient/MultipleForum;");
          return;
        } 
      } 
    } 
  }
}
