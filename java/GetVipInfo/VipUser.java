package GetVipInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GetVipInfo.VipInfo;
import tbclient.GetVipInfo.VipParrScores;
import tbclient.GetVipInfo.VipPayMemberInfo;

public final class VipUser extends Message {
  public static final String DEFAULT_CARD_ID = "";
  
  public static final Long DEFAULT_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final Integer DEFAULT_NOW_TIME;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_SPEED_LINK = "";
  
  public static final Integer DEFAULT_TASK_SCORES;
  
  public static final String DEFAULT_TASK_SCORES_LINK = "";
  
  public static final String DEFAULT_TOTAL_SCORES_LINK = "";
  
  public static final String DEFAULT_VIP_LINK = "";
  
  @ProtoField(tag = 8)
  public final VipParrScores Parr_scores;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String card_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer now_time;
  
  @ProtoField(tag = 5)
  public final VipPayMemberInfo pay_member_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String speed_link;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer task_scores;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String task_scores_link;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String total_scores_link;
  
  @ProtoField(tag = 6)
  public final VipInfo vipInfo;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String vip_link;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_NOW_TIME = integer;
    DEFAULT_TASK_SCORES = integer;
  }
  
  public VipUser(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str3 = paramBuilder.name;
      if (str3 == null) {
        this.name = "";
      } else {
        this.name = str3;
      } 
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      String str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      str2 = paramBuilder.name_show;
      if (str2 == null) {
        this.name_show = "";
      } else {
        this.name_show = str2;
      } 
      this.pay_member_info = paramBuilder.pay_member_info;
      this.vipInfo = paramBuilder.vipInfo;
      Integer integer = paramBuilder.now_time;
      if (integer == null) {
        this.now_time = DEFAULT_NOW_TIME;
      } else {
        this.now_time = integer;
      } 
      this.Parr_scores = paramBuilder.Parr_scores;
      integer = paramBuilder.task_scores;
      if (integer == null) {
        this.task_scores = DEFAULT_TASK_SCORES;
      } else {
        this.task_scores = integer;
      } 
      String str1 = paramBuilder.total_scores_link;
      if (str1 == null) {
        this.total_scores_link = "";
      } else {
        this.total_scores_link = str1;
      } 
      str1 = paramBuilder.speed_link;
      if (str1 == null) {
        this.speed_link = "";
      } else {
        this.speed_link = str1;
      } 
      str1 = paramBuilder.task_scores_link;
      if (str1 == null) {
        this.task_scores_link = "";
      } else {
        this.task_scores_link = str1;
      } 
      str1 = paramBuilder.vip_link;
      if (str1 == null) {
        this.vip_link = "";
      } else {
        this.vip_link = str1;
      } 
      str = paramBuilder.card_id;
      if (str == null) {
        this.card_id = "";
      } else {
        this.card_id = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.id = ((Builder)str).id;
      this.portrait = ((Builder)str).portrait;
      this.name_show = ((Builder)str).name_show;
      this.pay_member_info = ((Builder)str).pay_member_info;
      this.vipInfo = ((Builder)str).vipInfo;
      this.now_time = ((Builder)str).now_time;
      this.Parr_scores = ((Builder)str).Parr_scores;
      this.task_scores = ((Builder)str).task_scores;
      this.total_scores_link = ((Builder)str).total_scores_link;
      this.speed_link = ((Builder)str).speed_link;
      this.task_scores_link = ((Builder)str).task_scores_link;
      this.vip_link = ((Builder)str).vip_link;
      this.card_id = ((Builder)str).card_id;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(934454595, "Ltbclient/GetVipInfo/VipUser;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(934454595, "Ltbclient/GetVipInfo/VipUser;");
          return;
        } 
      } 
    } 
  }
}
