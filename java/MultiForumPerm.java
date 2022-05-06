import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.MultiForumPerm;

public final class MultiForumPerm extends Message {
  public static final String DEFAULT_BAWU_TYPE = "";
  
  public static final Integer DEFAULT_IS_BAWU;
  
  public static final Integer DEFAULT_IS_BLOCK_BAWU_DELETE;
  
  public static final Integer DEFAULT_IS_DELETED;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String bawu_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_bawu;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_block_bawu_delete;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_deleted;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1914072729, "Ltbclient/MultiForumPerm;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1914072729, "Ltbclient/MultiForumPerm;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_BAWU = integer;
    DEFAULT_IS_DELETED = integer;
    DEFAULT_IS_BLOCK_BAWU_DELETE = integer;
  }
  
  public MultiForumPerm(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.is_bawu;
      if (integer2 == null) {
        this.is_bawu = DEFAULT_IS_BAWU;
      } else {
        this.is_bawu = integer2;
      } 
      String str = paramBuilder.bawu_type;
      if (str == null) {
        this.bawu_type = "";
      } else {
        this.bawu_type = str;
      } 
      Integer integer1 = paramBuilder.is_deleted;
      if (integer1 == null) {
        this.is_deleted = DEFAULT_IS_DELETED;
      } else {
        this.is_deleted = integer1;
      } 
      integer = paramBuilder.is_block_bawu_delete;
      if (integer == null) {
        this.is_block_bawu_delete = DEFAULT_IS_BLOCK_BAWU_DELETE;
      } else {
        this.is_block_bawu_delete = integer;
      } 
    } else {
      this.is_bawu = ((Builder)integer).is_bawu;
      this.bawu_type = ((Builder)integer).bawu_type;
      this.is_deleted = ((Builder)integer).is_deleted;
      this.is_block_bawu_delete = ((Builder)integer).is_block_bawu_delete;
    } 
  }
}
