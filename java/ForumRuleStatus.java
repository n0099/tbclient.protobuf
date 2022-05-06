import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ForumRuleStatus;

public final class ForumRuleStatus extends Message {
  public static final Integer DEFAULT_AUDIT_STATUS;
  
  public static final Integer DEFAULT_HAS_FORUM_RULE;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer audit_status;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer has_forum_rule;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2108353782, "Ltbclient/ForumRuleStatus;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2108353782, "Ltbclient/ForumRuleStatus;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_AUDIT_STATUS = integer;
    DEFAULT_HAS_FORUM_RULE = integer;
  }
  
  public ForumRuleStatus(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      Integer integer1 = paramBuilder.audit_status;
      if (integer1 == null) {
        this.audit_status = DEFAULT_AUDIT_STATUS;
      } else {
        this.audit_status = integer1;
      } 
      integer = paramBuilder.has_forum_rule;
      if (integer == null) {
        this.has_forum_rule = DEFAULT_HAS_FORUM_RULE;
      } else {
        this.has_forum_rule = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.audit_status = ((Builder)integer).audit_status;
      this.has_forum_rule = ((Builder)integer).has_forum_rule;
    } 
  }
}
