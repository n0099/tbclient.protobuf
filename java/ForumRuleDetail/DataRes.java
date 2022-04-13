package ForumRuleDetail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BawuRoleInfoPub;
import tbclient.ForumInfo;
import tbclient.ForumRule;

public final class DataRes extends Message {
  public static final String DEFAULT_AUDIT_OPINION = "";
  
  public static final Integer DEFAULT_AUDIT_STATUS;
  
  public static final String DEFAULT_CUR_TIME = "";
  
  public static final Long DEFAULT_FORUM_RULE_ID;
  
  public static final Integer DEFAULT_IS_MANAGER;
  
  public static final String DEFAULT_PREFACE = "";
  
  public static final String DEFAULT_PUBLISH_TIME = "";
  
  public static final List<ForumRule> DEFAULT_RULES = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String audit_opinion;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer audit_status;
  
  @ProtoField(tag = 11)
  public final BawuRoleInfoPub bazhu;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String cur_time;
  
  @ProtoField(tag = 2)
  public final ForumInfo forum;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long forum_rule_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_manager;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String preface;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String publish_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<ForumRule> rules;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_AUDIT_STATUS = integer;
    DEFAULT_IS_MANAGER = integer;
    DEFAULT_FORUM_RULE_ID = Long.valueOf(0L);
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.forum = paramBuilder.forum;
      String str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      str3 = paramBuilder.preface;
      if (str3 == null) {
        this.preface = "";
      } else {
        this.preface = str3;
      } 
      List list = paramBuilder.rules;
      if (list == null) {
        this.rules = DEFAULT_RULES;
      } else {
        this.rules = Message.immutableCopyOf(list);
      } 
      Integer integer2 = paramBuilder.audit_status;
      if (integer2 == null) {
        this.audit_status = DEFAULT_AUDIT_STATUS;
      } else {
        this.audit_status = integer2;
      } 
      String str2 = paramBuilder.audit_opinion;
      if (str2 == null) {
        this.audit_opinion = "";
      } else {
        this.audit_opinion = str2;
      } 
      Integer integer1 = paramBuilder.is_manager;
      if (integer1 == null) {
        this.is_manager = DEFAULT_IS_MANAGER;
      } else {
        this.is_manager = integer1;
      } 
      Long long_ = paramBuilder.forum_rule_id;
      if (long_ == null) {
        this.forum_rule_id = DEFAULT_FORUM_RULE_ID;
      } else {
        this.forum_rule_id = long_;
      } 
      String str1 = paramBuilder.publish_time;
      if (str1 == null) {
        this.publish_time = "";
      } else {
        this.publish_time = str1;
      } 
      this.bazhu = paramBuilder.bazhu;
      str = paramBuilder.cur_time;
      if (str == null) {
        this.cur_time = "";
      } else {
        this.cur_time = str;
      } 
    } else {
      this.forum = ((Builder)str).forum;
      this.title = ((Builder)str).title;
      this.preface = ((Builder)str).preface;
      this.rules = Message.immutableCopyOf(((Builder)str).rules);
      this.audit_status = ((Builder)str).audit_status;
      this.audit_opinion = ((Builder)str).audit_opinion;
      this.is_manager = ((Builder)str).is_manager;
      this.forum_rule_id = ((Builder)str).forum_rule_id;
      this.publish_time = ((Builder)str).publish_time;
      this.bazhu = ((Builder)str).bazhu;
      this.cur_time = ((Builder)str).cur_time;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(939414512, "Ltbclient/ForumRuleDetail/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(939414512, "Ltbclient/ForumRuleDetail/DataRes;");
          return;
        } 
      } 
    } 
  }
}
