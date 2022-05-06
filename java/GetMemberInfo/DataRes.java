package GetMemberInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForumMember;
import tbclient.GetMemberInfo.ManagerApplyInfo;
import tbclient.GetMemberInfo.MemberGodInfo;
import tbclient.MemberGroupInfo;
import tbclient.PriManagerApplyInfo;

public final class DataRes extends Message {
  public static final Integer DEFAULT_IS_BAWUAPPLY_SHOW;
  
  public static final Integer DEFAULT_IS_PRIVATE_FORUM;
  
  public static final List<MemberGroupInfo> DEFAULT_MEMBER_GROUP_INFO = Collections.emptyList();
  
  @ProtoField(tag = 2)
  public final ForumMember forum_member_info;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer is_bawuapply_show;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_private_forum;
  
  @ProtoField(tag = 4)
  public final ManagerApplyInfo manager_apply_info;
  
  @ProtoField(tag = 3)
  public final MemberGodInfo member_god_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<MemberGroupInfo> member_group_info;
  
  @ProtoField(tag = 7)
  public final PriManagerApplyInfo primanager_apply_info;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_PRIVATE_FORUM = integer;
    DEFAULT_IS_BAWUAPPLY_SHOW = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      List list = paramBuilder.member_group_info;
      if (list == null) {
        this.member_group_info = DEFAULT_MEMBER_GROUP_INFO;
      } else {
        this.member_group_info = Message.immutableCopyOf(list);
      } 
      this.forum_member_info = paramBuilder.forum_member_info;
      this.member_god_info = paramBuilder.member_god_info;
      this.manager_apply_info = paramBuilder.manager_apply_info;
      Integer integer = paramBuilder.is_private_forum;
      if (integer == null) {
        this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
      } else {
        this.is_private_forum = integer;
      } 
      integer = paramBuilder.is_bawuapply_show;
      if (integer == null) {
        this.is_bawuapply_show = DEFAULT_IS_BAWUAPPLY_SHOW;
      } else {
        this.is_bawuapply_show = integer;
      } 
      this.primanager_apply_info = paramBuilder.primanager_apply_info;
    } else {
      this.member_group_info = Message.immutableCopyOf(paramBuilder.member_group_info);
      this.forum_member_info = paramBuilder.forum_member_info;
      this.member_god_info = paramBuilder.member_god_info;
      this.manager_apply_info = paramBuilder.manager_apply_info;
      this.is_private_forum = paramBuilder.is_private_forum;
      this.is_bawuapply_show = paramBuilder.is_bawuapply_show;
      this.primanager_apply_info = paramBuilder.primanager_apply_info;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(777115776, "Ltbclient/GetMemberInfo/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(777115776, "Ltbclient/GetMemberInfo/DataRes;");
          return;
        } 
      } 
    } 
  }
}
