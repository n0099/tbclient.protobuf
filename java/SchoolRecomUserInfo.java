import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.SchoolRecomUserInfo;

public final class SchoolRecomUserInfo extends Message {
  public static final String DEFAULT_INSTITUTE = "";
  
  public static final Integer DEFAULT_IS_LIKED;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_UID = Long.valueOf(0L);
  
  public static final String DEFAULT_UNAME = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String institute;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer is_liked;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long uid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String uname;
  
  static {
    DEFAULT_IS_LIKED = Integer.valueOf(0);
  }
  
  public SchoolRecomUserInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.uid;
      if (long_ == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_;
      } 
      String str = paramBuilder.uname;
      if (str == null) {
        this.uname = "";
      } else {
        this.uname = str;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
      str = paramBuilder.institute;
      if (str == null) {
        this.institute = "";
      } else {
        this.institute = str;
      } 
      integer = paramBuilder.is_liked;
      if (integer == null) {
        this.is_liked = DEFAULT_IS_LIKED;
      } else {
        this.is_liked = integer;
      } 
    } else {
      this.uid = ((Builder)integer).uid;
      this.uname = ((Builder)integer).uname;
      this.portrait = ((Builder)integer).portrait;
      this.institute = ((Builder)integer).institute;
      this.is_liked = ((Builder)integer).is_liked;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1889951246, "Ltbclient/SchoolRecomUserInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1889951246, "Ltbclient/SchoolRecomUserInfo;");
          return;
        } 
      } 
    } 
  }
}
