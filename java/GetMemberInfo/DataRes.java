package tbclient.GetMemberInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForumMember;
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
    super(paramBuilder);
    if (paramBoolean == true) {
      List<MemberGroupInfo> list = paramBuilder.member_group_info;
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
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public ForumMember forum_member_info;
    
    public Integer is_bawuapply_show;
    
    public Integer is_private_forum;
    
    public ManagerApplyInfo manager_apply_info;
    
    public MemberGodInfo member_god_info;
    
    public List<MemberGroupInfo> member_group_info;
    
    public PriManagerApplyInfo primanager_apply_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.member_group_info = Message.copyOf(param1DataRes.member_group_info);
      this.forum_member_info = param1DataRes.forum_member_info;
      this.member_god_info = param1DataRes.member_god_info;
      this.manager_apply_info = param1DataRes.manager_apply_info;
      this.is_private_forum = param1DataRes.is_private_forum;
      this.is_bawuapply_show = param1DataRes.is_bawuapply_show;
      this.primanager_apply_info = param1DataRes.primanager_apply_info;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
