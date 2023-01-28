package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MyGroupInfo extends Message {
  public static final Long DEFAULT_GROUP_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_GROUP_NAME = "";
  
  public static final Integer DEFAULT_MAX_MEMBER_NUM;
  
  public static final Integer DEFAULT_MEMBER_NUM;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long group_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String group_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer max_member_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer member_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_MEMBER_NUM = integer;
    DEFAULT_MAX_MEMBER_NUM = integer;
  }
  
  public MyGroupInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.group_id;
      if (long_ == null) {
        this.group_id = DEFAULT_GROUP_ID;
      } else {
        this.group_id = long_;
      } 
      String str = paramBuilder.group_name;
      if (str == null) {
        this.group_name = "";
      } else {
        this.group_name = str;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
      Integer integer1 = paramBuilder.member_num;
      if (integer1 == null) {
        this.member_num = DEFAULT_MEMBER_NUM;
      } else {
        this.member_num = integer1;
      } 
      integer = paramBuilder.max_member_num;
      if (integer == null) {
        this.max_member_num = DEFAULT_MAX_MEMBER_NUM;
      } else {
        this.max_member_num = integer;
      } 
    } else {
      this.group_id = ((Builder)integer).group_id;
      this.group_name = ((Builder)integer).group_name;
      this.portrait = ((Builder)integer).portrait;
      this.member_num = ((Builder)integer).member_num;
      this.max_member_num = ((Builder)integer).max_member_num;
    } 
  }
  
  public MyGroupInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MyGroupInfo> {
    public Long group_id;
    
    public String group_name;
    
    public Integer max_member_num;
    
    public Integer member_num;
    
    public String portrait;
    
    public Builder() {}
    
    public Builder(MyGroupInfo param1MyGroupInfo) {
      super(param1MyGroupInfo);
      if (param1MyGroupInfo == null)
        return; 
      this.group_id = param1MyGroupInfo.group_id;
      this.group_name = param1MyGroupInfo.group_name;
      this.portrait = param1MyGroupInfo.portrait;
      this.member_num = param1MyGroupInfo.member_num;
      this.max_member_num = param1MyGroupInfo.max_member_num;
    }
    
    public MyGroupInfo build(boolean param1Boolean) {
      return new MyGroupInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
